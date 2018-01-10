package com.jack.model;

/**
 * @author geqiang on 2017/12/27
 * 双重检查锁定
 */
public class DoubleCheckedLocking {
    private static Point instance;
    public static Point getInstance(){
        if(instance==null){
            synchronized (DoubleCheckedLocking.class){
                if(instance==null){
                    instance=new Point(3,4);
                }
            }
        }
        return instance;
    }
}
