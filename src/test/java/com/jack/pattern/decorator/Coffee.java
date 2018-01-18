package com.jack.pattern.decorator;

/**
 * 咖啡
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Coffee extends Beverage{
    @Override
    public String getDescription() {
        return "咖啡";
    }

    @Override
    public double cost() {
        return 8;
    }
}
