package com.zahid.proxy;

public class ProxyEbook implements Ebook{


    private final String fileName;
    private RealEbook ebook;

    public ProxyEbook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(fileName);
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
