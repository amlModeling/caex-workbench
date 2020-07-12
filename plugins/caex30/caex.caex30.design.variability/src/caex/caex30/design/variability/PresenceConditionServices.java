package caex.caex30.design.variability;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.variability.definition.diagram.design.condition.FeatureValidation;

import variability.BinaryExpression;
import variability.Expression;
import variability.Feature;
import variability.PresenceCondition;
import variability.UnaryExpression;

public class PresenceConditionServices {
	
	public String getLabelParentExpression(Expression expression) {
		return getLabelExpression(expression) + ";";
	}
	
	public boolean validateExpression(PresenceCondition presenceCondition) {
		Collection<EObject> presenceCondInverse = new EObjectQuery(presenceCondition).
				getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
		DNodeList dNodeList = null;
		Iterator<EObject> itInverseObject = presenceCondInverse.iterator();
		while (itInverseObject.hasNext()) {
			EObject eObject = (EObject) itInverseObject.next();
			if (eObject instanceof DNodeList) {
				dNodeList = (DNodeList) eObject;
				break;
			}			
			if (itInverseObject.hasNext() == false)
				return true;
		}
				
		HashMap<String, Object> parameters = new HashMap<String,Object>();
		parameters.put("presenceCondition", presenceCondition);
		parameters.put("containerView", dNodeList);
		parameters.put("removeMarkers", "false");
		FeatureValidation featureValidation = new FeatureValidation();
		featureValidation.execute(null, parameters);		
		return true;	
	}	
	
	private String getLabelExpression(Expression expression) {		
		if (expression instanceof Feature)
			return ((Feature) expression).getFeature();
		else if (expression instanceof UnaryExpression) {
			UnaryExpression unaryExpression = (UnaryExpression) expression;
			return unaryExpression.getOperator().getLiteral().toLowerCase() + " " + getLabelExpression(unaryExpression.getRight());
		}
		else if (expression instanceof BinaryExpression) {
			BinaryExpression binaryExpression = (BinaryExpression) expression;
			return "(" + getLabelExpression(binaryExpression.getLeft()) + " " + binaryExpression.getOperator().getLiteral().toLowerCase() + " "
					+ getLabelExpression(binaryExpression.getRight()) + ")";
		}
		return "Undefined";
	}	
}
