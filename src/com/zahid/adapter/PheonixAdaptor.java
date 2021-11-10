package com.zahid.adapter;

import com.zahid.adapter.pheonixFilter.PheonixFilter;

public class PheonixAdaptor implements Filter {


    private PheonixFilter pheonixFilter ;


    public PheonixAdaptor(PheonixFilter pheonixFilter) {
        this.pheonixFilter = pheonixFilter;
    }

    @Override
    public void apply(Image image) {
        pheonixFilter.init(image);
        System.out.println("applying pheonix filter to the image");
    }
}
