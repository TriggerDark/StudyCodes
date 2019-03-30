package senior.ch8_thread.runnableDemo;

/**
 * @author SuperStar
 *  实现Runnable类
 *      避免单继承局限性
 *      便于共享资源
 */
public class RunnableDemo1 implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        //1.创建线程对象
        Runnable myRunnable = new RunnableDemo1();
        Thread t = new Thread(myRunnable, "myThread");
        t.start();
    }

}
