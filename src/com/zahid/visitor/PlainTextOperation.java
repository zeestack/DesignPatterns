package com.zahid.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(AnchorNode node) {
        System.out.println("PlainText-anchor node");
    }

    @Override
    public void apply(HeadingNode node) {
        System.out.println("PlainText-Heading node");
    }
}
