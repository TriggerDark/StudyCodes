package ch8.生产者消费者;

public class Stack {
	private String name;
	private String[] buffer=new String[100];
	int point=-1;
	
	public Stack(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public synchronized int getPoint() {
		return point;
	}
	
	public synchronized void push(String goods){
		this.notifyAll();
	
		while(point==buffer.length-1){
			System.out.println(Thread.currentThread().getName()+"wait");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		point++;
		Thread.yield();
		buffer[point]=goods;
	}
	
	public synchronized String pop(){
		this.notifyAll();
		while(point==-1){
			System.out.println(Thread.currentThread().getName()+"wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String goods=buffer[point];
		buffer[point]=null;
		Thread.yield();
		point--;
		return goods;
	}
}
