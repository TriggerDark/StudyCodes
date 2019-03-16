package senior.ch8_thread.poolDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 创建自定义线程池
 * @author SuperStar
 */

public class Test5 {
    public static void main(String[] args) {
        //创建一个进程池
        ThreadPoolExecutor executor;
        executor = new ThreadPoolExecutor(5, 7, 300, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(4));
        for (int i = 0; i < 12; i++) {
            executor.execute(new RunnableDemo(i));
            System.out.println("线程池中线程数：" + executor.getPoolSize() + ", 队列中等待执行的任务数：" + executor.getQueue().size() + ", 已经执行的线程数：" + executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}
class RunnableDemo implements Runnable {

    int num;

    public RunnableDemo(int num) {
        super();
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行任务" + num);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务" + num + "执行完毕");
    }
}