package com.jack.pattern.observer;

/**
 * 观察者
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
