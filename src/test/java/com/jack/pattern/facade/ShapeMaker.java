package com.jack.pattern.facade;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class ShapeMaker {
    private Shape circle;
    private Shape retangle;
    private Shape square;

    public ShapeMaker() {
        circle=new Circle();
        retangle=new Rectangle();
        square=new Square();
    }

    /**
     * 下面定义一堆方法，具体调用什么方法，由这个门面来决定
     */
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        retangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
