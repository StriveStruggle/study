package com.jack.study;

import com.jack.utils.SleepUtils;

/**
 * @author geqiang on 2017/12/30
 */
public class Daemon {
    public static void main(String[] args) {
    Thread thread=new Thread(new DaemonRunner(),"DaemonRunner");
    thread.setDaemon(true);
    thread.start();
    }
    static class DaemonRunner implements Runnable{

        @Override
        public void run() {
            try{
                SleepUtils.second(10);
            }finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }
}
