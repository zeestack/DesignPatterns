package com.zahid.facade;

//facede pattern to provide simple interface

public class NotificationService {

    public void send(String message, String destination){
        var connection = new Connection();
        var auth = new Authenticate();
        auth.authenticate("myid", "1234");
        var server = new NotificationServer();
        server.connect(connection);
        server.send(new Message(message), destination);
        connection.disconnect();

    }


}
