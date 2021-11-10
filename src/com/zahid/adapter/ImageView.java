package com.zahid.adapter;

public class ImageView {

    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter){
        filter.apply(this.image);
    }
}
