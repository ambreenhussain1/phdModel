package my.generator.project;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import root.Model;
import root.Test;

@SuppressWarnings("all")
public class EMSGenerator implements IGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject o : _contents) {
      this.compile(o, fsa);
    }
  }
  
  protected void _compile(final Model m, final IFileSystemAccess fsa) {
    EList<Test> _tests = m.getTests();
    for (final Test e : _tests) {
      this.compile(e, fsa);
    }
  }
  
  public void compile(final Test e, final IFileSystemAccess fsa) {
    String _name = e.getName();
    String _plus = (_name + ".java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name_2 = e.getName();
    _builder.append(_name_2, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus, _builder);
  }
  
  protected void _compile(final EObject m, final IFileSystemAccess fsa) {
  }
  
  public String packageName(final EClass e) {
    EObject _eContainer = e.eContainer();
    String name = _eContainer.toString();
    int _indexOf = name.indexOf("@");
    return name.substring(0, _indexOf);
  }
  
  public void compile(final EObject m, final IFileSystemAccess fsa) {
    if (m instanceof Model) {
      _compile((Model)m, fsa);
      return;
    } else if (m != null) {
      _compile(m, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m, fsa).toString());
    }
  }
}
