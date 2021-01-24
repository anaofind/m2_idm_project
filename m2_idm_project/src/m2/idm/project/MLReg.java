package m2.idm.project;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import m2.idm.project.generator.InterpreterMLReg;
import m2.idm.project.mLRegression.Model;

public class MLReg {

	public static void main(String[] args) throws Exception {
		
		if (args.length == 0 || args.length > 2) {
			throw new Exception("Must have argument [path-file-datas, (path-file-result-target)?]");
		}
				
		File file = new File(args[0]);
		if (! file.exists()) {
			throw new Exception("source file not found : " + file.getAbsolutePath());
		}
		
		PrintStream printer = System.out;
		if (args.length == 2) {
			Path pathRes = new File(args[1]).toPath();
			if (!Files.exists(pathRes)) {
				Path parentRes = pathRes.getParent();
				if (! Files.exists(parentRes)) {
					Files.createDirectories(parentRes);
				}
				Files.createFile(pathRes);
			}
			printer = new PrintStream(pathRes.toFile());
		}
		
		String[] split = args[0].split(Pattern.quote("."));
		String extension = split[split.length-1];
		if (! extension.equals("mlreg")) {
			throw new Exception("source is not a mlreg file");
		}
		
		new MLRegressionStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createFileURI(file.getPath()), true);
		Model model = (Model) resource.getContents().get(0);
		
		InterpreterMLReg interpreter = new InterpreterMLReg();
		String parent = file.getParent();
		interpreter.compileAndRun(parent, model, printer);	
	}
	
}
