package com.zahid.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
