package design.pattern.Decorator;

public class BigPizza implements Pizza {
    
    @Override
    public String getDescription() {
        return "Big Pizza";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
