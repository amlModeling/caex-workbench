package caex.caex30.design.variability.composer;

import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.SelectableFeature;
import solver.features.IFeature;
import solver.features.IFeatureProvider;
import solver.features.impl.Feature;

public class FeatureIDEProvider implements IFeatureProvider {
	
	private Configuration cfg;
	
	public FeatureIDEProvider (Configuration cfg) {
		this.cfg = cfg;
	}

	@Override
	public boolean isValidFeature(String name) {
		for (SelectableFeature sf : this.cfg.getFeatures() ) 
			if (sf.getName().equals(name)) return true;		
		return false;
	}

	@Override
	public IFeature getFeature(String token) {
		if (isValidFeature(token)) return new Feature(token);
		return null;
	}

	@Override
	public boolean getFeatureValue(String name) {
		return this.cfg.getSelectedFeatureNames().contains(name);
	}

	public Configuration getCfg() {
		return this.cfg;
	}
}

