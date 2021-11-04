package com.zahid.state;

public class Selection implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("starting selection...");
    }

    @Override
    public void mouseDown() {
        System.out.println("selected...");
    }
}
