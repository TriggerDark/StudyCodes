package com.bwf.day3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class demo5 {
	/**
	 * awt�¼���
	 * 	�����¼�(WindowEvent)
	 * 	����¼�(MouseEvent)
	 * 	�����¼�(KeyEvent)
	 * 	�����¼�(ActionEvent)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setLocation(300, 300);
		f.setSize(300, 300);
		f.setVisible(true);
		
		Button btn = new Button("��ť");
		f.add(btn);
		
		btn.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("������");
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("�����밴ť�����¼�");
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("����Ƴ���ť�����¼�");
			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("��갴ѹ�¼�");
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("����ɿ��¼�");
			}
			
		});
	}

}
