package com.jack.pattern.adapter;

/**
 * 客户端
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Client {
    public static void main(String[] args) {
        //有一只野鸡
        Cock wildCock=new WildCock();
        Duck duck=new DuckAdapter(wildCock);
        duck.quack();
        duck.fly();
    }
}
