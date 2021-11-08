package com.zahid.observer;

import java.util.ArrayList;
import java.util.List;

public class ActiveObservers {

    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
       this.observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
