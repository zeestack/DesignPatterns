package com.zahid.mediator;

public class ArticlesDialogBox {

    private final ListBox listBox = new ListBox();
    private final TextBox textBox = new TextBox();
    private final Button button = new Button();

    public void simulateEvents() {
        listBox.setSelection("Hello World");
        System.out.println("TextBox Value={" + textBox.getValue() + "}");
        System.out.println("Button value={" + button.isEnabled() + "}");

        listBox.setSelection("");
        System.out.println("TextBox Value={" + textBox.getValue() + "}");
        System.out.println("Button value={" + button.isEnabled() + "}");

        listBox.setSelection("Canada");
        System.out.println("TextBox Value={" + textBox.getValue() + "}");
        System.out.println("Button value={" + button.isEnabled() + "}");
    }

    public ArticlesDialogBox() {
        //using method reference to implement observer interface.
        listBox.attachEventHandler(this::itemSelected);
        textBox.attachEventHandler(this::titleChanged);
    }


    public void itemSelected() {
        textBox.setValue(listBox.getSelection());
    }

    public void titleChanged() {
        var selection = listBox.getSelection();
        var isEmpty = (selection == null || selection.isEmpty());
        button.setEnabled(!isEmpty);
    }
}
