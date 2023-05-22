/*
 * generated with Xtext 2.30.0
 */
package com.samjakob;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ScytherStandaloneSetup extends ScytherStandaloneSetupGenerated {

	public static void doSetup() {
		new ScytherStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
