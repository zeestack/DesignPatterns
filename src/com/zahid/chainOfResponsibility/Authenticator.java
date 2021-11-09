package com.zahid.chainOfResponsibility;

public class Authenticator extends Handler{

    public Authenticator(Handler handler) {
        super(handler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = request.getUsername() == "admin" && request.getPassword() == "1234";
        System.out.println("Authentication");
        return !isValid;
    }
}
