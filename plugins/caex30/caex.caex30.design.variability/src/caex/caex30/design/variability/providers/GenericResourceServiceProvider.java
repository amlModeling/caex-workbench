package caex.caex30.design.variability.providers;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

public class GenericResourceServiceProvider implements IResourceServiceProvider {
	
	public GenericResourceServiceProvider() {
		// Do nothing
	}

	@Override
	public IResourceValidator getResourceValidator() {
		return new IResourceValidator() {

			@Override
			public List<Issue> validate(Resource resource, CheckMode mode, CancelIndicator indicator)
					throws OperationCanceledError {				
				return Collections.emptyList();
			}			
		};
	}

	@Override
	public Manager getResourceDescriptionManager() {
		return new Manager() {
			
			@Override
			public boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context)
					throws IllegalArgumentException {				
				return false;
			}
			
			@Override
			public boolean isAffected(Delta delta, IResourceDescription candidate) throws IllegalArgumentException {				
				return false;
			}
			
			@Override
			public IResourceDescription getResourceDescription(Resource resource) {
				DefaultResourceDescriptionStrategy descriptionStrategy = new DefaultResourceDescriptionStrategy();
				descriptionStrategy.setQualifiedNameProvider(new IQualifiedNameProvider() {
					
					private QualifiedName getGeneralQualifiedName(EObject eObject) {
						String eObjectID = EcoreUtil.getID(eObject);
						if (eObjectID == null) {
							Optional<EStructuralFeature> possibleFeatures = eObject.eClass().getEAllStructuralFeatures().stream().filter(struct -> struct.getName().equals("name")).findAny();
							if (possibleFeatures.isPresent() == true)
								return QualifiedName.create(eObject.eGet(possibleFeatures.get()).toString());
						} else
							return QualifiedName.create(eObjectID);
						return null;
					}
					
					@Override
					public QualifiedName apply(EObject input) {
						return getGeneralQualifiedName(input);
					}
					
					@Override
					public QualifiedName getFullyQualifiedName(EObject obj) {
						return getGeneralQualifiedName(obj);
					}
				});				
				
				return new DefaultResourceDescription(resource, descriptionStrategy);
			}
			
			@Override
			public Delta createDelta(IResourceDescription oldDescription, IResourceDescription newDescription) {
				return new DefaultResourceDescriptionDelta(oldDescription, newDescription);
			}
		};
	}

	@Override
	public org.eclipse.xtext.resource.IContainer.Manager getContainerManager() {
		return new SimpleResourceDescriptionsBasedContainerManager();
	}	

	@Override
	public IEncodingProvider getEncodingProvider() {
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public <T> T get(Class<T> t) {		
		return null;
	}
	
	@Override
	public boolean canHandle(URI uri) {
		return true;
	}

}
