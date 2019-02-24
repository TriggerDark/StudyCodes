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
	//记事本的具体实现类
	private static final long serialVersionUID = 1L;
	private TextArea content;
	private String filePath = "";//先让路径为空
	Color color = Color.red;
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	
	//构造方法
	public notepad(){
		//创建一个JFrame对象；并设置相关属性
		final JFrame jf = new JFrame("我的记事本");
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		jf.setBounds(100, 100, 500, 500);
		jf.setResizable(true);
		jf.setVisible(true);
		
		//创建菜单栏
		MenuBar menu = new MenuBar();
		jf.setMenuBar(menu);
		
		//创建并添加文本框
		content = new TextArea("", 50, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
		jf.add(content);
		content.setVisible(true);
		content.requestFocusInWindow();
		
		//菜单栏添加内容
		Menu filemenu = new Menu("文件（F）");
		Menu editmenu = new Menu("编辑（E）");
		Menu formatmenu = new Menu("格式（O）");
		Menu viewmenu = new Menu("查看（V）");
		Menu helpmenu = new Menu("帮助（H）");
		menu.add(filemenu);
		menu.add(editmenu);
		menu.add(formatmenu);
		menu.add(viewmenu);
		menu.add(helpmenu);
		
		//创建文件菜单上的各个菜单项并添加到菜单上
		MenuItem newitem = new MenuItem("新建（N）");
		newitem.setShortcut(new MenuShortcut(KeyEvent.VK_N, false));
		filemenu.add(newitem);
		MenuItem openitem = new MenuItem("打开（O）");
		openitem.setShortcut(new MenuShortcut(KeyEvent.VK_O, false));
		filemenu.add(openitem);
		MenuItem saveitem = new MenuItem("保存（S）");
		saveitem.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
		filemenu.add(saveitem);
		MenuItem saveasitem = new MenuItem("另存为（A）");
		saveasitem.setShortcut(new MenuShortcut(KeyEvent.VK_A, false));
		filemenu.add(saveasitem);
		MenuItem setitem = new MenuItem("页面设置（U）");
		setitem.setShortcut(new MenuShortcut(KeyEvent.VK_U, false) );
		filemenu.add(setitem);
		setitem.setEnabled(false);
		MenuItem printitem = new MenuItem("打印（P）");
		printitem.setShortcut(new MenuShortcut(KeyEvent.VK_P, false));
		filemenu.add(printitem);
		printitem.setEnabled(false);
		filemenu.addSeparator();
		MenuItem exititem = new MenuItem("退出（X）");
		exititem.setShortcut(new MenuShortcut(KeyEvent.VK_X, false));
		filemenu.add(exititem);
		
		//添加监听器来实现文件菜单上的各个菜单项的功能
		//新建菜单项的功能实现
		newitem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String con = content.getText();
				if(!con.endsWith("")){//文本域里文本不为空
					int result = JOptionPane.showConfirmDialog(null, ("是否要保存？"), ("保存文件。。。"), JOptionPane.YES_NO_CANCEL_OPTION);
					if(result == JOptionPane.NO_OPTION){//不保存
						content.setText("");
					}else if(result == JOptionPane.CANCEL_OPTION){//取消新建
						
					}else if(result == JOptionPane.YES_OPTION){//选择保存
						JFileChooser jfc = new JFileChooser();//用于选择保存路径的文件名
						int bcf = jfc.showSaveDialog(jf);
						
						if(bcf == JFileChooser.APPROVE_OPTION){
							//保存文件
							try {
								BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(jfc.getSelectedFile().getAbsolutePath()+".txt")));
								//获取文件
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














