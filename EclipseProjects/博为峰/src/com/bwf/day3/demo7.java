package com.bwf.day3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class demo7 extends JFrame{
	
	public demo7() {
		this.setTitle("JFrame����");
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		JButton btn = new JButton("��ť");
		this.add(btn);
		//Ĭ����Ϊ�����أ��ر�ʱ���ڸı�Ĭ�ϵ���Ϊ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new demo7();
	}
}
