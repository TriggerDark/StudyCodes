package com.bwf.thread;

public class demo1 {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.run();
		
		while(true) {
			System.out.println("main�����е�run����");
		}
	}

}

class MyClass{
	public void run() {
		while(true) {
			System.out.println("MyClass�е�run����");
		}
	}
}