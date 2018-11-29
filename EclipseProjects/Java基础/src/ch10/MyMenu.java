package ch10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyMenu extends JFrame {
		JMenuBar menubar;
		JMenu menu;
		JMenuItem item1, item2;
		public MyMenu(String s){
			setTitle(s);
			setSize(160, 170);
			setLocation(120, 120);
			setVisible(true);
			
			menubar = new JMenuBar();
			menu = new JMenu("нд╪Ч");
			item1 = new JMenuItem("open", new ImageIcon("open.gif"));
			item2 = new JMenuItem("Save", new ImageIcon("save.gif"));
			
			menu.add(item1);
			menu.addSeparator();
			menu.add(item2);
			menubar.add(menu);
			setJMenuBar(menubar);
			validate();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton b1 = new JButton("button1");
			JButton b2 = new JButton("button2");
			JButton b3 = new JButton("button3");
			JButton b4 = new JButton("button4");
			JButton b5 = new JButton("button5");
			JPanel p1 = new JPanel();
			/*p1.add(b1);
			p1.add(b2);
			p1.add(b3);
			p1.add(b4);
			p1.add(b5);*/
			
			FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 20, 40);
			BorderLayout blo = new BorderLayout();
			//p1.setLayout(layout);
			p1.setLayout(blo);
			p1.add(b1, BorderLayout.NORTH);
			p1.add(b2, BorderLayout.SOUTH);
			p1.add(b3, BorderLayout.WEST);
			p1.add(b4, BorderLayout.EAST);
			p1.add(b5, BorderLayout.CENTER);
			add(p1);
			
			JPanel p2 = new JPanel();
			JButton b6 = new JButton("button6");
			JButton b7 = new JButton("button7");
			p2.add(b4);
			p2.add(b6);
			p2.add(b7);
			p1.add(p2,BorderLayout.EAST);
			validate();
		}
	public static void main(String [] args){
		MyMenu menu = new MyMenu("First Window with Menu");
		
	}
}
