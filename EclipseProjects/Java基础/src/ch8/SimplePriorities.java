package ch8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable{

	// Volatile���εĳ�Ա������ÿ�α��̷߳���ʱ����ǿ�ȴӹ����ڴ����ض��ó�Ա������ֵ��
	// ���ң�����Ա���������仯ʱ��ǿ���߳̽��仯ֵ��д�������ڴ档
	// �������κ�ʱ�̣�������ͬ���߳����ǿ���ĳ����Ա������ͬһ��ֵ��
	// ����ʹ��volatile���ε���VM�б�Ҫ�Ĵ����Ż���������Ч���ϱȽϵͣ����һ���ڱ�Ҫʱ��ʹ�ô˹ؼ��֡�
	
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
