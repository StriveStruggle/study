package com.jack.pattern.facade;

/**
 * 圆圈
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
