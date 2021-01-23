/*
 * generated by Xtext 2.23.0
 */
package m2.idm.project.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import m2.idm.project.mLRegression.Model
import m2.idm.project.generator.GeneratorPythonCode
import m2.idm.project.generator.GeneratorRCode
import m2.idm.project.generator.InterpreterMLReg

@ExtendWith(InjectionExtension)
@InjectWith(MLRegressionInjectorProvider)
class MLRegressionParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	
	val code1 = '''
	target_language : python;
	import "soccer.csv";
	predictive_vars : "odds_ft_draw", "odds_ft_away_team_win";
	target_vars : "odds_ft_home_team_win";
	partition : 30%;
	algorithm : svr;
	calculate : mean_absolute_error;
	Loop : 3
	'''
	
	val code2 = '''
	target_language : r;
	import "soccer.csv";
	predictive_vars : "odds_ft_draw", "odds_ft_away_team_win";
	target_vars : "odds_ft_home_team_win";
	partition : 30%; 
	algorithm : svr;
	calculate : mean_absolute_error;
	Loop : 3
	'''
	
	@Test
	def void loadModel() {
		val resultP = parseHelper.parse(code1)
		val resultR = parseHelper.parse(code2)
		Assertions.assertNotNull(resultP)
		Assertions.assertNotNull(resultR)
		var errors = resultP.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		errors = resultR.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	@Test
	def void loadModelPython() {
		val result = parseHelper.parse(code1)
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val generator = new GeneratorPythonCode();
		val code = generator.generate(result.getMl);
		print(code);
	}
	
	@Test
	def void loadModelR() {
		val result = parseHelper.parse(code2)
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val generator = new GeneratorRCode();
		val code = generator.generate(result.getMl);
		print(code);
	}
	
	@Test
	def void interpreter() {
		val resultP = parseHelper.parse(code1)
		val resultR = parseHelper.parse(code2)
		
		val interpreter = new InterpreterMLReg();
		interpreter.compileAndRun(resultP);
		interpreter.compileAndRun(resultR);
	}
	
	
}
