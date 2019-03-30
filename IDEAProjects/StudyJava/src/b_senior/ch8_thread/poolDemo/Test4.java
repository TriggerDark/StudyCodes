package b_senior.ch8_thread.poolDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * newScheduledThreadPool()方法创建线程池
 * @author SuperStar
 */
public class Test4 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        scheduledThreadPool.scheduleAtFixedRate(new MyRunnable2(), 5, 2, TimeUnit.SECONDS);
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 延时5s，每2秒执行一次");
    }
}
