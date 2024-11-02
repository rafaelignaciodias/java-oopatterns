package cst8288.decorator.condiment;

import cst8288.decorator.BeverageDecorator;
import cst8288.decorator.beverage.Beverage;

public class SugarDecorator extends BeverageDecorator {
	
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.20;
    }
}