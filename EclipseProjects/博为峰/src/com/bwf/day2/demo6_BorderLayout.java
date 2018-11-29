package com.bwf.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class demo6_BorderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		f.setLocation(300, 300);
		f.setVisible(true);
		
		Button btn1 = new Button("����");
		Button btn2 = new Button("�ϲ�");
		Button btn3 = new Button("����");
		Button btn4 = new Button("����");
		Button btn5 = new Button("�в�");
		
		f.add(btn1, BorderLayout.EAST);
		f.add(btn2, BorderLayout.SOUTH);
		f.add(btn3, BorderLayout.WEST);
		f.add(btn4, BorderLayout.NORTH);
		f.add(btn5, BorderLayout.CENTER);
	}
	
}
