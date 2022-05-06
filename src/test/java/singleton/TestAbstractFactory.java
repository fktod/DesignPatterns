package singleton;

import org.example.abstract_factory.*;
import org.junit.Test;

public class TestAbstractFactory {
    @Test
    public void test(){
        Factory f1 = new ConcreteFactory1();
        ProductA pA1 = f1.makeProductA();
        ProductB pB1 = f1.makeProductB();
        pA1.showA();
        pB1.showB();
        Factory f2 = new ConcreteFactory2();
        ProductA pA2 = f2.makeProductA();
        ProductB pB2 = f2.makeProductB();
        pA2.showA();
        pB2.showB();
    }
}
