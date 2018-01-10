package com.jack.model;

import sun.security.jca.GetInstance;

/**
 * @author geqiang on 2017/12/27
 */
public class UnsafeLazyInitialization {
    private static Point instance;
    public static synchronized Point getInstance(){
        if(instance==null){
            instance=new Point(3,4);
        }
        return instance;
    }
}
