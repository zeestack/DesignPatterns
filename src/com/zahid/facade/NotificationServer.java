package com.zahid.facade;

public class NotificationServer {

    public void connect(Connection connection){
        System.out.println("connected");
    }

    public void send(Message message, String destination){
        System.out.println("sent");
    }


}
