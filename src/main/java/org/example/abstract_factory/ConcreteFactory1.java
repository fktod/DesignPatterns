package org.example.abstract_factory;


public class ConcreteFactory1 implements Factory {
    @Override
    public ProductA makeProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB makeProductB() {
        return new ConcreteProductB1();
    }
}
