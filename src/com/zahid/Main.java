package com.zahid;


import com.zahid.chainOfResponsibility.*;
import com.zahid.chainOfResponsibility.Compressor;
import com.zahid.command.*;
import com.zahid.command.fx.Button;
import com.zahid.command.editor.BoldUndoableCommand;
import com.zahid.command.editor.Document;
import com.zahid.command.editor.History;
import com.zahid.command.editor.UndoCommand;
import com.zahid.composite.CircleShape;
import com.zahid.composite.Group;
import com.zahid.composite.SquareShape;
import com.zahid.iterator.BrowseHistory;
import com.zahid.iterator.ListIterator;
import com.zahid.mediator.ArticlesDialogBox;
import com.zahid.memento.*;
import com.zahid.observer.Chart;
import com.zahid.observer.DataSource;
import com.zahid.observer.SpreadSheet;
import com.zahid.state.Brush;
import com.zahid.state.Canvas;
import com.zahid.state.Selection;
import com.zahid.strategy.*;
import com.zahid.template.GenerateReport;
import com.zahid.template.TransferMoney;
import com.zahid.visitor.*;

public class Main {

    public static void main(String[] args) {
        compositePatternDemo();
    }

    public static void compositePatternDemo(){
        var group1 = new Group();
        var group2 = new Group();
        var shape1 = new CircleShape();
        var shape2 = new SquareShape();

        group1.add(shape1);
        group1.add(shape2);

        group2.add(group1);


        group2.render();
    }

    public static void visitorPatternDemo(){
        var document = new HtmlDocument();
        document.addNode(new AnchorNode());
        document.addNode(new HeadingNode());
        var operation1 = new HighlightOperation();
        var operation2 = new PlainTextOperation();
        document.execute(operation1);
        document.execute(operation2);
    }

    public static void chainOfResponsibilityPatternDemo(){
        //pipeline --> authentication -> logger -> compression
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }

    public static void mediatorPatternDemo() {
        var dialogBox = new ArticlesDialogBox();
        dialogBox.simulateEvents();
    }

    public static void observerPatternDemo(){
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet("sheet1", dataSource);
        var sheet2 = new SpreadSheet("sheet2", dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);

        var chart = new Chart("piechart",dataSource);

        dataSource.addObserver(chart);


        dataSource.setValue(1);

        dataSource.setValue(5);

    }

    public static void strategyPatternDemo(){
        var storeImage = new ImageStorage(new PNGCompressor(), new ContrastFilter());
        storeImage.store("C:\\zahid.jpg");
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
