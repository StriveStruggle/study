package com.jack.pattern.adapter;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class WildCock implements Cock {


    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡也会飞哦");
    }
}
