Xtend2m turns [Xtend](http://www.xtend-lang.org) into a powerful model transformation language that supports modular programming. Xtend is a versatile, extendable language with a functional flavor. With a concise syntax close to the Object Constraint Language, Xtend qualifies for model transformation development. To increase maintainability of larger and more complex transformations, this work adds a customized module concept to the Xtend language. It is the first module concept for a transformation language with information hiding support.

### Description

Development and maintenance of model transformations make up a substantial share of the lifecycle costs of software products that rely on model-driven techniques. In particular large and heterogeneous models lead to poorly understandable transformation code due to missing language concepts to master complexity. 

Xtend2m implements a module concept for model transformation languages that allows programmers to control information hiding and strictly declare model and code dependencies at module interfaces. With Xtend2m, we can break down transformation logic into smaller parts, so that each part owns a clear interface for separating concerns. To meet the special demands of transformations, module interfaces give control over both model and code accessibility. 

Designing model transformations in a modular fashion brings real benefits.  In a case study, we examined the effort required to carry out two typical maintenance tasks on a real- world transformation written in Xtend. We are able to attest a significant reduction of effort, thereby demonstrating the practical effects of the interface concept on the maintainability of model transformations.

### Features

Xtend2m uses Xtend's concept of *Active Annotations* to non-invasively enhance the base language with several concepts:

* **@TransformationInterface** and **@TransformationModule** to declare module interfaces;
* **@ModelIn** and **@ModelOut** to controlled access to model elements per module; and
* **@Creates** to realize mapping functions including a tracing API, both enforcing access control

An example module interface and an implementation may look like this:

```
@TransformationInterface
@ModelIn(#["activitymodel.StartAction",
           "activityModel.StopAction"])
@ModelOut(#["processModel.Step"])
interface IAction2Step {
	def Step action2Process(Action self)
}
@TransformationModule
class Action2Step implements IAction2Step {
	@Creates(typeof(Step))
	override Step action2Process(Action self) {
	   result.name = self.name
	   self.succ.lateResolveOne [ result.next = it ]
	   result.isStart = self instanceof StartAction
	   result.isStop = self instanceof StopAction
	}
}
```

### Installing

Instructions will be added soon.

<!--*QVTr2Coq* runs on the Eclipse Modeling Tools. The following steps assume a fresh installation of Eclipse. 

* Download Eclipse [Modeling Tools 4.3 (Kepler)](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplersr1) (Kepler) and launch it;
* Install through menu **Help > Install Modeling Components...** [Eclipse Xtext 2.5+](http://www.eclipse.org/modeling/tmf/downloads/?project=xtext) of the Model Development Tools (MDT) project;
* Choose **Help > Install New Software...** to install [Eclipse QVTd 0.10+](http://www.eclipse.org/mmt/downloads/?project=qvtd) of the Model to Model Transformation (MMT) project, [update site](http://download.eclipse.org/mmt/qvtd/updates/releases);
* Download [QVTr2Coq](https://github.com/qvt/qvtr2coq/zipball/master) and import contained projects through **File > Import > Existing Projects into Workspace…** into your Eclipse workspace.
-->
<!--(http://qvt.github.io/qvtr2coq/downloads/qvtr2coq-0.1.0.zip)-->

<!--You are ready to use the code generator to produce Coq specifications from QVT-R programs, Ecore metamodels and instances thereof. To do so, use the run configuration **Generate Coq Code**. The transformation searches in subfolder [models](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/models) for files ending with .qvtr, .ecore, and .xmi. Resulting Coq specifications (.v files) are placed into [src-gen](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/src-gen). 

To run a proof on generated Coq files, you need to install the [Coq proof assistant](http://coq.inria.fr/download), version 8.4 or higher. We recommend to download Coq bundled with CoqIDE.-->

### Publication
* A. Rentschler, D. Werle, Q. Noorshams, L. Happe, R. Reussner. [*Designing Information Hiding Modularity for Model Transformation Languages*](http://could.finally.lead.to/paper.pdf). Proceedings of the 13th International Conference on Modularity (AOSD '14), Lugano, Switzerland, April 2014. ACM, New York, NY, USA. April 2014, Accepted for publication. To appear.

### Contributors
* [Dominik Werle](emailto:dominik.werle_atgoeshere_student.kit.edu) from Karlsruhe Institute of Technology
* [Andreas Rentschler] (http://sdq.ipd.kit.edu/people/andreas_rentschler/) from Karlsruhe Institute of Technology

Work has partly been funded by the German Research Foundation (DFG) under grant No. RE 1674/5-1: [Model-Driven Methods and Tools for Performance Prediction and Capacity Planning of Component-Based Software Systems](http://www.ferdinand-project.org).

<img src="http://qvt.github.io/qvtr2coq/images/Logo_KIT.png" alt="KIT" height="70px"/>&nbsp;&nbsp;&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_FERDINAND.png" alt="FERDINAND" height="50px"/>
