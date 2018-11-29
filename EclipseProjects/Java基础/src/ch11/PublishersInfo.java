package ch11;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PublishersInfo implements ActionListener {
	/*
	 * Declare the variables to create the application interface for the
	 * Publishers Information application
	 */

	JLabel heading, lpubid, lpub_name, lphone, laddress, lcity, lstate, lzip,
			error;

	JTextField pub_idField, pub_nameField, phoneField, addressField, cityField,
			stateField, zipField;

	JButton insert, exit;

	Connection con;

	PreparedStatement stat;

	Statement stmt;

	ResultSet rs;

	Font f;

	JPanel p1;

	JFrame f1;

	/* Define the constructor for the Publishers Information application */

	public PublishersInfo() {
		try {
			/* Initialize and load Type 4 driver */
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			/* Connect to a data source */
			con = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Library;user=sa;password=123");

			/* Create a Statement object */

			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}

	public void compshow() {
		f1 = new JFrame("PUBLISHERS");
		p1 = new JPanel();
		heading = new JLabel("PUBLISHERS INFORMATION");
		lpubid = new JLabel("Publishers ID:");
		lpub_name = new JLabel("Publishers Name:");
		lphone = new JLabel("Phone Number:");
		laddress = new JLabel("Address:");
		lcity = new JLabel("City:");
		lstate = new JLabel("State:");
		lzip = new JLabel("Zip:");

		pub_idField = new JTextField(6);
		pub_nameField = new JTextField(50);
		phoneField = new JTextField(15);
		addressField = new JTextField(50);
		cityField = new JTextField(50);
		stateField = new JTextField(50);
		zipField = new JTextField(20);

		insert = new JButton("Insert");
		exit = new JButton("Exit");

		p1.setLayout(null);
		heading.setBounds(250, 35, 200, 40);
		p1.add(heading);

		lpubid.setBounds(75, 90, 200, 30);
		pub_idField.setBounds(400, 90, 100, 25);
		p1.add(lpubid);
		p1.add(pub_idField);

		lpub_name.setBounds(75, 120, 200, 30);
		pub_nameField.setBounds(400, 120, 200, 25);
		p1.add(lpub_name);
		p1.add(pub_nameField);

		lphone.setBounds(75, 150, 200, 30);
		phoneField.setBounds(400, 150, 150, 25);
		p1.add(lphone);
		p1.add(phoneField);

		laddress.setBounds(75, 180, 200, 30);
		addressField.setBounds(400, 180, 250, 25);
		p1.add(laddress);
		p1.add(addressField);

		lcity.setBounds(75, 210, 200, 30);
		cityField.setBounds(400, 210, 200, 25);
		p1.add(lcity);
		p1.add(cityField);

		lstate.setBounds(75, 240, 200, 30);
		stateField.setBounds(400, 240, 200, 25);
		p1.add(lstate);
		p1.add(stateField);

		lzip.setBounds(75, 270, 200, 30);
		zipField.setBounds(400, 270, 200, 25);
		p1.add(lzip);
		p1.add(zipField);

		insert.setBounds(175, 350, 100, 30);
		exit.setBounds(325, 350, 100, 30);
		p1.add(insert);
		p1.add(exit);

		f1.add(p1);
		f1.setSize(680, 500);
		f1.setVisible(true);

		insert.addActionListener(this);
		exit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand() == "Exit")
			/* Terminate the execution of the application */
			System.exit(0);

		if (ae.getActionCommand() == "Insert") {
			// Insert a row in the publishers table
			try {
				stat = con
						.prepareStatement("INSERT INTO Publishers VALUES(?, ?, ?, ?, ?, ?, ?)");
				String pid = pub_idField.getText();
				String pname = pub_nameField.getText();
				String pphone = phoneField.getText();
				String padd = addressField.getText();
				String pcity = cityField.getText();
				String pstate = stateField.getText();
				String pzip = zipField.getText();

				stat.setString(1, pid);
				stat.setString(2, pname);
				stat.setString(3, pphone);
				stat.setString(4, padd);
				stat.setString(5, pcity);
				stat.setString(6, pstate);
				stat.setString(7, pzip);

				/* Execute the INSERT statement */
				stat.executeUpdate();
				con.close();
				/* Clear the contents of all the fields */
				pub_idField.setText("");
				pub_nameField.setText("");
				phoneField.setText("");
				addressField.setText("");
				cityField.setText("");
				stateField.setText("");
				zipField.setText("");
			} catch (Exception e) {
				System.out.println("Error1 " + e);
				error.setText("Row cannot be inserted");
			}

		}

	}/* action performed closed */

	public static void main(String args[]) {
		PublishersInfo p = new PublishersInfo();
		p.compshow();
	}
}
