package com.zahid.memento;

public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(this.content);
    }

    public void restoreState(EditorState state){
        if(state != null)
        this.content = state.getEditorStateContent();
    }

}
