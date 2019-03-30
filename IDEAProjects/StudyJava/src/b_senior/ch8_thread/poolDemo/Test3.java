package b_senior.ch8_thread.poolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newFixedThreadPool()方法创建线程池
 * @author SuperStar
 */
public class Test3 {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i =0; i < 10; i++) {
            fixedThreadPool.execute(new MyRunnable(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
