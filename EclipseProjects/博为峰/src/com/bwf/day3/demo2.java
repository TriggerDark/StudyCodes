package com.bwf.day3;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class demo2 {
	/**�¼��������
	 * �¼�����(event)����װ��GUI����ϵ��ض��¼�(ͨ��ָ�����û���һ�β���)
	 * �¼�Դ(���)���¼������ĳ�����ͨ����ʱ�����¼������
	 * ������(listener)����������¼�Դ�Ϸ������¼����Ը����¼�������Ӧ�Ĵ���Ķ���
	 * �¼���������������������յ��Ķ��¼����������Ӧ�Ĵ���ķ���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("�����¼�");
		f.setSize(300, 300);
		f.setLocation(300, 300);
		f.setVisible(true);
		
		MyWindowListener mw = new MyWindowListener();
		f.addWindowListener(mw);
	}

}
class MyWindowListener implements WindowListener{

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("�㴥������d");
	}
	
	public void windowClosing(WindowEvent e) {
		// 3,4�����¼����󣬽��ղ������¼�����
		Window window = e.getWindow();
		window.dispose();//����
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�㴥������");
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}












