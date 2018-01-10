package com.jack.study;

import com.jack.utils.SleepUtils;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @author geqiang on 2017/12/30
 */
public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        //sleepThread不停地尝试睡眠
        Thread sleepThread = new Thread(new SleepRunner(), "SleepRunner");
        sleepThread.setDaemon(true);
        //busyThread不停的运行
        Thread busyThread = new Thread(new BusyRunner(), "BusyRunner");
        busyThread.setDaemon(true);
        sleepThread.start();
        busyThread.start();
        //休眠5秒，让sleepThread和busyThread充分运行
        TimeUnit.SECONDS.sleep(5);
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println("SleepThread interrupted is " + sleepThread.isInterrupted());
        System.out.println("BusyThread interrupted is " + busyThread.isInterrupted());
        //防止sleepThread和busyThread立刻退出
        SleepUtils.second(2);
    }

    static class SleepRunner implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtils.second(10);
            }
        }
    }

    static class BusyRunner implements Runnable {

        @Override
        public void run() {
            while (true) {

            }
        }
    }
}
