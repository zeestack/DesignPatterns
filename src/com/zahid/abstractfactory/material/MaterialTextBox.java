package com.zahid.abstractfactory.material;

import com.zahid.abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendered Material TextBox");
    }
}
