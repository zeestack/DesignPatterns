package com.zahid.mediator;

public class TextBox extends  UIControl{

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        this.notifyEventHandlers();
    }


}
