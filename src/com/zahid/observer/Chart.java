package com.zahid.observer;

public class Chart implements  Observer {
    private final DataSource dataSource ;
    public String chartTitle;

   public Chart(String chartTitle, DataSource dataSource){
       this.dataSource = dataSource;
       this.chartTitle = chartTitle;
   }

    @Override
    public void update() {
        System.out.println("Chart : ("+ this.chartTitle +") received new value from dataSource. value=" + dataSource.getValue());
    }
}
