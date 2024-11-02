package cst8288.facade.subsystem;

import cst8288.facade.subsystem.Holiday;

public class Halloween implements Holiday {

	@Override
	public String getHeader() {
		return "It's Halloween!!";
	}

	@Override
	public String getFooter() {
		return "BUY MORE STUFF! It's Halloween, c'mon!!";
	}

}
