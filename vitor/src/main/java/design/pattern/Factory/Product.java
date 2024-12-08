package design.pattern.Factory;

/**
 * The Product interface defines a contract for products that can be created by a factory.
 * Any class implementing this interface must provide an implementation for the display method.
 */
public interface Product {
    public abstract void display();
}
