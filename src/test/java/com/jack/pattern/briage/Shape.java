package com.jack.pattern.briage;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
