package com.jack.pattern.chain;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
