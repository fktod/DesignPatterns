package org.example.factory_method;

public class ConcreteFactory2 implements Factory {
    @Override
    public Product makeProduct() {
        return new ConcreteProduct2();
    }
}
