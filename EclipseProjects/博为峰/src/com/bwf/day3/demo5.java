package com.bwf.day3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class demo5 {
	/**
	 * awt事件：
	 * 	窗口事件(WindowEvent)
	 * 	鼠标事件(MouseEvent)
	 * 	键盘事件(KeyEvent)
	 * 	动作事件(ActionEvent)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setLocation(300, 300);
		f.setSize(300, 300);
		f.setVisible(true);
		
		Button btn = new Button("按钮");
		f.add(btn);
		
		btn.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("鼠标完成");
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("鼠标进入按钮区域事件");
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("鼠标移出按钮区域事件");
			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("鼠标按压事件");
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("鼠标松开事件");
			}
			
		});
	}

}
