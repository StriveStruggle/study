package com.jack.atomic;

import com.jack.model.SynchronizedExample;

/**
 * @author geqiang on 2017/12/23
 */
public class TestSynchronizedExample {
    final int a=1;


    public static void main(String[] args) {
//        new TestSynchronizedExample().test();
        new TestSynchronizedExample().join();
    }
    public void test(){
        final SynchronizedExample s = new SynchronizedExample();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                s.writer();
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                s.reader();
            }
        });
        a.start();
        b.start();
    }

    public  void join(){
        Thread b=new Thread(new Runnable() {
            @Override
            public void run() {


            }
        });

        Thread a=new Thread(new Runnable() {
            @Override
            public void run() {

            }

        });
        a.start();
        b.start();
    }
}
