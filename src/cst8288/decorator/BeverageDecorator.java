package cst8288.decorator;

import cst8288.decorator.beverage.Beverage;

public abstract class BeverageDecorator implements Beverage {

	protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

}
