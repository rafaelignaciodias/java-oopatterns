package cst8288.decorator;

import cst8288.decorator.beverage.Beverage;
import cst8288.decorator.beverage.Coffee;
import cst8288.decorator.beverage.Tea;
import cst8288.decorator.condiment.MilkDecorator;
import cst8288.decorator.condiment.SugarDecorator;
import cst8288.decorator.condiment.WhippedCreamDecorator;


// Client code

public class Client {
 
	public static void main(String args[]) {
		
		Beverage coffeBeverage = new Coffee();
		
		System.out.println(coffeBeverage.getDescription());
		System.out.println(coffeBeverage.getCost());
		
		
		coffeBeverage = new MilkDecorator(coffeBeverage);
//		
//		
		System.out.println(coffeBeverage.getDescription());
		System.out.println(coffeBeverage.getCost());
//		
		coffeBeverage = new SugarDecorator(coffeBeverage);
//		
		System.out.println(coffeBeverage.getDescription());
		System.out.println(coffeBeverage.getCost());
//		
		coffeBeverage = new WhippedCreamDecorator(coffeBeverage);
		
		System.out.println(coffeBeverage.getDescription());
		System.out.println(coffeBeverage.getCost());
		
		
		Beverage teaBeverage = new Tea();
		
		
		
		teaBeverage = new SugarDecorator(teaBeverage);
		
		System.out.println(teaBeverage.getDescription());
		System.out.println(teaBeverage.getCost());
		
		
		teaBeverage = new WhippedCreamDecorator(teaBeverage);
		
		System.out.println(teaBeverage.getDescription());
		System.out.println(teaBeverage.getCost());
		
		
		
		
		
		
		
	}
}
