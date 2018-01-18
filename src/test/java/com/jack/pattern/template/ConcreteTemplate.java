package com.jack.pattern.template;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class ConcreteTemplate extends AbstractTemplate{
    @Override
    protected void apply() {
        System.out.println("子类实现抽象方法 apply");
    }

    public void end(){
        System.out.println("我们可以把method3当做钩子方法来用，需要的时候复写就可以了");
    }
}
