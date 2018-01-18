package com.jack.pattern.proxy;

/**
 * 实现类
 *
 * @author geqiang
 * @date 2018/1/16
 **/
public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        Food f=new Chicken();
        f.setChicken("1kg");
        f.setSpicy("1g");
        f.setSalt("3g");
        return f;
    }

    @Override
    public Food makeNoodle() {
        Food f=new Noodle();
        f.setNoodle("500g");
        f.setSalt("3g");
        return f;
    }
}
