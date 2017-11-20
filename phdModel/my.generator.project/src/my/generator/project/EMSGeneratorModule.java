package my.generator.project;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
public class EMSGeneratorModule extends AbstractGenericResourceRuntimeModule{
	@Override
    protected String getLanguageName() {
        return "root.presentation.rootEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
        return "root";
    }
 
    public Class<? extends IGenerator> bindIGenerator() {
        return EMSGenerator.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }

}
