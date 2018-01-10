package com.jack.model;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author geqiang on 2017/12/26
 */
public class ReentrantLockExample {
    int a =0;
    ReentrantLock lock=new ReentrantLock();
//    AbstractQueuedSynchronizer
    public void writer(){
        lock.lock();//获取锁
        try{
            a++;
        }finally {
            lock.unlock();//释放锁
        }
    }
    public void reader(){
        lock.lock();
        try{
            int i=a;
        }finally {
            lock.unlock();
        }
    }
}
