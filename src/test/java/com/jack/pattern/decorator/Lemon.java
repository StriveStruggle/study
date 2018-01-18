package com.jack.pattern.decorator;

/**
 * 柠檬
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Lemon extends Condiment {
    private Beverage beverage;
    //这里很关键，需要传入具体的材料，如需要传入没有被装饰的红茶或绿茶，
    //当然也可以传入已经装饰好的芒果绿茶，这样可以做芒果柠檬绿茶

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //装饰
        return beverage.getDescription()+",加柠檬";
    }

    @Override
    public double cost() {
        return beverage.cost()+2;//加柠檬需要2元
    }
}
