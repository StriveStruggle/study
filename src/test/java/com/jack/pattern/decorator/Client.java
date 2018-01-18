package com.jack.pattern.decorator;

import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * 客户端
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Client {
    public static void main(String[] args) {
        //首先，我们需要一个基础饮料，红茶、绿茶或咖啡
        Beverage beverage=new Coffee();
        //开始装饰
        beverage=new Lemon(beverage);//先加一份柠檬
        beverage=new Mango(beverage);//再加一份芒果
//        Beverage beverage=new Mango(new Lemon(new Lemon(new BlcakTea())));
        System.out.println(beverage.getDescription()+" 价格:￥"+beverage.cost());
    }
}
