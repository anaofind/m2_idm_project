package m2.idm.project.generator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import m2.idm.project.Command;
import m2.idm.project.mLRegression.*;

public class InterpreterMLReg{
		
	public void compileAndRun(Model model) throws Exception {
		this.compileAndRun(null, model, System.out);
	}
	
	public void compileAndRun(Model model, PrintStream printer) throws Exception {
		this.compileAndRun(null, model, printer);
	}
	
	public void compileAndRun(String pathSource, Model model, PrintStream printer) throws Exception{		
		if (model == null) {
			throw new Exception("model must not null");
		}
		if (printer == null) {
			throw new Exception("printer must not null");
		}
		printer.println(getInfo(model) + "\n");
		LanguageTarget languageTarget = model.getLanguageTarget();
		MLRegression mlRegression = model.getMl();

		GeneratorCode generatorCode = this.createGeneratorCode(languageTarget);
		
		String code = generatorCode.generate(mlRegression);
		
		String fileOutput = "mlreg." + generatorCode.getExtension() ;
		
		Files.write(Path.of(pathSource, fileOutput), code.getBytes());
		
		String command = this.getCommand(languageTarget);
		
		Process p;
		if (pathSource != null) {
			p = Runtime.getRuntime().exec(command + " " + fileOutput, null, new File(pathSource));	
		} else {
			p = Runtime.getRuntime().exec(command + " " + fileOutput);
		}
		
		// output
		BufferedReader stdInput = new BufferedReader(new 
				InputStreamReader(p.getInputStream()));

		// error
		BufferedReader stdError = new BufferedReader(new 
				InputStreamReader(p.getErrorStream()));

		String o;
		while ((o = stdInput.readLine()) != null) {
			printer.println(o);
		}

		String err; 
		while ((err = stdError.readLine()) != null) {
			printer.println(err);
		}
		
		printer.println("\n" + p.info());
	}

	private GeneratorCode createGeneratorCode(LanguageTarget languageTarget)  {
		String language = "python";
		if (languageTarget != null) {
			language = languageTarget.getLanguage();
		}
		switch (language.toUpperCase()) {
		case "PYTHON" :
			return new GeneratorPythonCode();
		case "R" :
			return new GeneratorRCode();
		default : return null;
		}
	}

	private String getCommand (LanguageTarget languageTarget) {
		String language = "python";
		if (languageTarget != null) {
			language = languageTarget.getLanguage();
		}
		switch (language.toUpperCase()) {
		case "PYTHON" :
			return Command.getPython();
		case "R" :
			return Command.getR();
		default : return null;
		}
	}
	
	private static String getInfo(Model model) {
		LanguageTarget language = model.getLanguageTarget();
		Loop loop = model.getMl().getLoop();
		Dataset datas = model.getMl().getDataset();
		EvaluationType eval = model.getMl().getEvaluation();
		Algo algo = model.getMl().getAlgo();
		Calculate calculate = model.getMl().getCalculate();
		
		String info = "MLRegression {";
		info += "\n\tlanguage_target : " + language.getLanguage().toLowerCase();
		if (loop != null) {
			info += "\n\tloop : " + loop.getI();	
		}
		info += "\n\tdataset : " + datas.getDataPath();
		if (eval instanceof Partition) {
			info += "\n\tevaluation : partition";	
		} else {
			info += "\n\tevaluation : cross_validation";
		}
		info += "\n\talgo : " + algo.getAlgo();
		info += "\n\tcalculate : " + calculate.getCalculateType();
		info += "\n}";
		
		return info;
	}
}
