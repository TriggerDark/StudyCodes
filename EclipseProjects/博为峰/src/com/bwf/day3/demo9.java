package com.bwf.day3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class demo9 extends JFrame{

	JButton sendBt;
	JTextField inputField;
	JTextArea chatContent;
	
	public demo9() {
		this.setLayout(new BorderLayout());
		chatContent = new JTextArea(12, 34);
		JScrollPane showPanel = new JScrollPane(chatContent);
		chatContent.setEnabled(false);
		inputField = new JTextField(20);
		sendBt = new JButton("����");
		JPanel inputPanel = new JPanel();
		
		//Ϊ��ť����¼�����
		sendBt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// ��ȡ�ı����е��ı���Ϣ
				String context = inputField.getText();
				//�ж��������Ϣ�Ƿ�Ϊ��
				if(context != null && !context.trim().equals("")) {
					chatContent.append("���ˣ�" + context + "\n");
				}else {
					chatContent.append("�����ҵ���Ϣ����Ϊ��\n");
				}
			}
			
		});
		
		JLabel label = new JLabel("");
		inputPanel.add(label);
		inputPanel.add(inputField);
		inputPanel.add(sendBt);
		
		this.add(showPanel, BorderLayout.CENTER);
		this.add(inputPanel, BorderLayout.SOUTH);
		
		this.setTitle("������");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new demo9();
	}

}
