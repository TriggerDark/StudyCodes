package com.bwf.day3;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class demo4 {
	public static void main(String[] args) {
		Frame f = new Frame("匿名内部类事件");
		f.setSize(300, 300);
		f.setLocation(300, 300);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Window window =e.getWindow();
				window.dispose();
			}
		});
		
	}
}
