package ch10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	public MyFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame1 = new JFrame("First Window");
		MyFrame frame2 = new MyFrame("Second Window"); 
		
		frame1.setBounds(20, 10, 300, 200);
		
		JPanel p1 = new JPanel();
		JButton b1 = new JButton("confirm");
		//p1.add(b1);
		frame1.add(b1);
		frame1.setVisible(true);
	}

}
