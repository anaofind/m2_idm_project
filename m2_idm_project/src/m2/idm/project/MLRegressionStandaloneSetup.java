/*
 * generated by Xtext 2.23.0
 */
package m2.idm.project;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MLRegressionStandaloneSetup extends MLRegressionStandaloneSetupGenerated {

	public static void doSetup() {
		new MLRegressionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
