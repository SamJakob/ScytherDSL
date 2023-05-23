package com.samjakob.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

import com.samjakob.ide.highlighting.ScytherHighlightingStyles;

public class ScytherHighlightingConfiguration extends DefaultHighlightingConfiguration implements IHighlightingConfiguration {

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(ScytherHighlightingStyles.EVENT_ID, "Scyther Event", eventStyle());
		
		acceptor.acceptDefaultHighlighting(ScytherHighlightingStyles.LABEL_ID, "Scyther Label", labelStyle());
		acceptor.acceptDefaultHighlighting(ScytherHighlightingStyles.TYPE_ID, "Scyther Type", typeStyle());
		
		super.configure(acceptor);
	}
	
	
	public TextStyle typeStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.ITALIC);
		textStyle.setColor(new RGB(74, 222, 128));
		return textStyle;
	}
	
	
	
	public TextStyle eventStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(14, 165, 233));
		return textStyle;
	}
	
	public TextStyle labelStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(99, 102, 241));
		return textStyle;
	}

}
