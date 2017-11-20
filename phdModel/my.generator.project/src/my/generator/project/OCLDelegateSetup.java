package my.generator.project;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup;

public class OCLDelegateSetup {
private Logger log = Logger.getLogger(getClass());	
	
	public void setResourceSet(ResourceSet resourceSet) {
		log.info("Setup OCL Delegates");
		OCLDelegateDomain.initialize(resourceSet);
		PivotStandaloneSetup.init();
	}

}
