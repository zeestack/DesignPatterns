package com.zahid.strategy;

public class JPEGCompressor implements  Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println("Applying Compression using JPEG Algorithm");
    }
}
