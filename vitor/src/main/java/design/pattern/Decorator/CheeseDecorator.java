package design.pattern.Decorator;

/**
 * CheeseDecorator is a concrete decorator class that extends PizzaDecorator.
 * It adds cheese to the pizza by modifying the description and cost.
 */
public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
    
}
