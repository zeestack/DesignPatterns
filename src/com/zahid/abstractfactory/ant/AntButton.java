package com.zahid.abstractfactory.ant;

import com.zahid.abstractfactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button Rendered");
    }
}
