package com.jack.pattern.briage;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class RedPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
