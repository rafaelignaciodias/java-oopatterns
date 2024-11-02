package cst8288.facacde;

import cst8288.facade.subsystem.Email;
import cst8288.facade.subsystem.Holiday;
import cst8288.facade.subsystem.HolidayEnum;
import cst8288.facade.subsystem.HolidayFactory;
import cst8288.facade.subsystem.Mailer;
import cst8288.facade.subsystem.Template;
import cst8288.facade.subsystem.TemplateEnum;
import cst8288.facade.subsystem.TemplateFactory;

public class Facade {
	
	
	public boolean sentOrderEmail(Order order) {
		
		Template template = TemplateFactory.createTemplateFor(TemplateEnum.NewsLetter);
		
		Holiday holiday = HolidayFactory.createStationary(HolidayEnum.Halloween);
		
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withHoliday(holiday)
					  .forObject(order)
					  .build();
		
		Mailer mailer = new Mailer();
		boolean isSent = mailer.send(email);
		return isSent;
	}
	
	

}
