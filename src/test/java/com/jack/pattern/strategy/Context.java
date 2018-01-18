package com.jack.pattern.strategy;

/**
 * @author geqiang
 * @date 2018/1/17
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeDraw(int radius,int x,int y){
        strategy.draw(radius,x,y);
    }
}
