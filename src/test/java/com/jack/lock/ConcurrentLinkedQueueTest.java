package com.jack.lock;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author geqiang on 2018/1/10
 */
public class ConcurrentLinkedQueueTest {
    private static ConcurrentLinkedQueue queue=new ConcurrentLinkedQueue();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        queue.offer(i);
        }
        System.out.println("queue:"+queue.poll());
        System.out.println("queue:"+queue.poll());
        System.out.println("queue:"+queue.poll());
        System.out.println("queue:"+queue.poll());
    }
}
