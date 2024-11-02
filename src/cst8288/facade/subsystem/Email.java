package cst8288.facade.subsystem;

import cst8288.facade.subsystem.EmailBuilder;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
