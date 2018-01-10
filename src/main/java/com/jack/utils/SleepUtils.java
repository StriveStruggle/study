package com.jack.utils;

import java.util.concurrent.TimeUnit;

/**
 * @author geqiang on 2017/12/30
 */
public class SleepUtils {
    public static final void second(long seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){

        }
    }
}
