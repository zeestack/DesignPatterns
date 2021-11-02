package com.zahid;


import com.zahid.command.*;
import com.zahid.command.fx.Button;
import com.zahid.command.editor.BoldUndoableCommand;
import com.zahid.command.editor.Document;
import com.zahid.command.editor.History;
import com.zahid.command.editor.UndoCommand;
import com.zahid.momento.*;
import com.zahid.template.GenerateReport;
import com.zahid.template.TransferMoney;

public class Main {

    public static void main(String[] args) {

        /* momento Pattern */
        var history = new com.zahid.momento.History();

        var editor = new Editor();

        editor.setContent("hello");
        history.push(editor.createState());

        editor.setContent("world");
        history.push(editor.createState());

        editor.setContent("green");
        
        System.out.println(editor.getContent());

        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());

    }


    public static void commandPatternDemo(){
        var moneyTransfer = new TransferMoney();
        moneyTransfer.execute();

        var reportGen = new GenerateReport();
        reportGen.execute();

        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();

        //series commands

        var commands = new SeriesCommand();
        commands.addCommand(new ResizeCommand());
        commands.addCommand(new BlackAndWhiteFilterCommand());
        commands.execute();


        //undoable command
        var history = new History();
        var doc = new Document("Hello World");
        var boldCommand = new BoldUndoableCommand(doc, history);

        boldCommand.execute();

        var undoCommand = new UndoCommand(history);

        undoCommand.execute();
        System.out.println(doc.getContent());

    }


}
