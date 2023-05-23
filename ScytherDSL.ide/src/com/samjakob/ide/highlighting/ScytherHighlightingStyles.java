package com.samjakob.ide.highlighting;

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;

public interface ScytherHighlightingStyles extends HighlightingStyles {
	
	// Type = Type
	
	// Protocol = Class
	// Role = Method
	// Agent = TypeParameter
	
	// Label = Function
	
	String EVENT_ID = "event";
	
	String TYPE_ID = "type";
	
	String LABEL_ID = "function";

}
