package senior.ch8_thread.threadDemo;

/**
 * 继承Thread类的方式创建线程
 * @author SuperStar
 */
public class ThreadDemo2 extends Thread {

    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 threadDemo1 = new ThreadDemo2();
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        threadDemo1.start();//启动线程
        threadDemo2.start();
    }
}
