package design.pattern.Factory;

public class ConcreteFactoryA implements Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
    
}
