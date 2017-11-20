package my.generator.project

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.EObject
import root.RootPackage
import root.Test
import root.Model
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute

class EMSGenerator implements IGenerator {
	@Inject extension IQualifiedNameProvider
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        for (EObject o : resource.contents) {
           o.compile(fsa)
        }
    }
 
    def dispatch void compile(Model m, IFileSystemAccess fsa) {
        for (e : m.tests) {
            e.compile(fsa)
        }
    }
   
 
    def compile(Test e, IFileSystemAccess fsa) {
        fsa.generateFile(e.name+".java", '''
        package «e.name» ;
        
        public class «e.name» {
        	
        	
        	
        }
        ''')
    }
   
 
   def dispatch void compile(EObject m, IFileSystemAccess fsa) {
   	
   }
   
   def packageName(EClass e) {
		var name = e.eContainer.toString;
		return name.substring(0, name.indexOf('@'))
		}
 
 }
 
   
    
 
   
	
