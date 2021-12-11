package com.zahid.prototype;

public class Circle implements  Component {


    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering circle with radius : " + radius);
    }

    @Override
    public Component clone() {
        return new Circle(this.radius);
    }
}
