package com.jack.pattern.strategy;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class Client {

    public static void main(String[] args) {
    Context context=new Context(new RedPen());//使用绿色笔来画
        context.executeDraw(10,2,0);
    }
}
