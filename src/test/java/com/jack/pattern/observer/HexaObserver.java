package com.jack.pattern.observer;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String result=Integer.toHexString(subject.getState()).toUpperCase();
        System.out.println("订阅的数据发生变化，新的数据处理为十六进制值为：" + result);
    }
}
