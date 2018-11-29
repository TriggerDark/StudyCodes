package com.bwf.day3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

public class demo6 {
	/**
	 * 	验证码
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("验证码");
		f.add(new MyPanel());
		f.setLocation(300, 300);
		f.setSize(300, 300);
		f.setVisible(true);
	}

}
class MyPanel extends Panel{
	public void paint(Graphics g) {
		int width = 140;//定义验证码图片的宽度
		int height = 40;//长度
		g.setColor(Color.LIGHT_GRAY);//设置颜色
		g.fillRect(0, 0, width, height);//填充一个矩形
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width-1, height-1);//绘制边框
		
		//绘制干扰项
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int x = r.nextInt(width) - 2;
			int y = r.nextInt(height) - 2;
			g.drawOval(x, y, 2, 2);
		}
		
		g.setFont(new Font("黑体", Font.BOLD, 30));//验证码的字体
		g.setColor(Color.BLUE);//验证码的颜色
		
		//产生验证码
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









