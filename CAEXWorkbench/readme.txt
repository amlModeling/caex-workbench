This folder contains an Eclipse project which provides
1) CAEX metamodels for version 2.15 and 3.00 - folder metamodels
2) Some example models - folder models
3) Constraints which checks for the possible conformance of CAEX 2.15 models with respect to CAEX 3.0 - folder checkers
4) Transformation to convert a CAEX 2.15 model into a CAEX 3.0 model - folder CAEXmigration
5) Constraints which checks if a CAEX model is also a valid AutomationML model - folder AMLconstraints

To run the transformations and check the constraints, Eclipse Modeling Platform is needed with the following plugins:
A basic Eclipse Modeling Platform can be downloaded here: https://eclipse.org/downloads/packages/eclipse-modeling-tools/mars2 
This basic installation should be extended with additional modeling components/plugins from the Eclipse Market Place:
– ATL https://marketplace.eclipse.org/content/atl
– Epsilon Framework https://marketplace.eclipse.org/content/epsilon

The CAEX Workbench is currently available as Eclipse Project folder. 
It can be imported in a workspace and opened in a running Eclipse instance.
There are dedicated launch scripts which allows to directly execute the constraints as well as transformation for CAEX example models.