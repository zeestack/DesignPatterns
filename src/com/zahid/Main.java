package com.zahid;


import com.zahid.command.*;
import com.zahid.command.fx.Button;
import com.zahid.command.editor.BoldUndoableCommand;
import com.zahid.command.editor.Document;
import com.zahid.command.editor.History;
import com.zahid.command.editor.UndoCommand;
import com.zahid.iterator.BrowseHistory;
import com.zahid.iterator.ListIterator;
import com.zahid.memento.*;
import com.zahid.state.Brush;
import com.zahid.state.Canvas;
import com.zahid.state.Selection;
import com.zahid.template.GenerateReport;
import com.zahid.template.TransferMoney;

public class Main {

    public static void main(String[] args) {
        iteratorPatternDemo();
    }

    public static void iteratorPatternDemo(){
        var history = new BrowseHistory();
        var iterator = history.createIterator();

        history.push("abc");
        history.push("def");
        history.push("ghi");
        history.push("jkl");

        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }


    }

    public static void statePatternDemo(){
        var canvas = new Canvas(new Brush());
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setTool(new Selection());

        canvas.mouseUp();
        canvas.mouseDown();


    }

    public static void mementoPatternDemo() {
        /* memento Pattern */

        var history = new com.zahid.memento.History();
        var editor = new Editor();

        editor.setContent("hello");
        history.push(editor.createState());

        editor.setContent("world");
        history.push(editor.createState());
        editor.setContent("green");
        System.out.println(editor.getContent());

        /* undo green */
        editor.restoreState(history.pop());

        System.out.println("undo: " +editor.getContent());
    }

    public static void templatePatternDemo() {
        var moneyTransfer = new TransferMoney();
        moneyTransfer.execute();
        var reportGen = new GenerateReport();
        reportGen.execute();
    }

    public static void commandPatternDemo(){

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

        //undoBold
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(doc.getContent());

    }


}
