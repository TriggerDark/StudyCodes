package com.bwf.thread;

public class demo5 {

	public static void main(String[] args) {
		TicketRunnable tr = new TicketRunnable();
		new Thread(tr, "窗口一").start();
		new Thread(tr, "窗口二").start();
		new Thread(tr, "窗口三").start();
		new Thread(tr, "窗口四").start();

	}

}

class TicketRunnable implements Runnable{
	private int ticket = 100;
	
	public void run() {
		while(true) {
			if(ticket > 0) {
				Thread t = Thread.currentThread();
				String t_name = t.getName();
				System.out.println(t_name + "正在售票" + ticket --);
			}
		}
	}
	
}