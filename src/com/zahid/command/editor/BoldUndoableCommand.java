package com.zahid.command.editor;

public class BoldUndoableCommand implements UndoableCommand{

    private String prevContent;
    private Document doc;
    private History history;

    public BoldUndoableCommand(Document doc, History history){
        this.doc = doc;
        this.history = history;
    }

    @Override
    public void execute() {
        this.prevContent = doc.getContent();
        this.doc.makeBold();
        history.push(this);
    }


    @Override
    public void unexecute() {
        this.doc.setContent(prevContent);
    }
}
