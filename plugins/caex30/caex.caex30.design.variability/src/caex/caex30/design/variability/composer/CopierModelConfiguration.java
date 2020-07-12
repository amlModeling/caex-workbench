package caex.caex30.design.variability.composer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import caex.caex30.design.variability.utils.EMFHandler;
import solver.presenceConditions.ConditionParser;
import variability.PresenceCondition;
import variability.Variability;

public class CopierModelConfiguration extends EcoreUtil.Copier{

	private static final long serialVersionUID = 1L;
	
	private Variability vRoot = null;
	private FeatureIDEProvider fip = null;
	private EList<EReference> strongerThan;
	private EMFHandler emh;
	
	public CopierModelConfiguration(Variability vRoot, FeatureIDEProvider fip,  EMFHandler emh, 
		EList<EReference> strongerThan) {
		super();
		this.vRoot = vRoot;
		this.fip = fip;
		this.strongerThan = strongerThan;
		this.emh = emh;
	}
	
	/**
     * Check the PC to EObjects 
     * before performing the copy              
     * @param eObject the object to copy.
     * @return the copy.
     */
	@Override
    public EObject copy(EObject eObject)
    {
      if (eObject == null) {
        return null;
      } else {
    	  boolean checkPC = checkEObjectPCPredicates(eObject);
    	  if (checkPC == false) 
    		  return null;
          return super.copy(eObject);
	  }
    }
	
	private boolean checkEObjectPCPredicates(EObject eObject) {
		String name = getNameOf(eObject);
	    if (name != null) {
	    	PresenceCondition pc = vRoot.getPresencecondition(name);
	   		if (pc != null ) {
		      ConditionParser cp = new ConditionParser(this.emh.object2xtext(pc.getExpression()), this.fip);
		      if (!cp.eval()) {
		    	 System.out.println("[ petrinets pn PLs] CFG " + fip.getCfg().getSelectedFeatureNames() + "deleting " + eObject);
		    	 return false;
		      }
	   		}	   		
	   }
	   return true;
	}

	@Override
	protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
		super.copyReference(eReference, eObject, copyEObject);
		if (this.strongerThan != null) {
			int referenceIndex = this.strongerThan.indexOf(eReference);
			if (referenceIndex != -1) {
				Object objectReferenced = copyEObject.eGet(eReference);
				if (objectReferenced == null) {			
					EcoreUtil.remove(copyEObject);
				}				
			}
		}
	}
	
	private String getNameOf(EObject obj) {		
		EStructuralFeature featureName = obj.eClass().getEStructuralFeature("name");
		if (featureName != null)		
			return obj.eGet(featureName).toString();	
		return null;	
	}
}

