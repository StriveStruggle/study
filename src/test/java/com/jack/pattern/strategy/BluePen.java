package com.jack.pattern.strategy;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class BluePen implements Strategy{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
