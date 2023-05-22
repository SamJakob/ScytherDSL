/*
 * generated with Xtext 2.30.0
 */
package com.samjakob.ui.quickfix;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.samjakob.validation.ScytherConfigurableIssueCodesProvider;

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class ScytherQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(ScytherConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART)
	public void fixReadUsedForMessageEvent(
		final Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		if (issue.getData().length < 2) return;
		final String from = issue.getData()[0];
		final String to = issue.getData()[1];
		
		acceptor.accept(
			issue,
			"Replace use of 'read' with 'recv'",
			String.format("%s is deprecated. Replace '%<s' with '%s'.", from, to),
			null,
			(IModificationContext context) -> {
				final IXtextDocument document = context.getXtextDocument();
				document.replace(issue.getOffset(), from.length(), to);
			}
		);
	}

}
