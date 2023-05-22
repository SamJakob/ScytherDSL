/*
 * generated with Xtext 2.30.0
 */
package com.samjakob.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.samjakob.ScytherRuntimeModule;
import com.samjakob.ScytherStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ScytherIdeSetup extends ScytherStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ScytherRuntimeModule(), new ScytherIdeModule()));
	}
	
}
