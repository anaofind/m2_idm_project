/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.generator;

import com.google.common.collect.Iterables;
import m2.idm.project.generator.GeneratorCode;
import m2.idm.project.generator.GeneratorPythonCode;
import m2.idm.project.generator.GeneratorRCode;
import m2.idm.project.mLRegression.LanguageTarget;
import m2.idm.project.mLRegression.MLRegression;
import m2.idm.project.mLRegression.Model;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MLRegressionGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Model model = IterableExtensions.<Model>head(Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class));
    final LanguageTarget language = model.getLanguageTarget();
    final MLRegression ml = model.getMl();
    final GeneratorCode generator = this.getGenerator(language);
    final String code = generator.generate(ml);
    String _lastSegment = resource.getURI().lastSegment();
    String _extension = generator.getExtension();
    String _plus = ("." + _extension);
    final String file = _lastSegment.replace(".mlreg", _plus);
    if ((code != null)) {
      fsa.generateFile(file.toString(), code);
    }
  }
  
  public GeneratorCode getGenerator(final LanguageTarget language) {
    if ((language != null)) {
      final String languageString = language.getLanguage().toUpperCase();
      if (languageString != null) {
        switch (languageString) {
          case "PYTHON":
            return new GeneratorPythonCode();
          case "R":
            return new GeneratorRCode();
        }
      }
    }
    return new GeneratorPythonCode();
  }
}
