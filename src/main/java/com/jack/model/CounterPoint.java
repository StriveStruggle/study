package com.jack.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author geqiang on 2017/11/13
 */
public class CounterPoint extends Point {
    private static final AtomicInteger counter=new AtomicInteger();

    public CounterPoint(int x,int y){
        super(x, y);
        counter.incrementAndGet();
    }
    public int numberCreated(){
        return counter.get();
    }
}
