package com.jack.pattern.state;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class Context {
    private State state;
    private String name;

    public Context(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
