package senior.ch8_thread.poolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newSingleThreadExecutor()方法创建线程池
 * @author SuperStar
 */
public class Test2 {
    public static void main(String[] args) {
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        for (int i =0; i < 10; i++) {
            singleThreadPool.execute(new MyRunnable(i));
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
