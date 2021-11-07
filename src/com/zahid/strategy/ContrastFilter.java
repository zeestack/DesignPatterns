package com.zahid.strategy;

public class ContrastFilter implements  Filter{
    @Override
    public void apply(String fileName){
        System.out.println("Applying Contrast Filter");
    }
}
