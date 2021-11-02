package com.zahid.command;

import com.zahid.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class SeriesCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for(var command : commands) {
            command.execute();
        }
    }
}
