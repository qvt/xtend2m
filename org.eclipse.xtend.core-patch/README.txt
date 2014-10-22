For ease of use, we provide only those files that we had to modify in the Xtend core plugin.

copy

	/org.eclipse.xtend.core/src/org/eclipse/xtend/core/validation\ModelValidationHelper.java

to the appropriate location in your Xtend library, and include the part marked with /* NEW */
in XtendJavaValidator.java into your XtendJavaValidator.java.

Additionally a dependency on  edu.kit.ipd.sdq.xtend2m has to be added to the MANIFEST.MF of the
org.eclipse.xtend.core plugin.

Tested with Xtend SDK 2.7.0.v201407030400
