package com.example.designpattern.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
