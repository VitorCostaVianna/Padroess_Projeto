package design.pattern.Decorator;

/**
 * Abstract class representing a decorator for a Pizza.
 * This class implements the Pizza interface and is designed to be extended by concrete decorators.
 * It holds a reference to a Pizza object and delegates the calls to the wrapped Pizza object.
 */
public abstract class PizzaDecorator implements Pizza  {
    
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
