package com.zahid.decorator;

public class CompressedStream implements Stream{

    private final Stream stream;


    public CompressedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed = compressed(data);
        System.out.println("Compressed: " +  compressed);
        stream.write(compressed);
    }

    private String compressed(String data){
        return data.substring(0,5);
    }
}
