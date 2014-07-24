package edu.kit.ipd.sdq.xtend2m.mwe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Scopes;

import edu.kit.ipd.sdq.xtend2m.annotations.Transformation;
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface;
import edu.kit.ipd.sdq.xtend2m.api.Config;
import edu.kit.ipd.sdq.xtend2m.api.ImportChecker;
import edu.kit.ipd.sdq.xtend2m.api.MainMethod;
import edu.kit.ipd.sdq.xtend2m.api.ModuleFactory;
import edu.kit.ipd.sdq.xtend2m.api.StarImportChecker;
import edu.kit.ipd.sdq.xtend2m.api.TracingAPI;
import edu.kit.ipd.sdq.xtend2m.api.exceptions.MainMethodNotFoundException;
import edu.kit.ipd.sdq.xtend2m.api.exceptions.TransformationAnnotationNotFoundException;

/**
 * Workflow component that allows a developer to configure a
 * modular model transformation by configuring input, output and
 * the global configuration and adding transformation modules.
 */
public class ModuleLoader extends AbstractWorkflowComponent2 {
	private Config config = new Config();

	private List<String> inputs = new ArrayList<String>();
	private List<OutputElement> outputs = new ArrayList<OutputElement>();
	
	private final List<Class<?>> modules = new ArrayList<Class<?>>();
	private Registry registry = EPackage.Registry.INSTANCE;
	
	/**
	 * Add another input slot to the model transformation.
	 * @param input the new input slot
	 */
	public void addInput(String input) {
		inputs.add(input);
	}
	
	/**
	 * Add an output element to the model transformation.
	 * @param output the new output element
	 * @see {@link OutputElement#setPackage(String)}, {@link OutputElement#setSlot(String)}
	 */
	public void addOutput(OutputElement output) {
		outputs.add(output);
	}
	
	/**
	 * Add a config element to the model transformation.
	 * @param c the new config element
	 * @see {@link ConfigElement#setKey(String)}, {@link ConfigElement#setValue(String)}
	 */
	public void addConfig(ConfigElement c) {
		config.addConfigItem(c.key, c.value);
	}
	
	/**
	 * Add a transformation module implementation to the model transformation
	 * @param module the fully qualified name of the module to add
	 * @throws TransformationAnnotationNotFoundException if the
	 *         supplied class is not a transformation module
	 * @throws ClassNotFoundException if the supplied string can
	 *         not be resolved to a class by the system class loader
	 */
	public void addTransformationModule(String module) throws TransformationAnnotationNotFoundException, ClassNotFoundException {
		// check for @Transformation annotation
		Class<?> moduleClass = ClassLoader.getSystemClassLoader().loadClass(module);
		if (moduleClass.getAnnotation(Transformation.class) != null) {
			modules.add(moduleClass);
		} else {
			throw new TransformationAnnotationNotFoundException(module + " is not a transformation module.");
		}
	}
	
	
	// if another registry is to be used
	/**
	 * Changes the registry that is used to get all EPackages
	 * used for this transformation. The registry is used to
	 * configure the factory.
	 * <p>
	 * Default value: <tt>EPackage.Registry.INSTANCE</tt>
	 * @param registry the new registry
	 */
	public void setRegistry(Registry registry) {
		this.registry = registry;
	}
	
	
	@SuppressWarnings("unchecked")
	private <A> Class<A> getTransformationInterface(Class<? extends A> moduleImpl) {
		for (Class<?> clazz : moduleImpl.getInterfaces()) {
			if (clazz.getAnnotation(TransformationInterface.class) != null) {
				return (Class<A>) clazz;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		
		List<List<EObject>> inputSlotContent = new ArrayList<List<EObject>>();
		
		for (String input : inputs) {
			Object inputSlotObject = ctx.get(input);
			if (inputSlotObject == null) {
				issues.addError(String.format("Slot %s is empty", input));
				return;
			} else if (inputSlotObject instanceof List<?>) {
				inputSlotContent.add((List<EObject>) inputSlotObject);
			} else {
				List<EObject> inputSlotList = new ArrayList<EObject>();
				inputSlotList.add((EObject) inputSlotObject);
				inputSlotContent.add(inputSlotList);
			}
		}
		
		// create the factory we use for our modules and add all
		// packages residing in the registry
		final MultiplePackageFactory factory = new MultiplePackageFactory();
		for (Object o : registry.values()) {
			EPackage pkg = (EPackage) o;
			factory.addPackage(pkg);
		}
		
		// start of the wiring with Guice
		Injector injector = Guice.createInjector(new Module() {
			@Override
			public void configure(Binder binder) {
				// bind helper framework classes that are
				// automatically injected into the modules
				binder.bind(TracingAPI.class).toInstance(TracingAPI.INSTANCE);
				
				// NB: the casts are necessary, because Java does not correctly recognize
				// that the parameters fit.
				binder.bind(ModuleFactory.class).toInstance((ModuleFactory) factory);
				binder.bind(ImportChecker.class).toInstance((ImportChecker)
						new StarImportChecker());

				binder.bind(Config.class).toInstance(config);

				// bind actual modules
				for (Class/*<?>*/ moduleImpl : modules) {
					binder.bind(getTransformationInterface(moduleImpl))
							.to(moduleImpl).in(Scopes.SINGLETON);
				}
			}
		});

		MainMethod mainObject = null;

		// search for main method
		for (Class<?> moduleImpl : modules)
			if (MainMethod.class.isAssignableFrom(moduleImpl)) {
				if (mainObject == null)
					mainObject = (MainMethod) injector.getInstance(moduleImpl);
				else {
					// if multiple main methods found, abort
					System.out.println("Multiple main methods found:\n  " + mainObject + "\n  " + moduleImpl);
					for (OutputElement output : outputs)
						ctx.set(output.slot, null);

					return;
				}
					
			}

		// if no main method is found, abort
		if (mainObject == null) {
			System.out.println("Main method not found!");
			for (OutputElement output : outputs)
				ctx.set(output.slot, null);

			return;
		}
		
		// call the main method we determined on the main module implementation
		mainObject.main(inputSlotContent);

		Map<String, List<EObject>> outputMap = createOutputMap(((ModuleFactory) factory).getAll());
		
		// configure the output slots
		for (OutputElement output : outputs) {
			ctx.set(output.slot, outputMap.get(output.pack));
		}
		
	}

	/**
	 * Builds a map that groups the output elements created by the factory
	 * of this module loader into packages 
	 * @param all all EObjects that are to be grouped
	 * @return a map which maps a package name to the corresponding
	 *         objects from <tt>all</tt>
	 */
	private Map<String, List<EObject>> createOutputMap(List<EObject> all) {
		Map<String, List<EObject>> result = new HashMap<String, List<EObject>>();

		for (EObject obj : all)
			if (obj.eContainer() == null) {
				String key = obj.eClass().getEPackage().getName();
				List<EObject> list;
				if (!result.containsKey(key)) {
					list = new ArrayList<EObject>();
					result.put(key, list);
				} else {
					list = result.get(key);
				}
				list.add(obj);
			}

		return result;
	}

}
