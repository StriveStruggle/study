package com.jack.pattern.strategy;

/**
 * 绿色笔
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class GreenPen implements Strategy{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
