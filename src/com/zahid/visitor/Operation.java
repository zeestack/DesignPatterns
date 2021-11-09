package com.zahid.visitor;

public interface Operation {
    void apply(AnchorNode node);
    void apply(HeadingNode node);
}
