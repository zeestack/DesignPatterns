package com.zahid.command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> history = new ArrayDeque<>();

    public void push(UndoableCommand command){
        history.push(command);
    }

    public UndoableCommand pop() {
        return history.pop();
    }

    public int size(){
        return history.size();
    }
}
