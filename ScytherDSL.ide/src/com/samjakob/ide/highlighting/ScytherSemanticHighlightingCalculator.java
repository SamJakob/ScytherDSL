package com.samjakob.ide.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.util.CancelIndicator;

import com.samjakob.scyther.ClaimEventType;
import com.samjakob.scyther.MatchEventType;
import com.samjakob.scyther.MessageEventType;
import com.samjakob.scyther.ScytherPackage;

public class ScytherSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator implements ScytherHighlightingStyles {
	
	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if (object instanceof MessageEventType) {
			highlightFeature(acceptor, object, ScytherPackage.Literals.MESSAGE_EVENT_TYPE__EVENT_TYPE, EVENT_ID);
			highlightFeature(acceptor, object, ScytherPackage.Literals.MESSAGE_EVENT_TYPE__LABEL, LABEL_ID);
		}
		
		if (object instanceof ClaimEventType) {
			highlightFeature(acceptor, object, ScytherPackage.Literals.CLAIM_EVENT_TYPE__EVENT_TYPE, EVENT_ID);
			highlightFeature(acceptor, object, ScytherPackage.Literals.CLAIM_EVENT_TYPE__LABEL, LABEL_ID);
		}
		
		if (object instanceof MatchEventType) {
			highlightFeature(acceptor, object, ScytherPackage.Literals.MATCH_EVENT_TYPE__EVENT_TYPE, EVENT_ID);
			highlightFeature(acceptor, object, ScytherPackage.Literals.MATCH_EVENT_TYPE__LABEL, LABEL_ID);
		}
		
		if (object instanceof com.samjakob.scyther.Type) {
			highlightFeature(acceptor, object, ScytherPackage.Literals.TYPE__TYPE, TYPE_ID);
		}
		
		return super.highlightElement(object, acceptor, cancelIndicator);
	}
	
}
