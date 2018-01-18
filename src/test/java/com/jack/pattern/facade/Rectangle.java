package com.jack.pattern.facade;

/**
 * 长方形
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
