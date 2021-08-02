package com.example.designpattern.factory;

public enum EnumFactory {

    Circle("Circle", new Circle()),
    Square("Square", new Square()),
    Rectangle("Rectangle", new Rectangle());
    // 成员变量
    private Shape shape;
    private String name;

    EnumFactory(String type, Shape shape) {
        this.name = type;
        this.shape = shape;
    }

    public Shape beanFactory(String type) {
        for (EnumFactory c : EnumFactory.values()) {
            if (c.name == name) {
                return c.shape;
            }
        }
        return null;
    }

}
