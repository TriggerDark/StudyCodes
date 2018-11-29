package ch11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient1{
	public static void main(String[] args){
		MyWindow win = new MyWindow("Chat Room");
	}
}
class MyWindow extends JFrame implements ActionListener{
	public static final int rows = 20;
	public static final int columns = 60;
	JMenuBar menubar;
	JMenu menu1, menu2;
	JMenuItem send, quit, about;
	JButton button1, button2;
	JComboBox box;
	JTextArea txt;
	JTextField text;
	private Socket connection = null;
	private BufferedReader serverIn = null;
	private PrintStream serverOut = null;
	MyWindow(String s){
		JFrame win = new JFrame();
		JPanel jp = new JPanel();
		win.setTitle(s);
		win.setBounds(400,300,888,508);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		menubar = new JMenuBar();
		menu1 = new JMenu("File");
		menu2 = new JMenu("Help");
		send = new JMenuItem("send");
		quit = new JMenuItem("quit");
		about = new JMenuItem("about");
		
		menu1.add(send);
		menu1.addSeparator();
		menu1.add(quit);
		menu1.addSeparator();
		menu2.add(about);
		menubar.add(menu1);
		menubar.add(menu2);
		win.add(menubar, BorderLayout.NORTH);
		
		send.addActionListener(this);
		quit.addActionListener(this);
		about.addActionListener(this);
		
		txt = new JTextArea(rows,columns);
		txt.setLineWrap(true);
		JScrollPane scrollpane = new JScrollPane(txt);
		win.add(scrollpane,BorderLayout.WEST);
		
		text = new JTextField();
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,1));
		southPanel.add(text);
		win.add(southPanel,BorderLayout.SOUTH);
		
		text.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					send.doClick();
				}
			}
		});
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(3,1));
		button1 = new JButton("send");
		button2 = new JButton("quit");
		box = new JComboBox();
		box.setEnabled(true);
		box.addItem("³ÂË§");
		box.addItem("Ð»Äñ");
		centerPanel.add(button1);
		centerPanel.add(button2);
		centerPanel.add(box);
		win.add(centerPanel,BorderLayout.CENTER);
		win.validate();
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		doConnect();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == send || e.getSource() == button1 || e.getSource() == text){
			txt.append(box.getSelectedItem() + " " 
			          + text.getText() + '\n');
			text.setText(null);
		}
		if(e.getSource() == quit || e.getSource() == button2){
			System.exit(0);
		}
		if(e.getSource() == about){
			JOptionPane.showMessageDialog(this,"Write by lirongwei");
		}
	}
	
	private void doConnect(){
		String serverIP = System.getProperty("serverIP", "127.0.0.1");
		String serverPort = System.getProperty("serverPort", "2000");
		try {
			connection = new Socket(serverIP, Integer.parseInt(serverPort));
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			serverIn = new BufferedReader(isr);
			Thread t = new Thread(new RemoteReader());
			t.start();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private class RemoteReader implements Runnable {
		public void run() {
			try {
				while (true) {
					String nextLine = serverIn.readLine();
					txt.append(nextLine + "\n");
				}
			} catch (Exception e) {
				System.err.println("Error while reading from server.");
				e.printStackTrace();
			}
		}
	}
	private void exit() {
		try {
			connection.close();
		} catch (Exception e) {
			System.err
					.println("Error while shutting down the server connection.");
		}
		System.exit(0);
	}
}
