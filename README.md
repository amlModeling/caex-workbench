# CAEX MDE Workbench

This project provides a model-driven engineering (MDE) workbench for CAEX ([IEC](http://www.iec.ch/) 62424:2016). 

CAEX is one of the most promising standards when it comes to data exchange between engineering tools in the production system automation domain. This is also reflected by the current emergence of [AutomationML](https://www.automationml.org/o.red.c/home.html), which uses CAEX as its core representation data format. 

The model-driven engineering workbench for CAEX is based on the [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/modeling/emf/) and provides the following components:
1. Metamodels for CAEX version 2.15 and version 3.0 defined with [Ecore](http://www.eclipse.org/modeling/emf/)
2. Modeling rules for the correct usage of CAEX with AutomationML defined with [OCL](https://projects.eclipse.org/projects/modeling.mdt.ocl)
3. Migration operations for converting CAEX 2.15 models into CAEX 3.0 models defined with [ATL](http://www.eclipse.org/atl/) and [EVL](http://www.eclipse.org/epsilon/doc/evl/)

## Installation

For installing the CAEX MDE workbench, download the latest version of the Eclipse Modeling Tools from [eclipse.org](http://www.eclipse.org/downloads/eclipse-packages/). 
Install OCL, ATL, and the Epsilon Framework from the [OCL update site](http://download.eclipse.org/modeling/mdt/ocl/updates/releases), [ATL update site](http://download.eclipse.org/mmt/atl/updates/releases), and [Epsilon update site](http://download.eclipse.org/epsilon/updates/).
Import the plugins provided in this repository into your Eclipse workspace.