import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;


public class Home extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

public Home(){

	setLayout(null);
	
	ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/front.jpg"));
	JLabel image = new JLabel (i1);
	image.setBounds(0, 0, 1600, 800);
	add(image);
	
	JLabel heading = new JLabel ("AIR INDIA WELCOMES YOU");
	heading.setBounds(500, 40, 1000, 40);
	heading.setForeground(Color.BLUE);
	heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
	image.add(heading);
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu details = new JMenu("Details");
	menuBar.add(details);
	
	JMenuItem flightDetails = new JMenuItem("Flight Details");
	flightDetails.addActionListener(this);
	details.add(flightDetails);
	
	JMenuItem customerDetails = new JMenuItem("Add Customer Details");
	customerDetails.addActionListener(this);
	details.add(customerDetails);
	
	JMenuItem bookFlight = new JMenuItem("Book Flight");
	bookFlight.addActionListener(this);
	details.add(bookFlight);
	
	JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
	ticketCancellation.addActionListener(this);
	details.add(ticketCancellation);
	
	JMenu ticket = new JMenu("Ticket");
	menuBar.add(ticket);
	
	JMenuItem boardingPass = new JMenuItem("Boarding Pass");
	boardingPass.addActionListener(this);
	ticket.add(boardingPass);
	
	
	
	setExtendedState(JFrame.MAXIMIZED_BOTH);
	setVisible(true);
}
	

	public static void main(String[] args) {
		new Home();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
	String text = e.getActionCommand();
	
	if (text.equals("Add Customer Details")) {
		new AddCustomer();
	} else if (text.equals("Flight Details")) {
		new FlightInfo();
	} else if (text.equals("Book Flight")) {
		new BookFlight();
	} else if (text.equals("Cancel Ticket")) {
		new Cancel();
	} else if (text.equals("Boarding Pass")) {
		new BoardingPass();
	}
	}
}

