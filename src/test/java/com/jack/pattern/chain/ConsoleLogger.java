package com.jack.pattern.chain;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
