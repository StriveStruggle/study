package com.jack.model;

import sun.security.jca.GetInstance;

/**
 * @author geqiang on 2017/12/27
 */
public class InstanceFactory {
    private static class InstanceHolder{
        public static Point instance=new Point(3,4);
    }
    public static Point getInstance(){
        return InstanceHolder.instance;//这里将导致InstacenHolder类被初始化
    }
}
