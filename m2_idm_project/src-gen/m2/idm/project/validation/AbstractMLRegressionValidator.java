/*
 * generated by Xtext 2.23.0
 */
package m2.idm.project.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMLRegressionValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(m2.idm.project.mLRegression.MLRegressionPackage.eINSTANCE);
		return result;
	}
}
