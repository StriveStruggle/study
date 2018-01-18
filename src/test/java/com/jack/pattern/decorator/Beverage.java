package com.jack.pattern.decorator;

/**
 * 饮料抽象基类
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public abstract class Beverage {
    //返回描述
    public abstract String getDescription();
    //返回价格
    public abstract double cost();
}
