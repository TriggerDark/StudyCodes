package com.bwf.day2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class demo7_GridLayout {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("GridLayout");
		f.setLayout(new GridLayout(3, 3));//…Ë÷√¥∞ÃÂ3*3
		f.setSize(300, 300);
		f.setLocation(300, 300);
		f.setVisible(true);
		
		for (int i = 1; i <= 9; i++) {
			Button btn = new Button("btn" + i);
			f.add(btn);
		}
		
		f.setVisible(true);
	}
}
