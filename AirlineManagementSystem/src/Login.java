import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;


public class Login extends JFrame implements ActionListener{
JButton submit, reset, close;
JTextField tfusername;
JPasswordField tfpassword;

	private static final long serialVersionUID = 1L;

public Login(){
	getContentPane().setBackground(Color.white);
	setLayout(null);
	
	JLabel lblusername = new JLabel ("Username");
	lblusername.setBounds(20, 20, 100, 20);
	add(lblusername);
	
	tfusername = new JTextField();
	tfusername.setBounds(130, 20, 200, 20);
	add(tfusername);
	
	JLabel lblpassword = new JLabel ("Password");
	lblpassword.setBounds(20, 60, 100, 20);
	add(lblpassword);
	
	tfpassword = new JPasswordField();
	tfpassword.setBounds(130, 60, 200, 20);
	add(tfpassword);
	
	reset = new JButton("Resest");
	reset.setBounds(40, 120, 120, 20);
	reset.addActionListener(this);
	add(reset);
	
	submit = new JButton("Submit");
	submit.setBounds(190, 120, 120, 20);
	submit.addActionListener(this);
	add(submit);
	
	close = new JButton("Close");
	close.setBounds(120, 160, 120, 20);
	close.addActionListener(this);
	add(close);
	
	setSize(400, 250);
	setLocation(600, 250);
	setVisible(true);
}
	

	public static void main(String[] args) {
		new Login();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == submit) {
		String username = tfusername.getText();
		String password = tfpassword.getText();
		
		try {
			Conn c = new Conn();
			
			String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
			
			ResultSet rs = c.s.executeQuery(query);
			
			if (rs.next()) {
				new Home();
				setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Invalid username or password");
				setVisible(false);
			}
		} catch (Exception e1) {
			e1.printStackTrace ();
		}
		
	} else if (e.getSource() == close) {
		setVisible(false);
	} else if (e.getSource() == reset) {
		tfusername.setText("");
		tfpassword.setText("");
	}
}
}