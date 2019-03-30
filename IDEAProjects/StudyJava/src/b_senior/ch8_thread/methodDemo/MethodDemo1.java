package b_senior.ch8_thread.methodDemo;

import b_senior.ch8_thread.runnableDemo.RunnableDemo1;

/**
 * 设置线程的优先级
 *      setPriory
 * @author SuperStar
 */

public class MethodDemo1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableDemo1(), "线程1");
        Thread t2 = new Thread(new RunnableDemo1(), "线程2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }