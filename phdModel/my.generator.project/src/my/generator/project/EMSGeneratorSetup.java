package my.generator.project;
import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
public class EMSGeneratorSetup implements ISetup{
	 @Override
	    public Injector createInjectorAndDoEMFRegistration() {
	        return Guice.createInjector(new EMSGeneratorModule());
	    }
	 
}
