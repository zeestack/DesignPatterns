package com.zahid.observer;

public class SpreadSheet implements Observer{

    private final DataSource dataSource;
    private final String sheetName;

    public SpreadSheet(String sheetName, DataSource dataSource){
        this.dataSource = dataSource;
        this.sheetName = sheetName;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet (" + this.sheetName +") received new value from the dataSource: value=" +  dataSource.getValue());
    }
}
