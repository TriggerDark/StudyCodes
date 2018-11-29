package CahtServer;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class ChatClient extends JFrame {

	private Socket connection = null;

	private BufferedReader serverIn = null;

	private PrintStream serverOut = null;

	private JTextArea output;

	private JTextField input;

	private JButton sendButton;

	private JButton quitButton;

	private JComboBox usernames;

	private JDialog aboutDialog;

	public ChatClient() {
		output = new JTextArea(10, 50);
		input = new JTextField(50);
		sendButton = new JButton("Send");
		quitButton = new JButton("Quit");
		usernames = new JComboBox();
		usernames.addItem("Bryan Basham");
		usernames.addItem("Grand Poobah");
		usernames.addItem("Java Geek");
	}

	public void launchFrame() {
		setTitle("Chat Room");

		// Use the Border Layout for the frame
		setLayout(new BorderLayout());

		add(output, BorderLayout.WEST);
		add(input, BorderLayout.SOUTH);

		// Create the button panel
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 1));
		p1.add(sendButton);
		p1.add(quitButton);
		p1.add(usernames);

		// Add the button panel to the center
		add(p1, BorderLayout.CENTER);

		// Create menu bar and File menu
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem quitMenuItem = new JMenuItem("Quit");
		quitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		file.add(quitMenuItem);
		mb.add(file);
		setJMenuBar(mb);

		// Add Help menu to menu bar
		JMenu help = new JMenu("Help");
		JMenuItem aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"The ChatClient is a neat tool that allows you to talk to other ChatClients via a ChatServer",
								"About", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		help.add(aboutMenuItem);
		mb.add(help);

		// Attach listener to the appropriate components
		sendButton.addActionListener(new SendHandler());
		input.addActionListener(new SendHandler());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		pack();
		setVisible(true);

		doConnect();
	}

	private void doConnect() {
		// Initialize server IP and port information
		String serverIP = System.getProperty("serverIP", "127.0.0.1");
		String serverPort = System.getProperty("serverPort", "2000");

		try {
			// Create the connection to the chat server
			connection = new Socket(serverIP, Integer.parseInt(serverPort));

			// Prepare the input stream and store it in an instance variable
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			serverIn = new BufferedReader(isr);

			// Prepare the output stream and store it in an instance variable
			serverOut = new PrintStream(connection.getOutputStream());

			// Launch the reader thread
			Thread t = new Thread(new RemoteReader());
			t.start();

		} catch (Exception e) {
			System.err.println("Unable to connect to server!");
			e.printStackTrace();
		}
	}

	private class SendHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String text = input.getText();
			text = usernames.getSelectedItem() + ": " + text + "\n";
			serverOut.print(text);
			input.setText("");
		}
	}

	//    private class CloseHandler extends WindowAdapter {
	//        public void windowClosing(WindowEvent e) {
	//            exit();
	//        }
	//    }

	private void exit() {
		try {
			connection.close();
		} catch (Exception e) {
			System.err
					.println("Error while shutting down the server connection.");
		}
		System.exit(0);
	}

	//    private class AboutHandler implements ActionListener {
	//        public void actionPerformed(ActionEvent e) {
	//            // Create the aboutDialog when it is requested
	//            if ( aboutDialog == null ) {
	//                aboutDialog = new AboutDialog(frame, "About", true);
	//            }
	//            aboutDialog.setVisible(true);
	//        }
	//    }
	//    
	//    private class AboutDialog extends Dialog implements ActionListener  {
	//        public AboutDialog(Frame parent, String title, boolean modal) {
	//            super(parent,title,modal);
	//            add(new Label("The ChatClient is a neat tool that allows you to talk " +
	//                    "to other ChatClients via a ChatServer"),BorderLayout.NORTH);
	//            Button b = new Button("OK");
	//            add(b,BorderLayout.SOUTH);
	//            b.addActionListener(this);
	//            pack();
	//        }
	//        // Hide the dialog box when the OK button is pushed
	//        public void actionPerformed(ActionEvent e) {
	//            setVisible(false);
	//        }
	//    }

	private class RemoteReader implements Runnable {
		public void run() {
			try {
				while (true) {
					String nextLine = serverIn.readLine();
					output.append(nextLine + "\n");
				}
			} catch (Exception e) {
				System.err.println("Error while reading from server.");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ChatClient c = new ChatClient();
		c.launchFrame();
	}
}
