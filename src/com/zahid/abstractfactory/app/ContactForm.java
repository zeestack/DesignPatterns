package com.zahid.abstractfactory.app;

import com.zahid.abstractfactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        var button = factory.createButton();
        var textBox = factory.createTextBox();
        textBox.render();
        button.render();
    }
}
