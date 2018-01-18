package com.jack.pattern.briage;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class GreenPen implements DrawAPI{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
