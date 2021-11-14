package com.zahid.abstractfactory.ant;

import com.zahid.abstractfactory.Button;
import com.zahid.abstractfactory.TextBox;
import com.zahid.abstractfactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
