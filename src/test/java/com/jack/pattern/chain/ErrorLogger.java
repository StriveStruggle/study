package com.jack.pattern.chain;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
