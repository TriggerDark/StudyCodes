package senior.ch8_thread.runnableDemo;

/**
 * @author SuperStar
 */
public class RunnableDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("线程t正在运行！");
        try {
            Thread.sleep(500);
            System.out.println("线程t休眠，处于阻塞状态！");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("线程t被打断！");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableDemo2(), "t");
        System.out.println("线程t处于新建状态！");
        t.start();
        System.out.println("线程处于就绪状态！");
    }

}
