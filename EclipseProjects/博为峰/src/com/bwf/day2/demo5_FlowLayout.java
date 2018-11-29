package com.bwf.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class demo5_FlowLayout {
	/**
	 * 组建不能单独存在，必须放置在容器内，组件在容器中的位置和尺寸都是由布局管理器决定的
	 * 5种：
	 * 	FlowLayout:流式布局管理器
	 * 	BorderLayout:边界布局管理器
	 * 	GridLayout:网络布局管理器
	 * 	GridBagLayout:网络包布局管理器
	 * 	CardLayout:卡片管理器
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("FlowLayout");
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(200, 300);
		
		f.add(new Button("第一个按钮"));
		f.add(new Button("第二个按钮"));
		f.add(new Button("第三个按钮"));
		f.add(new Button("第四个按钮"));
		f.add(new Button("第五个按钮"));
		f.add(new Button("第六个按钮"));
		
		f.setVisible(true);
		
	}

}
