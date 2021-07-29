package com.example.designpattern.facade;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
