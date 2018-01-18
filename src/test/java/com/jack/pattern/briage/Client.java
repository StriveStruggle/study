package com.jack.pattern.briage;

/**
 * 客户端
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Client {
    public static void main(String[] args) {
        Shape greenCircle =new Circle(10,new GreenPen());
        Shape redRectangle=new Rectangle(new RedPen(),4,8);
        greenCircle.draw();
        redRectangle.draw();
    }
}
