package com.jack.pattern.decorator;

/**
 * 红茶
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class BlcakTea extends Beverage {
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
