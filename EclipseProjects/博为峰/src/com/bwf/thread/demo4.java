package com.bwf.thread;

public class demo4 {

	/***
	 * 	������Ʊ�����ĸ���Ʊ���ڣ�Ʊ��100��
	 * 	100��Ʊ������Ҫ�ĸ��߳�
	 */
	public static void main(String[] args) {
		new TicketThread().start();
		new TicketThread().start();
		new TicketThread().start();
		new TicketThread().start();
	}

}
class TicketThread extends Thread {
	private int ticket = 100;
	
	public void run() {
		while(true) {
			if(ticket > 0) {
				Thread t = Thread.currentThread();
				String t_name = t.getName();
				System.out.println(t_name + "������Ʊ" + ticket --);
			}
		}
	}

}