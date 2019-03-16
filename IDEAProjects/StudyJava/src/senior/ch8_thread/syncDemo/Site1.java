package senior.ch8_thread.syncDemo;

/**
 * 模拟网站购票同步
 * @author SuperStar
 */
public class Site1 implements Runnable {
    private int count = 10;//记录当前票数
    private int num = 0;//记录当前抢到第几张票
    private boolean flag = false;//记录是否售完

    @Override
    public void run() {
        //循环 当剩余票数为0时结束
        while (!flag) {
            sale();
        }
    }

    public synchronized void sale() {
        if (count <= 0) {
            flag = true;
            return;
        }
        //1.修改数据(剩余票数、第几张票)
        count --; num ++;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": 抢到第" + num + "张票, 剩余" + count + "张票");
    }

    public static void main(String[] args) {
        Site1 site = new Site1();
        Thread person_1 = new Thread(site, "鸡跑跑");
        Thread person_2 = new Thread(site, "抢票代理");
        Thread person_3 = new Thread(site, "黄牛党");
        person_1.start();
        person_2.start();
        person_3.start();
    }

}
