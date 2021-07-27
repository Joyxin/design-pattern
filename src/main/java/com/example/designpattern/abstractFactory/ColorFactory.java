package com.example.designpattern.abstractFactory;

public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        if ("Bule".equals(color)) {
            return new Bule();
        } else if ("Red".equals(color)) {
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
