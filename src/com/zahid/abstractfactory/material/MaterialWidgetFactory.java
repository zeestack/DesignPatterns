package com.zahid.abstractfactory.material;

import com.zahid.abstractfactory.Button;
import com.zahid.abstractfactory.TextBox;
import com.zahid.abstractfactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
