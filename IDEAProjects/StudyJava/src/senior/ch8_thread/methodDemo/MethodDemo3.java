package senior.ch8_thread.methodDemo;

/**
 * join()方法
 * @author SuperStar
 */

public class MethodDemo3 {
    public static void main(String[] args) {
        System.out.println("--------线程强制执行---------");
        //1.创建线程对象
        Thread temp = new Thread(new MyRunnable(), "temp");
        temp.start();
        for (int i = 0; i < 20; i++) {
            //当线程执行到i==5时，暂停主线程，让子线程temp执行完毕之后，主进程再执行
            if (i == 5) {
                try {
                    temp.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行：" + i);
        }
    }
}
