This Eclipse plugin provides
1) Constraints that check for the possible conformance of CAEX 2.15 models with respect to CAEX 3.0 - folder checkers
2) Transformation to convert a CAEX 2.15 model into a CAEX 3.0 model - folder CAEXmigration
3) Constraints that check whether a CAEX model is also a valid AutomationML model - folder AMLconstraints
4) Some CAEX 2.15 and CAEX 3.0 example models - folder models

To run the transformations and check the constraints, Eclipse Modeling Platform is needed with the following plugins:
A basic Eclipse Modeling Platform can be downloaded at https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygenr. 
This basic installation should be extended with additional modeling plugins from the Eclipse Market Place:
– ATL https://marketplace.eclipse.org/content/atl
– Epsilon Framework https://marketplace.eclipse.org/content/epsilon

The plugin is currently available as Eclipse project folder. 
It can be imported in a workspace and opened in a running Eclipse instance.
There are dedicated launch scripts which allow to directly check the constraints as well as run the transformation for CAEX example models.