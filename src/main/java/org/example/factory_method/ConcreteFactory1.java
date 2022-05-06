package org.example.factory_method;

public class ConcreteFactory1 implements Factory{
    @Override
    public Product makeProduct() {
        return new ConcreteProduct1();
    }
}
