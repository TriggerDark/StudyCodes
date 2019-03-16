package senior.ch8_thread.deadLock;


/**
 * @author SuperStar
 */

public class Test {
    public static void main(String[] args) {
        Object bobby = new Object();//芭比
        Object duck = new Object();//玩具鸭
        Thread tangtang = new Thread(new Tangtang(bobby, duck));
        Thread doudou = new Thread(new Doudou(duck, bobby));
        tangtang.start();
        doudou.start();
    }
}

class Tangtang implements Runnable {

    Object bobby;//芭比
    Object duck;

    public Tangtang(Object bobby, Object duck) {
        this.bobby = bobby;
        this.duck = duck;
    }

    @Override
    public void run() {
        synchronized (bobby) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (duck) {

            }
            System.out.println("糖糖把芭比给豆豆");
        }
    }
}

class Doudou implements Runnable {

    Object bobby;//芭比
    Object duck;//玩具鸭

    public Doudou(Object duck, Object bobby) {
        this.bobby = bobby;
        this.duck = duck;
    }

    @Override
    public void run() {
        synchronized (duck) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (bobby) {

            }
            System.out.println("豆豆把玩具鸭给糖糖");
        }
    }
}
