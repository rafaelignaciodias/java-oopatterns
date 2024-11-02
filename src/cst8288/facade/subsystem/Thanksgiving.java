package cst8288.facade.subsystem;

import cst8288.facade.subsystem.Holiday;

public class Thanksgiving implements Holiday {

	@Override
	public String getHeader() {
		return "Happy Thanksgiving";
	}

	@Override
	public String getFooter() {
		return "We are grateful for what we have in our life";
	}

}
