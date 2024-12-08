package design.pattern;

import design.pattern.Factory.ConcreteFactoryA;
import design.pattern.Factory.ConcreteFactoryB;
import design.pattern.Factory.Factory;

import design.pattern.ChainOfRessponsability.Level1SupportHandler;
import design.pattern.ChainOfRessponsability.Level2SupportHandler;
import design.pattern.ChainOfRessponsability.Level3SupportHandler;
import design.pattern.ChainOfRessponsability.Priority;
import design.pattern.ChainOfRessponsability.Request;
import design.pattern.ChainOfRessponsability.SupportHandler;
import design.pattern.Decorator.BigPizza;
import design.pattern.Decorator.CheeseDecorator;
import design.pattern.Decorator.MushroomDecorator;
import design.pattern.Decorator.PeperoniDecorator;
import design.pattern.Decorator.Pizza;
import design.pattern.Factory.Product;
import design.pattern.Observer.Newspaper;
import design.pattern.Observer.WeatherDisplay;
import design.pattern.Observer.WeatherStation;
import design.pattern.Singleton.Singleton;

public class Main {
   
    public static void main(String[] args) {

    }

    /**
     * Demonstrates the Chain of Responsibility design pattern.
     * 
     * This method sets up a chain of support handlers with three levels:
     * Level 1, Level 2, and Level 3. Each handler is responsible for handling
     * requests of different priority levels.
     * 
     * The chain is configured as follows:
     * - Level 1 handler forwards requests to Level 2 handler if it cannot handle them.
     * - Level 2 handler forwards requests to Level 3 handler if it cannot handle them.
     * 
     * Three requests with different priority levels (BASIC, INTERMEDIATE, CRITICAL)
     * are created and passed through the chain starting from the Level 1 handler.
     * 
     * The handlers will process the requests according to their priority levels.
     */
    public static void ChainOfRessponsability(){
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request3);
    }

    /**
     * Demonstrates the Observer Pattern by simulating a weather station
     * that notifies its observers (displays) of changes in weather measurements.
     * 
     * The method performs the following steps:
     * 1. Creates a WeatherStation instance.
     * 2. Creates two observer instances: WeatherDisplay and Newspaper.
     * 3. Adds the observers to the WeatherStation.
     * 4. Updates the weather measurements, which triggers notifications to the observers.
     */
    public static void observerPattern(){
        WeatherStation weatherStation = new WeatherStation();
     
        WeatherDisplay display1 = new WeatherDisplay();
        Newspaper display2 = new Newspaper();
        
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.setMeasurements(25.5f, 65.0f);
        weatherStation.setMeasurements(27.3f, 70.0f);
    }


    /**
     * Demonstrates the Factory Pattern by creating products using different factories.
     * 
     * This method creates a product using ConcreteFactoryA and displays it.
     * Then, it creates another product using ConcreteFactoryB and displays it.
     * 
     * The Factory Pattern is used to create objects without specifying the exact class
     * of object that will be created. It relies on a factory interface to create the product.
     */
    public static void factoryPattern(){
       Factory factory = new ConcreteFactoryA();
       Product product = factory.createProduct();
       product.display();

       factory = new ConcreteFactoryB();
       product = factory.createProduct();
       product.display();
    }

    /**
     * Demonstrates the Singleton design pattern by calling the 
     * Singleton instance's doSomething method.
     * 
     * The Singleton pattern ensures that a class has only one instance 
     * and provides a global point of access to it.
     */
    @SuppressWarnings("static-access")
    public static void SingletonPattern(){
        Singleton.getInstance().doSomething();
    }

    /**
     * Demonstrates the use of the Decorator Pattern with a Pizza example.
     * 
     * The Decorator Pattern allows behavior to be added to an individual object, 
     * dynamically, without affecting the behavior of other objects from the same class.
     * 
     * This method creates a BigPizza object and decorates it with Cheese, Peperoni, 
     * and Mushroom decorators, printing the description and cost at each step.
     * 
     * Steps:
     * 1. Create a BigPizza object and print its description and cost.
     * 2. Decorate the pizza with CheeseDecorator and print the updated description and cost.
     * 3. Decorate the pizza with PeperoniDecorator and print the updated description and cost.
     * 4. Decorate the pizza with MushroomDecorator and print the updated description and cost.
     */
    public static void DecoratorPattern(){

        Pizza pizza = new BigPizza();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new PeperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

    }

}