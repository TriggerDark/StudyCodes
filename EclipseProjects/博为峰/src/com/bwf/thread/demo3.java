package com.bwf.thread;

public class demo3 {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread mt = new Thread(mr);
		mt.start();
		while(true) {
			System.out.println("main中的run方法");
		}
	}

}

class MyRunnable implements Runnable {
	public void run() {
		while(true) {
			System.out.println("MyRunnale中的run方法");
		}
	}
}