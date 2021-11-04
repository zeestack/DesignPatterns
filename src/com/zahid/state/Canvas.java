package com.zahid.state;

public class Canvas {

    private Tool tool;

    public Canvas(Tool tool){
        this.tool = tool;
    }

    public void mouseUp(){
        this.tool.mouseUp();
    }

    public void mouseDown(){
        this.tool.mouseDown();
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

}
