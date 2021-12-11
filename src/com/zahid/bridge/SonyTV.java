package com.zahid.bridge;

public class SonyTV implements Device{

    @Override
    public void turnOn() {
        System.out.println("SonyTv: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("SonyTv: Turn off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("SonyTv: setChannel to: "+channel);
    }
}
