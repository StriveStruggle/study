package com.jack.model;

/**
 * @author geqiang on 2017/12/26
 */
public class SynchronizedExample {
    int a = 0;
    boolean flag = false;
    /**
     * 获取锁
     */
    public synchronized void writer() {
        a = 1;
        flag = true;
    }

    //释放锁
    public synchronized void reader() {
        if (flag) {
            int i = a;
        System.out.println("i:"+i);
        }
    }

}
