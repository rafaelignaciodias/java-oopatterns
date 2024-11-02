package cst8288.decorator.condiment;

import cst8288.decorator.BeverageDecorator;
import cst8288.decorator.beverage.Beverage;

public class WhippedCreamDecorator extends BeverageDecorator {
	
    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
