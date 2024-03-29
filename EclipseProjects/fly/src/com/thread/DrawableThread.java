package com.thread;

import com.view.MyPanel;

public class DrawableThread extends Thread {

	public MyPanel mypanel;
	public DrawableThread(MyPanel mypanel) {
		this.mypanel = mypanel;
	}
	
	public void run() {
		while(true) {
			mypanel.repaint();
			try {
				Thread.currentThread();
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
