package com.bwf.thread;

public class demo1 {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.run();
		
		while(true) {
			System.out.println("main方法中的run方法");
		}
	}

}

class MyClass{
	public void run() {
		while(true) {
			System.out.println("MyClass中的run方法");
		}
	}
}