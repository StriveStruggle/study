package com.jack.pattern.decorator;

/**
 * 绿茶
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class GreenTea extends Beverage{
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 11;
    }
}
