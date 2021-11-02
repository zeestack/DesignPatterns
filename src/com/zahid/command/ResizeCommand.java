package com.zahid.command;

import com.zahid.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing Image...");
    }
}
