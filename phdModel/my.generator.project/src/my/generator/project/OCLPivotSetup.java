package my.generator.project;
import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class OCLPivotSetup {
private Logger log = Logger.getLogger(getClass());	
	
	public void setResourceSet(ResourceSet resourceSet) {
		log.info("Setup Pivot Delegates");		
		PivotStandaloneSetup.init();
	}

}
