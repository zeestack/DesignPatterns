package com.zahid.visitor;

public class HighlightOperation implements Operation{

    @Override
    public void apply(AnchorNode node) {
        System.out.println("highlighting-anchor node");
    }

    @Override
    public void apply(HeadingNode node) {
        System.out.println("highlighting-heading node");
    }
}
