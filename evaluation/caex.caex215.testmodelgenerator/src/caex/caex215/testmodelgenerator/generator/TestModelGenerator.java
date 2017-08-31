package caex.caex215.testmodelgenerator.generator;

public class TestModelGenerator {

	public static void main(String[] args) {
		ModelEnlarger me = new ModelEnlarger();
		String modelPath = "model/prototype.xmi";
		me.generateClones(modelPath, 10);
		me.generateClones(modelPath, 100);
		me.generateClones(modelPath, 500);
		me.generateClones(modelPath, 1000);
		me.generateClones(modelPath, 2000);
		me.generateClones(modelPath, 10000);
		me.generateClones(modelPath, 30000);
		me.generateClones(modelPath, 70000);
		me.generateClones(modelPath, 100000);
		me.generateClones(modelPath, 200000);
		me.generateClones(modelPath, 300000);
	}

}
