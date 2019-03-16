package senior.ch8_thread.methodDemo;

/**
 * @author SuperStar
 */
public class MethodDemo4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if (i == 3) {
                Thread.yield();
                System.out.print("线程礼让：");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MethodDemo4(), "线程A");
        Thread t2 = new Thread(new MethodDemo4(), "线程B");
        t1.start();
        t2.start();
    }
}
