package cst8288.facade.subsystem;

import cst8288.facade.subsystem.Email;
import cst8288.facade.subsystem.Holiday;
import cst8288.facade.subsystem.Template;

public class EmailBuilder {
	
	Email email;

	public EmailBuilder withTemplate(Template template) {
		return this;
	}
	
	public EmailBuilder withHoliday(Holiday stationary) {
		return this;
	}
	
	public EmailBuilder forObject(Object object) {
		return this;
	}
	
	public Email build() {
		return email;
	}
	
	public Email getEmail() {
		return email;
	}
}
