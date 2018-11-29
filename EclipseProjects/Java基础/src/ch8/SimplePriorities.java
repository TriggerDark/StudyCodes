package ch8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable{

	// Volatile修饰的成员变量在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。
	// 而且，当成员变量发生变化时，强迫线程将变化值回写到共享内存。
	// 这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
	// 由于使用volatile屏蔽掉了VM中必要的代码优化，所以在效率上比较低，因此一定在必要时才使用此关键字。
	
	private int countDown = 5;
	private volatile double d;
	private int priority;
	public SimplePriorities(int priority) {
	    this.priority = priority;	
	}
	public String toString() {
		return Thread.currentThread() + ": " + countDown;
	}
	
	public void run() {
	    Thread.currentThread().setPriority(priority);
	    while (true) {
	    	for (int i = 1; i < 10000; i++) {
	    		d += (Math.PI + Math.E) / (double)i;
	    		if (i % 1000 == 0) {
	    			Thread.yield();
	    		}
	    	}
	    	System.out.println(this);
	    	if (--countDown == 0) return;
	    }
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++) {
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		}
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
    	exec.shutdown();

	}

}
