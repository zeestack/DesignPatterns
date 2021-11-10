package com.zahid.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{

    private List<Component> shapes = new ArrayList<>();

    public void add(Component shape){
        shapes.add(shape);
    }

    public void remove(Component shape){
        shapes.remove(shape);
    }

    @Override
    public void render() {
        System.out.println("Rendered Group");
        for(var shape: shapes){
            shape.render();
        }
    }
}
