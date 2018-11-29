package ch8;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{
    public void run() {
    	try {
    		while(true) {
    			TimeUnit.MILLISECONDS.sleep(100);
    			System.out.println(Thread.currentThread() + " " + this);
    		}
    	} catch (InterruptedException e) {
    		System.err.println("sleep() interrupted");
    	}
    }
	public static void main(String[] args) throws Exception{
		for(int i = 0; i < 10; i++) {
			Thread dameon = new Thread(new SimpleDaemons());
			dameon.setDaemon(true);
			dameon.start();
		}
    	System.out.println("All dameons started");
    	TimeUnit.MILLISECONDS.sleep(175);
	}
}
