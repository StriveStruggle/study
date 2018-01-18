package com.jack.pattern.proxy;

/**
 * 代理类
 *
 * @author geqiang
 * @date 2018/1/16
 **/
public class FoodServiceProxy implements FoodService {
    //内部一定要有一个真实的实现类，当然也可以用过构造方法注入
    private FoodService foodService=new FoodServiceImpl();

    @Override
    public Food makeChicken() {
        System.out.println("我们马上要开始制作鸡肉了");
        Food food=foodService.makeChicken();
        System.out.println("鸡肉制作完成啦，加点胡椒粉");//增强
        food.addCondiment("pepper");
        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("准备制作拉面...");
        Food food = foodService.makeNoodle();
        System.out.println("制作完成啦");
        return food;
    }
}
