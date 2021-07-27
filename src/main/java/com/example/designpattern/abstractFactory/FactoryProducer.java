package com.example.designpattern.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if ("color".equals(factory)) {
            return new ColorFactory();
        } else {
            return new ShapeFactory();
        }
    }


}
