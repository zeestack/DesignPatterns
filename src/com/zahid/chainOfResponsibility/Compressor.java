package com.zahid.chainOfResponsibility;

public class Compressor extends Handler{

    public Compressor(Handler handler) {
        super(handler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compreesion");
        return false;
    }
}
