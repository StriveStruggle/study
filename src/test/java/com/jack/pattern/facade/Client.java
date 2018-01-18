package com.jack.pattern.facade;

/**
 * 客户端
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
        Shape square = new Square();
        square.draw();
        System.out.println("---------------------------------");
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
