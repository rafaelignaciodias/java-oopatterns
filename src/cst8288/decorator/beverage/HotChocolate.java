package cst8288.decorator.beverage;


public class HotChocolate implements Beverage {
    @Override
    public String getDescription() {
        return "Hot Chocolate";
    }

    @Override
    public double getCost() {
        return 2.50;
    }
}
