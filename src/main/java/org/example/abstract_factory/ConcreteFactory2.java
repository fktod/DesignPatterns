package org.example.abstract_factory;


public class ConcreteFactory2 implements Factory {
    @Override
    public ProductA makeProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB makeProductB() {
        return new ConcreteProductB2();
    }
}
