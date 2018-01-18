package com.jack.pattern.observer;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class Client {
    public static void main(String[] args) {
        //先定义一个主题
        Subject subject=new Subject();
        //定义观察者
        new BinaryObserver(subject);
        new HexaObserver(subject);

        //模拟数据变更，这个时候，观察者们的update方法将会被调用
        subject.setState(11);
    }
}
