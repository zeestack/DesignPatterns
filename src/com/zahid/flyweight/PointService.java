package com.zahid.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private final List<Point> points = new ArrayList<>();
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
        points.add(new Point(1,2, this.iconFactory.getPointIcon(PointType.SCHOOL)));
    }

    public List<Point> getPoints(){
        return points;
    }

}
