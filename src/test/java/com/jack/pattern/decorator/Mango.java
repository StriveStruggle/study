package com.jack.pattern.decorator;

/**
 * 芒果
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Mango extends Condiment{
    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",加芒果";
    }

    @Override
    public double cost() {
        return beverage.cost()+3;//加芒果需要3元
    }
}
