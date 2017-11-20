package my.generator.project;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class EMSGeneratorSupport extends AbstractGenericResourceSupport {
	@Override
	    protected Module createGuiceModule() {
	        return new EMSGeneratorModule();
	    }
}

