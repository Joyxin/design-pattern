package com.example.designpattern.observer;

public class OctalObserver extends Observer{

    @Override
    public void update() {
        System.out.println( "Octal String: " );
    }
}
