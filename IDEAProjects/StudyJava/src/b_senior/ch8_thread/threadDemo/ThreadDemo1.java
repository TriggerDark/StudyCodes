package b_senior.ch8_thread.threadDemo;

/**
 * 获取和设置主线程名字
 * @author SuperStar
 *  继承Thread类
 *      编写简单，可直接操作线程
 *      适合于单继承
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //1.获取主线程对象
        Thread thread = Thread.currentThread();
        System.out.println("当前线程是：" + thread.getName());
        thread.setName("MyJavaThread");
        System.out.println("当前线程是：" + thread.getName());
    }
}
