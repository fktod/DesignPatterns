package singleton;

import org.example.simple_factory.Product;
import org.example.simple_factory.ProductType;
import org.example.simple_factory.SimpleFactory;
import org.junit.Test;

public class TestSimpleFactory {

    @Test
    public void test() throws Exception {
        SimpleFactory factory = new SimpleFactory();
        Product p1 = factory.makeProduct(ProductType.PRO_1);
        p1.show();
        Product p2 = factory.makeProduct(ProductType.PRO_2);
        p2.show();
        Product p3 = factory.makeProduct(ProductType.PRO_3);
        p3.show();
    }
}
