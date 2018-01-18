package com.jack.pattern.facade;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
