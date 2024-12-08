package design.pattern.Factory;

/**
 * Factory interface for creating products.
 * This interface defines a method for creating objects of type Product.
 * Implementing classes should provide the concrete implementation of the createProduct method.
 */
public interface Factory {
    public abstract Product createProduct();
}
