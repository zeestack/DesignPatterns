package com.zahid.decorator;

public class EncryptStream implements Stream {

    private final Stream stream;

    public EncryptStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        System.out.println("Encrypt: " + encrypted);
        stream.write(encrypted);
    }

    private String encrypt(String data){
        return "*&%*-*&%*-*&%*-*&%*";
    }
}
