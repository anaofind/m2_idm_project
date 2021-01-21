package m2.idm.project.generator;

import java.io.*;
import com.google.common.io.Files;
import m2.idm.project.mLRegression.LanguageTarget;
import m2.idm.project.mLRegression.MLRegression;
import m2.idm.project.mLRegression.Model;

public class InterpreterMLReg{
	
	private String command = "python";
	
	public void compileAndRun(Model model) throws Exception{
		if (model == null) {
			throw new Exception("model must not null");
		}
		LanguageTarget languageTarget = model.getLanguageTarget();
		MLRegression mlRegression = model.getMl();
		
		GeneratorCode generatorCode = this.createGeneratorCode(languageTarget);
		String code = generatorCode.generate(mlRegression);
		
		String fileOutput = "mlreg." + generatorCode.getExtension() ;
		Files.write(code.getBytes(), new File(fileOutput));
		
		Process p = Runtime.getRuntime().exec(this.command + " " + fileOutput);
		
		// output
	    BufferedReader stdInput = new BufferedReader(new 
	         InputStreamReader(p.getInputStream()));
	
	    // error
	    BufferedReader stdError = new BufferedReader(new 
	         InputStreamReader(p.getErrorStream()));
	
	    String o;
		while ((o = stdInput.readLine()) != null) {
	        System.out.println(o);
	    }
	    
		String err; 
		while ((err = stdError.readLine()) != null) {
	        System.out.println(err);
	    }
	}
	
	private GeneratorCode createGeneratorCode(LanguageTarget languageTarget)  {
		String language = "python";
		if (languageTarget != null) {
			language = languageTarget.getLanguage();
		}
		switch (language.toUpperCase()) {
		case "PYTHON" :
			this.command = "python";
			return new GeneratorPythonCode();
		case "R" :
			this.command = "Rscript";
			return new GeneratorRCode();
		}
		return new GeneratorPythonCode();
	}

}
