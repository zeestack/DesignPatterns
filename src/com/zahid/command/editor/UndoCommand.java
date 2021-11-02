package com.zahid.command.editor;

public class UndoCommand implements Command{
    private UndoableCommand commad;

    public UndoCommand (History history) {
        if(history.size() > 0)
            this.commad = history.pop();
    }

    @Override
    public void execute() {
        if(commad != null)
        this.commad.unexecute();
    }

}
