package com.bwf.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class demo5_FlowLayout {
	/**
	 * �齨���ܵ������ڣ���������������ڣ�����������е�λ�úͳߴ綼���ɲ��ֹ�����������
	 * 5�֣�
	 * 	FlowLayout:��ʽ���ֹ�����
	 * 	BorderLayout:�߽粼�ֹ�����
	 * 	GridLayout:���粼�ֹ�����
	 * 	GridBagLayout:��������ֹ�����
	 * 	CardLayout:��Ƭ������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("FlowLayout");
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(200, 300);
		
		f.add(new Button("��һ����ť"));
		f.add(new Button("�ڶ�����ť"));
		f.add(new Button("��������ť"));
		f.add(new Button("���ĸ���ť"));
		f.add(new Button("�������ť"));
		f.add(new Button("��������ť"));
		
		f.setVisible(true);
		
	}

}
