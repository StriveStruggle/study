package com.jack.pattern.briage;

/**
 * 圆圈
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Circle extends Shape{
    private int radius;

    public Circle(int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius,0,0);
    }
}
