package design.pattern.Decorator;

public class PeperoniDecorator extends PizzaDecorator {

    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Peperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
    
}
