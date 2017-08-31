package caex.caex215.testmodelgenerator.metrics;

public class MetricsGenerator {

	public static void main(String[] args) {
		ModelMetrics me = new ModelMetrics();
		String modelPath = "model/";
		me.generateMetrics(modelPath + "prototype.10.xmi");
		me.generateMetrics(modelPath + "prototype.100.xmi");
		me.generateMetrics(modelPath + "prototype.500.xmi");
		me.generateMetrics(modelPath + "prototype.1000.xmi");
		me.generateMetrics(modelPath + "prototype.2000.xmi");
		me.generateMetrics(modelPath + "prototype.10000.xmi");
		me.generateMetrics(modelPath + "prototype.30000.xmi");
		me.generateMetrics(modelPath + "prototype.70000.xmi");
		me.generateMetrics(modelPath + "prototype.100000.xmi");
		me.generateMetrics(modelPath + "prototype.200000.xmi");
		me.generateMetrics(modelPath + "prototype.300000.xmi");
	}

}
