package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HandlerTest extends JFrame implements ActionListener,ItemListener{
	
	public  HandlerTest(){
		init();
		setBounds(100, 200, 600, 300);
		setVisible(true);
	}
		
	public void init(){
		JPanel jp = new JPanel();
		//事件
		JButton b1 = new JButton("press me");
		jp.add(b1);
		add(jp);
		//注册监听器
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlerTest ht = new  HandlerTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getSource();
		System.out.println("I am pressed too!");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
//事件处理器，实现监视器接口
class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getSource();
		System.out.println("I am pressed too!");
	}
	
}
