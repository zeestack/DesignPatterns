package com.zahid.command.editor;

public class Document {

    private String content;


    public Document(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    protected void makeBold() {
        this.content = "<b>" + content + "</b>";
    }
}
