/*
 * generated with Xtext 2.30.0
 */
package com.samjakob.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import com.samjakob.ide.highlighting.ScytherSemanticHighlightingCalculator;
import com.samjakob.ui.highlighting.ScytherHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class ScytherUiModule extends AbstractScytherUiModule {

	public ScytherUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		return ScytherSemanticHighlightingCalculator.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindSemanticHighlightingConfiguration() {
		return ScytherHighlightingConfiguration.class;
	}
	
}
