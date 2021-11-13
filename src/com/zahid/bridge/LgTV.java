package com.zahid.bridge;

public class LgTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("LG Tv: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("LG Tv: turn off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("LG Tv: setChannel to: " + channel);
    }
}
