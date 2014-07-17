Xtend2m turns [Xtend](http://www.xtend-lang.org) into a model transformation language that promotes modular programming. Xtend is a versatile, extendable language with a functional flavor. With a concise syntax close to the Object Constraint Language, Xtend qualifies for model transformation development. To increase maintainability of larger and more complex transformations, this work adds a customized module concept to the Xtend language. It is the first model transformation language that features a module concept with information hiding support.

### Description

Development and maintenance of model transformations make up a substantial share of the lifecycle costs of software products that rely on model-driven techniques. In particular large and heterogeneous models lead to poorly understandable transformation code due to missing language concepts to master complexity. 

Xtend2m embeds a module concept for model transformation languages into the Xtend language version 2 (as opposed to its obsolete version 1). Xtend2m allows programmers to control information hiding and strictly declare model and code dependencies at module interfaces. With Xtend2m, we can break down transformation logic into smaller parts, so that each part owns a clear interface for separating concerns. To meet the special demands of transformations, module interfaces give control over both model and code accessibility.

Designing model transformations in a modular fashion brings real benefits.  In a case study, we examined the effort required to carry out two typical maintenance tasks on a real- world transformation written in Xtend. We are able to attest a significant reduction of effort, thereby demonstrating the practical effects of the interface concept on the maintainability of model transformations.

### Features

Xtend2m uses Xtend's concept of *Active Annotations* to non-invasively enhance the base language with several concepts:

* **@TransformationInterface** and **@TransformationModule** to declare module interfaces;
* **@Import** to access modules via their interface;
* **@ScopeIn** and **@ScopeOut** to control access to model elements per module;
* **@Creates** to realize mapping functions that enforces access control; and
* A tracing API (**lateResolveOne**, …) that enforces access control, as well.

If a module implementation violates its interface, e.g., if access to a model element id not allowed, errors are indicated in the editor (*static type checking*). The following code snipped gives an impression on how an example module interface and an implementation in Xtend2m is programmed.

```
@TransformationInterface
@ScopeIn(#["activitymodel.StartAction",
           "activityModel.StopAction"])
@ScopeOut(#["processModel.Step"])
interface IAction2Step {
	def Step mapAction2Step(Action self)
}
@TransformationModule
class Action2Step implements IAction2Step {
	@Creates(typeof(Step))
	override Step mapAction2Step(Action self) {
	   result.name = self.name
	   self.succ.lateResolveOne [ result.next = it ]
	   result.isStart = self instanceof StartAction
	   result.isStop = self instanceof StopAction
	}
}
```
The module provides one mapping, *mapAction2Step*, that transforms instances of class *Action* to instances of class *Step*. Using annotations @ScopeIn and @ScopeIn, the implementation is not allowed to access any instances other than *StartAction*, *StopAction*, and *Step*.

### Installing

The following steps describe a particular version of Eclipse, older/newer versions might work, as well:

1. Install a [Java SE](http://www.oracle.com/technetwork/java/javase/downloads/index.html) runtime environment version 1.8.0_05-b13 (Newer and older versions, like Java 7, reportedly worked, as well);
2. Download [Eclipse 4.4.0 Luna Modeling Edition (Build 20140612-0600)](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/lunar) and launch it;
3. Install through menu **Help > Install Modeling Components...** [Eclipse Xtext 2.6.1 (Xtend SDK 2.6.1.v201405210727)](http://www.eclipse.org/modeling/tmf/downloads/?project=xtext) of the Model Development Tools (MDT) project;
4. Choose **Help > Check for Updates...** to update to the latest Xtext 2.7.0 (Xtend SDK 2.7.0.v201407030400, later versions may require adaptations of our plugins);
5. Download [Xtend2m](https://github.com/qvt/xtend2m/zipball/master) and import contained projects through **File > Import > Existing Projects into Workspace…** into your Eclipse workspace;
6. Import project org.eclipse.xtend.core from origin/master (no tag exists for 2.7.0 yet as of Jul 14, 2014) of repository git://git.eclipse.org/gitroot/tmf/org.eclipse.xtext.git and apply patch for model scope checking (see project org.eclipse.xtend.core-patch for instructions).

<!--(http://qvt.github.io/xtend2m/downloads/xtend2m-1.0.0.zip)-->

<!--You are ready to use the code generator to produce Coq specifications from QVT-R programs, Ecore metamodels and instances thereof. To do so, use the run configuration **Generate Coq Code**. The transformation searches in subfolder [models](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/models) for files ending with .qvtr, .ecore, and .xmi. Resulting Coq specifications (.v files) are placed into [src-gen](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/src-gen). 

To run a proof on generated Coq files, you need to install the [Coq proof assistant](http://coq.inria.fr/download), version 8.4 or higher. We recommend to download Coq bundled with CoqIDE.-->

### See Also
* [Modular Model Transformations](https://sdqweb.ipd.kit.edu/wiki/Modular_Model_Transformations), the overall approach behind this project, as well as information for developers.
* [QVTom](http://qvt.github.io/qvtom/), a modular extension of QVTo hosted at Github.

### Publication
* A. Rentschler, D. Werle, Q. Noorshams, L. Happe, R. Reussner. [*Designing Information Hiding Modularity for Model Transformation Languages*](http://dl.acm.org/citation.cfm?doid=2577080.2577094). Proceedings of the 13th International Conference on Modularity (AOSD '14), Lugano, Switzerland, April 2014. ACM, New York, NY, USA. April 2014.

### Contributors
* [Dominik Werle](emailto:dominik.werle_AtSignGoesHere_student.kit.edu) from Karlsruhe Institute of Technology
* [Andreas Rentschler] (http://sdq.ipd.kit.edu/people/andreas_rentschler/) from Karlsruhe Institute of Technology

Work has partly been funded by the German Research Foundation (DFG) under grant No. RE 1674/5-1: [Model-Driven Methods and Tools for Performance Prediction and Capacity Planning of Component-Based Software Systems](http://www.ferdinand-project.org).

<img src="http://qvt.github.io/qvtr2coq/images/Logo_KIT.png" alt="KIT" height="70px"/>&nbsp;&nbsp;&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_FERDINAND.png" alt="FERDINAND" height="50px"/>
