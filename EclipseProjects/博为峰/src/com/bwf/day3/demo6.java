package com.bwf.day3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

public class demo6 {
	/**
	 * 	��֤��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("��֤��");
		f.add(new MyPanel());
		f.setLocation(300, 300);
		f.setSize(300, 300);
		f.setVisible(true);
	}

}
class MyPanel extends Panel{
	public void paint(Graphics g) {
		int width = 140;//������֤��ͼƬ�Ŀ��
		int height = 40;//����
		g.setColor(Color.LIGHT_GRAY);//������ɫ
		g.fillRect(0, 0, width, height);//���һ������
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width-1, height-1);//���Ʊ߿�
		
		//���Ƹ�����
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int x = r.nextInt(width) - 2;
			int y = r.nextInt(height) - 2;
			g.drawOval(x, y, 2, 2);
		}
		
		g.setFont(new Font("����", Font.BOLD, 30));//��֤�������
		g.setColor(Color.BLUE);//��֤�����ɫ
		
		//������֤��
		char[] chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i ++) {
			int pos = r.nextInt(chars.length);
			char c = chars[pos];
			sb.append(c + " ");
		}
		
		g.drawString(sb.toString(), 20, 30);
		
	}
}









