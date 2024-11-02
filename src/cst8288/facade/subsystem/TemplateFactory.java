package cst8288.facade.subsystem;

import cst8288.facade.subsystem.OrderEmailTemplate;
import cst8288.facade.subsystem.OrderNewsLetterTemplate;
import cst8288.facade.subsystem.Template;
import cst8288.facade.subsystem.TemplateEnum;

public class TemplateFactory {

	public static Template createTemplateFor(TemplateEnum type) {
		switch (type) {
		case Order:
			return new OrderEmailTemplate();
		case NewsLetter:
			return new OrderNewsLetterTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}
		
	}
}
