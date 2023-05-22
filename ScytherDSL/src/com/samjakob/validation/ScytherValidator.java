package com.samjakob.validation;

import org.eclipse.xtext.validation.Check;
import com.samjakob.scyther.MessageEventType;
import com.samjakob.scyther.ScytherPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ScytherValidator extends AbstractScytherValidator {
	
	@Check
	public void checkReadNotUsedForMessageEvent(MessageEventType messageEventType) {
		if (messageEventType.getEventType().equals("read")) {
			warning(
				"The 'read' event is deprecated. Use 'recv' instead.",
				ScytherPackage.Literals.MESSAGE_EVENT_TYPE__EVENT_TYPE,
				ScytherConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART,
				messageEventType.getEventType(),
				"recv"
			);
		}
	}
	
}
