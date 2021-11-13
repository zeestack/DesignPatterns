package com.zahid.flyweight;

import java.util.HashMap;
import java.util.Map;

// get PointIcon if it does not have it will create it.
public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();
    public PointIcon getPointIcon(PointType type){
        if(!icons.containsKey(type)) {
            var icon = new PointIcon(type, null);
            icons.put(type, icon);
        }
        return icons.get(type);
    }
}
