package com.zahid.proxy;

public class RealEbook implements Ebook {

    private final String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        //simulating loading from the disks
        System.out.println("Loading the ebook :" + fileName);
    }

    @Override
    public void show(){
        System.out.println("Showing the ebook :"+ fileName);
    }
    @Override
    public String getFileName(){
        return this.fileName;
    }
}
