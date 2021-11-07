package com.zahid.strategy;

public class BlackAndWhiteFilter implements  Filter{

    @Override
    public void apply(String fileName) {
        System.out.println("Applying Black&White Filter");
    }
}
