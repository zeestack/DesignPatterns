package com.zahid;


import com.zahid.abstractfactory.ant.AntWidgetFactory;
import com.zahid.abstractfactory.app.ContactForm;
import com.zahid.abstractfactory.material.MaterialWidgetFactory;
import com.zahid.adapter.Image;
import com.zahid.adapter.ImageView;
import com.zahid.adapter.VividFilter;
import com.zahid.adapter.PheonixAdaptor;
import com.zahid.adapter.pheonixFilter.PheonixFilter;
import com.zahid.bridge.AdvancedRemoteControl;
import com.zahid.bridge.LgTV;
import com.zahid.builder.MovieBuilder;
import com.zahid.builder.PdfDocumentBuilder;
import com.zahid.builder.Presentation;
import com.zahid.builder.Slide;
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
import com.zahid.decorator.CompressedStream;
import com.zahid.decorator.EncryptStream;
import com.zahid.decorator.Storage;
import com.zahid.facade.NotificationService;
import com.zahid.factorymethod.ProductController;
import com.zahid.flyweight.PointIconFactory;
import com.zahid.flyweight.PointService;
import com.zahid.iterator.BrowseHistory;
import com.zahid.mediator.ArticlesDialogBox;
import com.zahid.memento.*;
import com.zahid.observer.Chart;
import com.zahid.observer.DataSource;
import com.zahid.observer.SpreadSheet;
import com.zahid.prototype.Circle;
import com.zahid.prototype.ContextMenu;
import com.zahid.proxy.Library;
import com.zahid.proxy.LoggingEbookProxy;
import com.zahid.proxy.ProxyEbook;
import com.zahid.proxy.RealEbook;
import com.zahid.singleton.ConfigManager;
import com.zahid.state.Brush;
import com.zahid.state.Canvas;
import com.zahid.state.Selection;
import com.zahid.strategy.*;
import com.zahid.template.GenerateReport;
import com.zahid.template.TransferMoney;
import com.zahid.visitor.*;

public class Main {

    public static void main(String[] args) {
        builderPatternDemo();
    }

    public static void builderPatternDemo(){
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        // var builder = new MovieBuilder();
        // presentation.export(builder);
        // var movie = builder.getMovie();

        // or
        var builder = new PdfDocumentBuilder();
        presentation.export(builder);
        var pdf = builder.getPdfDocument();
    }

    public static void abstractFactoryPatternDemo() {
        new ContactForm().render(new AntWidgetFactory());
        // new ContactForm().render(new MaterialWidgetFactory());
    }
    public static void factoryMethodPatternDemo(){
        var productController = new ProductController();
        productController.listProducts();
    }

    public static void singletonPatternDemo() {
        var configManager = ConfigManager.getInstance();
        configManager.set("name", "Zahid");
        System.out.println(configManager.get("name"));
        var configManager1 = ConfigManager.getInstance();
        System.out.println(configManager1.get("name"));
    }

    public static void prototypePatternDemo(){
        var circle = new Circle(5);

        var contextMenu = new ContextMenu();
        var circle2 = contextMenu.duplicate(circle);

        circle.render();
        circle2.render();

    }

    public static void proxyPatternDemo() {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for(var fileName : fileNames) {
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }

    public static void bridgePatternDemo(){
        // var remoteControl = new RemoteControl(new SonyTV());
         var remoteControl = new AdvancedRemoteControl(new LgTV());
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setChannel(10);
    }

    public static void flyweightPatternDemo(){
        var service = new PointService(new PointIconFactory());
        for(var point : service.getPoints())
            point.draw();
    }

    public static void facadePatternDemo(){
        var notificationService = new NotificationService();
        notificationService.send("Hellow World", "ip");
    }

    public static void decoratorPatternDemo(){
        var stream = new EncryptStream(new CompressedStream(new Storage()));

        stream.write("1234-1234-1234-1234");
    }

    public static void adaptorPatternDemo(){
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new PheonixAdaptor(new PheonixFilter()));
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
