package com.jack.pattern.strategy;

/**
 * 红笔
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class RedPen implements Strategy{

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
