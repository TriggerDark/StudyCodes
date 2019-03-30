package senior.ch8_thread.exercise;

public class Movie {
    private String name;
    private String info;
    private boolean flag = true;//设置标志位，控制生产者生产，消费者消费

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public synchronized void get() {
        if (flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + "---" + this.getInfo());
        flag = true;
        super.notify();
    }

    public synchronized void set(String name, String info) {
        if (!flag) {
            try {
                super.wait();//使当前线程等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.info = info;
        flag = false;
        super.notify();//唤醒线程
    }

}
