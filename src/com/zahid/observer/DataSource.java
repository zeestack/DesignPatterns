package com.zahid.observer;

public class DataSource extends ActiveObservers {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.notifyObservers();
    }


}
