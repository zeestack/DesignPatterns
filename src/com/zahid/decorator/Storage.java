package com.zahid.decorator;

public class Storage implements Stream{

    @Override
    public void write(String data) {
        System.out.println("Storing data: " + data);
    }
}
