package com.zahid.command.fx;

public class Button {

    private String label;
    private Command command;


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }



}
