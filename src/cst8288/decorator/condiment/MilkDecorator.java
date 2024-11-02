package cst8288.decorator.condiment;

import cst8288.decorator.BeverageDecorator;
import cst8288.decorator.beverage.Beverage;

public class MilkDecorator extends BeverageDecorator {
	
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.30;
    }
}
