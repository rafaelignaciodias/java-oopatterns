package cst8288.facade.subsystem;

import cst8288.facade.subsystem.Halloween;
import cst8288.facade.subsystem.Holiday;
import cst8288.facade.subsystem.HolidayEnum;
import cst8288.facade.subsystem.Thanksgiving;

public class HolidayFactory {

	public static Holiday createStationary(HolidayEnum type) {
			switch (type) {
			case Halloween:
				return new Halloween();
			case Thanksgiving:
				return new Thanksgiving();
			default:
				throw new IllegalArgumentException("Unknown TemplateType");
			}
			
		}
}
