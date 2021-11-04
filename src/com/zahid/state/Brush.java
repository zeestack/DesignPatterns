package com.zahid.state;

public class Brush implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Using brush to draw line...");
    }

    @Override
    public void mouseDown() {
        System.out.println("painted line using brush tool...");
    }
}
