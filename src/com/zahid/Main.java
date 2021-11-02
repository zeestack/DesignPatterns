package com.zahid;


import com.zahid.command.*;
import com.zahid.command.fx.Button;
import com.zahid.template.GenerateReport;
import com.zahid.template.TransferMoney;

public class Main {

    public static void main(String[] args) {
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



    }


}