package com.zahid.abstractfactory.material;

import com.zahid.abstractfactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button Rendered");
    }
}
