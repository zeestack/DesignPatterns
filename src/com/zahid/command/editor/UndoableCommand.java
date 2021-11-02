package com.zahid.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
