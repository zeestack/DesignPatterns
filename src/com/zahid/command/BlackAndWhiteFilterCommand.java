package com.zahid.command;

import com.zahid.command.fx.Command;

public class BlackAndWhiteFilterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White Filter applied");
    }
}
