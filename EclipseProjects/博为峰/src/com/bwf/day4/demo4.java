package com.bwf.day4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class demo4 extends JFrame {

	public demo4() {
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("弹出窗口");
		menuBar.add(menu);
		
		JMenuItem item1 = new JMenuItem("弹出窗口");
		JMenuItem item2 = new JMenuItem("关闭");
		
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		
		item1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog(demo4.this, true);
				dialog.setTitle("弹出窗口");
				dialog.setSize(200, 200);
				dialog.setLocation(50,50);;
				dialog.setVisible(true);
			}
		});
		
		item2.addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		this.setSize(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new demo4();
	}

}
