package com.jack.model;


import java.awt.*;

/**
 * @author geqiang on 2017/11/13
 */
public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        if (color == null) {
            throw new NullPointerException();
        }
        point = new Point(x, y);
        this.color = color;
    }

    /**
     * Returns the point-view of this color point.
     *
     * @return
     */
    public Point asPoint() {
        return point;
    }

    //Reminder omitted
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
        //If o is a normal Point,do a color-bind comparion
//        if(!(o instanceof ColorPoint)){
//            return o.equals(this);
//        }
        //o is a ColorPoint;do a full comparion
//        return super.equals(o)&&((ColorPoint) o).color==color;
    }

}
