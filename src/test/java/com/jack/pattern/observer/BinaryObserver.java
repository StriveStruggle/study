package com.jack.pattern.observer;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    /**
     * 该方法由主题类在数据变更的时候进行调用
     */
    @Override
    public void update() {
        String result=Integer.toBinaryString(subject.getState());
        System.out.println("订阅的数据发生变化，新的数据处理为二进制值为：" + result);
    }
}
