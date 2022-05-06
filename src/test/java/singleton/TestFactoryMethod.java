package singleton;

import org.example.factory_method.*;
import org.junit.Test;

public class TestFactoryMethod {
    @Test
    public void test(){
        Factory f1 = new ConcreteFactory1();
        Product p1 = f1.makeProduct();
        p1.show();
        Factory f2 = new ConcreteFactory2();
        Product p2 = f2.makeProduct();
        p2.show();
    }
}
