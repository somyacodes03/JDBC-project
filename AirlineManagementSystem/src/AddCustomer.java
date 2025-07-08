import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCustomer extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JTextField tfname, tfphone, tfaadhar, tfaddress, tfnationality;
	JRadioButton rbmale, rbfemale;
	
	public AddCustomer() {
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
       JLabel heading = new JLabel ("ADD CUSTOMER DETAILS");
		heading.setBounds(220, 20, 500, 35);
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 32));
		add(heading);
		
		JLabel lblname = new JLabel ("Name");
		lblname.setBounds(60, 80, 150, 25);
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblname);
		
		tfname = new JTextField();
		tfname.setBounds(220, 80, 150, 25);
		add(tfname);
		
		JLabel lblnationality = new JLabel ("Nationality");
		lblnationality.setBounds(60, 130, 150, 25);
		lblnationality.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblnationality);
		
		tfnationality = new JTextField();
		tfnationality.setBounds(220, 130, 150, 25);
		add(tfnationality);
		
		JLabel lblaadhar = new JLabel ("Adhaar Number");
		lblaadhar.setBounds(60, 180, 150, 25);
		lblaadhar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblaadhar);
		
		tfaadhar = new JTextField();
		tfaadhar.setBounds(220, 180, 150, 25);
		add(tfaadhar);
		
		
		JLabel lbladdress = new JLabel ("Address");
		lbladdress.setBounds(60, 230, 150, 25);
		lbladdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbladdress);
		
		tfaddress = new JTextField();
		tfaddress.setBounds(220, 230, 150, 25);
		add(tfaddress);
		
		JLabel lblgender = new JLabel ("Gender");
		lblgender.setBounds(60, 280, 150, 25);
		lblgender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblgender);
		
		ButtonGroup gendergroup = new ButtonGroup();
		
		rbmale = new JRadioButton("Male");
		rbmale.setBounds(220, 280, 70, 25);
		rbmale.setBackground(Color.white);
		add(rbmale);
		
		rbfemale = new JRadioButton("Female");
		rbfemale.setBounds(300, 280, 70, 25);
		rbfemale.setBackground(Color.white);
		add(rbfemale);
		
		gendergroup.add(rbfemale);
		gendergroup.add(rbmale);
		
		JLabel lblphone = new JLabel ("Phone Number");
		lblphone.setBounds(60, 330, 150, 25);
		lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblphone);
		
		tfphone = new JTextField();
		tfphone.setBounds(220, 330, 150, 25);
		add(tfphone);
		
		JButton save = new JButton("SAVE");
		save.setBackground(Color.black);
		save.setForeground(Color.white);
		save.setBounds(220, 380, 150, 30);
		save.addActionListener(this);
		add(save);
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/emp.jpg"));
		JLabel image = new JLabel (i1);
		image.setBounds(450, 80, 280, 400);
		add(image);
		
		setSize(900, 600);
		setLocation(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AddCustomer();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = tfname.getText();
		String nationality = tfnationality.getText();
		String phone = tfphone.getText();
		String address = tfaddress.getText();
		String aadhar = tfaadhar.getText();
		String gender = null;
		if (rbmale.isSelected()) {
			gender = "Male";
		} else { 
			gender = "Female";
		}
		
	try {
		Conn conn = new Conn();
		
		String query = "insert into passenger values('"+name+"', '"+nationality+"', '"+phone+"', '"+aadhar+"', '"+address+"', '"+gender+"')";
	conn.s.executeUpdate(query);
	JOptionPane.showMessageDialog(null, "Customer Details Added Sucessfully");
	
	setVisible(false);
	} catch (Exception e2) {
		e2.printStackTrace();
	}
		
	}

}
