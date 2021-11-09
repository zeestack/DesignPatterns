package com.zahid.chainOfResponsibility;

public class HttpRequest {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
