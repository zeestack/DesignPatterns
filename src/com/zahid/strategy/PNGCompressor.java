package com.zahid.strategy;

public class PNGCompressor implements  Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println("Applying PNG Compression...");
    }
}
