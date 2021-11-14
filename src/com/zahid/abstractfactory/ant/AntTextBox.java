package com.zahid.abstractfactory.ant;

import com.zahid.abstractfactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox Rendered");
    }
}
