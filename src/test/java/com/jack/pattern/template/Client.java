package com.jack.pattern.template;

/**
 * 客户端
 *
 * @author geqiang
 * @date 2018/1/18
 **/
public class Client {

    public static void main(String[] args) {
    AbstractTemplate template=new ConcreteTemplate();
    template.templateMethod();
    }
}
