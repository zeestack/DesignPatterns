package com.zahid.chainOfResponsibility;

public class Logger extends Handler{
    public Logger(Handler handler) {
        super(handler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logger called");
        return false;
    }
}
