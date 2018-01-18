package com.jack.pattern.briage;

/**
 * 长方形
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(DrawAPI drawAPI, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.draw(0, x, y);
    }
}
