package com.jack.model;

/**
 * @author geqiang on 2017/12/27
 * 安全的双重检查锁定
 */
public class SafeDoubleCheckedLocking {
    private volatile static  Point instance;
    public static Point getInstance(){
        if(instance==null){
            synchronized (SafeDoubleCheckedLocking.class){
                if(instance==null){
                    instance=new Point(3,4);//instance为volatite,现在没问题了
                }
            }
        }
        return instance;
    }
}
