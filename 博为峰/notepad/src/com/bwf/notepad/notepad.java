package com.bwf.notepad;

import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class notepad {
	//���±��ľ���ʵ����
	private static final long serialVersionUID = 1L;
	private TextArea content;
	private String filePath = "";//����·��Ϊ��
	Color color = Color.red;
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	
	//���췽��
	public notepad(){
		//����һ��JFrame���󣻲������������
		final JFrame jf = new JFrame("�ҵļ��±�");
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		jf.setBounds(100, 100, 500, 500);
		jf.setResizable(true);
		jf.setVisible(true);
		
		//�����˵���
		MenuBar menu = new MenuBar();
		jf.setMenuBar(menu);
		
		//����������ı���
		content = new TextArea("", 50, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
		jf.add(content);
		content.setVisible(true);
		content.requestFocusInWindow();
		
		//�˵����������
		Menu filemenu = new Menu("�ļ���F��");
		Menu editmenu = new Menu("�༭��E��");
		Menu formatmenu = new Menu("��ʽ��O��");
		Menu viewmenu = new Menu("�鿴��V��");
		Menu helpmenu = new Menu("������H��");
		menu.add(filemenu);
		menu.add(editmenu);
		menu.add(formatmenu);
		menu.add(viewmenu);
		menu.add(helpmenu);
		
		//�����ļ��˵��ϵĸ����˵����ӵ��˵���
		MenuItem newitem = new MenuItem("�½���N��");
		newitem.setShortcut(new MenuShortcut(KeyEvent.VK_N, false));
		filemenu.add(newitem);
		MenuItem openitem = new MenuItem("�򿪣�O��");
		openitem.setShortcut(new MenuShortcut(KeyEvent.VK_O, false));
		filemenu.add(openitem);
		MenuItem saveitem = new MenuItem("���棨S��");
		saveitem.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
		filemenu.add(saveitem);
		MenuItem saveasitem = new MenuItem("���Ϊ��A��");
		saveasitem.setShortcut(new MenuShortcut(KeyEvent.VK_A, false));
		filemenu.add(saveasitem);
		MenuItem setitem = new MenuItem("ҳ�����ã�U��");
		setitem.setShortcut(new MenuShortcut(KeyEvent.VK_U, false) );
		filemenu.add(setitem);
		setitem.setEnabled(false);
		MenuItem printitem = new MenuItem("��ӡ��P��");
		printitem.setShortcut(new MenuShortcut(KeyEvent.VK_P, false));
		filemenu.add(printitem);
		printitem.setEnabled(false);
		filemenu.addSeparator();
		MenuItem exititem = new MenuItem("�˳���X��");
		exititem.setShortcut(new MenuShortcut(KeyEvent.VK_X, false));
		filemenu.add(exititem);
		
		//��Ӽ�������ʵ���ļ��˵��ϵĸ����˵���Ĺ���
		//�½��˵���Ĺ���ʵ��
		newitem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String con = content.getText();
				if(!con.endsWith("")){//�ı������ı���Ϊ��
					int result = JOptionPane.showConfirmDialog(null, ("�Ƿ�Ҫ���棿"), ("�����ļ�������"), JOptionPane.YES_NO_CANCEL_OPTION);
					if(result == JOptionPane.NO_OPTION){//������
						content.setText("");
					}else if(result == JOptionPane.CANCEL_OPTION){//ȡ���½�
						
					}else if(result == JOptionPane.YES_OPTION){//ѡ�񱣴�
						JFileChooser jfc = new JFileChooser();//����ѡ�񱣴�·�����ļ���
						int bcf = jfc.showSaveDialog(jf);
						
						if(bcf == JFileChooser.APPROVE_OPTION){
							//�����ļ�
							try {
								BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(jfc.getSelectedFile().getAbsolutePath()+".txt")));
								//��ȡ�ļ�
								filePath = jfc.getSelectedFile().getAbsolutePath()+".txt";
								
							
							
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						
					}
					
					
				}
				
			}
		});
		
		
	
	}

}














