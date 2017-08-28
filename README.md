# CAEX MDE Workbench

This project provides a model-driven engineering (MDE) workbench for CAEX ([IEC](http://www.iec.ch/) 62424:2016). 

CAEX is one of the most promising standards for the data exchange between engineering tools in the production system automation domain. This is also reflected by the current emergence of [AutomationML](https://www.automationml.org/o.red.c/home.html), which uses CAEX as its core representation data format. 

The model-driven engineering workbench for CAEX is based on the [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/modeling/emf/) and provides the following components:
1. Metamodels for CAEX version 2.15 and version 3.0.
2. A tree-based editor for creating, modifying and inspecting CAEX 2.15 and CAEX 3.0 models.
3. A graphical editor for visualizing CAEX 3.0 Instance Hierarchies.
4. A textual editor for creating, modifying and inspecting CAEX 3.0 Instance Hierarchies.
5. Modeling rules for the correct usage of CAEX with AutomationML.
6. Migration operations for converting CAEX 2.15 models into CAEX 3.0 models.

## Installation

### Install EMF

For installing the CAEX MDE workbench, you first need to download the latest version of the Eclipse Modeling Tools from [eclipse.org](http://www.eclipse.org/downloads/eclipse-packages/). 
Install the Sirius, Xtext, OCL, ATL, and Epsilon plugins from the following update sites:

* [Sirius update site](http://download.eclipse.org/sirius/updates/releases/5.0.1/oxygen) - Required for graphical CAEX 3.0 editor
* [Xtext update site](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/) - Required for textual CAEX 3.0 editor
* [OCL update site](http://download.eclipse.org/modeling/mdt/ocl/updates/releases) - Required for AutomationML modeling rules
* [ATL update site](http://download.eclipse.org/mmt/atl/updates/releases) - Required for CAEX 2.15 to CAEX 3.0 migration
* [Epsilon update site](http://download.eclipse.org/epsilon/updates/) - Required for CAEX 2.15 to CAEX 3.0 migration

### Install the CAEX MDE Workbench

To install the CAEX MDE workbench, import all projects contained in the [*plugins folder*](https://github.com/amlModeling/caex-workbench/tree/master/plugins) of this repository into your Eclipse workspace. Then, start a new Eclipse instance. 

In the new Eclipse instance, all features of the CAEX MDE workbench are available.

## How To 

### CAEX Metamodels

The CAEX MDE Workbench provides metamodels for CAEX 2.15 and CAEX 3.0 defined with [Ecore](http://www.eclipse.org/modeling/emf/). You can find the metamodels in the plugin projects [*caex.caex215*](https://github.com/amlModeling/caex-workbench/tree/master/plugins/caex215/caex.caex215) and [*caex.caex30*](https://github.com/amlModeling/caex-workbench/tree/master/plugins/caex30/caex.caex30). In these projects, you can also find Java APIs that allow tool developers to programmatically access CAEX 2.15 and CAEX 3.0 models.

Further documentation on the metamodels can be found in the [*documentation* folder](https://github.com/amlModeling/caex-workbench/tree/master/documentation) of this repository.

### Tree-Based CAEX Editors

To create a CAEX 2.15 or CAEX 3.0 model, first create an empty project (*File* > *New* > *Project...* > *General*/*Project*). Within this project, you can create a new CAEX model by selecting *File* > *New* > *Other...* > *CAEX*/*CAEX 2.15 Model* or *CAEX*/*CAEX 3.0 Model*. The newly created CAEX model will be immediately opened in the tree-based editor. It will contain already the root element *CAEX File*. Use the context menu *New Child* to add further elements to your CAEX model as well as the *Properties* view to set attributes for the model elements.

In this repository, you can also find example CAEX models in the [examples folder](https://github.com/amlModeling/caex-workbench/tree/master/examples).

### Graphical CAEX 3.0 Editor

To visualize a CEAX 3.0 Instance Hierarchy graphically, you first need to create a *Representations File*. For this, select *File* > *New* > *Other...* > *Sirius*/*Representations File*. Select "Initialization from a semantic resource" as initialization kind and your CAEX model file (*.caex) in the next wizard pages. Select the Viewpoint "CAEX 3.0" in the following Viewpoints Selection dialog. 
A new *.aird file will be created as a result. Unfold the *.aird file in the Project Explorer to the lowest level, which is labeled "CAEX 3.0 Instance Hierarchy Diagram". Open the diagram by double-clicking on this item. This will open the graphical representation of your CAEX model.

### Textual CAEX 3.0 Editor
TODO

### AutomationML Modeling Rules
TODO

### CAEX 2.15 to 3.0 Migration
TODO