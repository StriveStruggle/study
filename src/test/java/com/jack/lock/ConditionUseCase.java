package com.jack.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author geqiang on 2018/1/8
 */
public class ConditionUseCase {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void conditionWait() throws InterruptedException {
        lock.lock();
        try {
            System.out.println("我已经获得锁了");
            condition.await();
            System.out.println("我再次获得锁了");
        } finally {
            lock.unlock();
        }
    }

    public void conditionSignal() throws InterruptedException {
        lock.lock();
        try {
            System.out.println("我获得锁了");
            condition.signal();
            System.out.println("我释放锁了");
        } finally {
            lock.unlock();
        }
    }
}
