package com.zahid.momento;

public class EditorState {

    private String content;

    public EditorState(String content){
        this.content = content;
    }

    public String getEditorStateContent(){
        return this.content;
    }

}
