package org.example.simple_factory;

public class UnsupportedProductException extends Exception {
    public UnsupportedProductException(String message) {
        super(message);
    }
}
