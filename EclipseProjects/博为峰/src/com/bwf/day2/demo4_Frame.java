package com.bwf.day2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class demo4_Frame {

	public static void main(String[] args) {
		Frame frame = new Frame("ÂúÌìÐÇ");
		frame.setLocation(400, 100);
		frame.setSize(1024, 768);
		MyPanel panel = new MyPanel();
		frame.add(panel);
		frame.setBackground(Color.BLACK);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class MyPanel extends Panel {
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		for(int i = 0; i < 200; i ++) {
			g.drawString("*", (int)(Math.random()*1024), (int)(Math.random()*768));
		}
		g.fillOval(800, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(780, 80, 100, 100);
	}
}