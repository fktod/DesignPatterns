package org.example.simple_factory;

public class SimpleFactory {
    public Product makeProduct(ProductType t) throws UnsupportedProductException {
        switch (t) {
            case PRO_1:
                return new ConcreteProduct1();
            case PRO_2:
                return new ConcreteProduct2();
            default:
                throw new UnsupportedProductException("不支持的产品类型。");
        }
    }
}
