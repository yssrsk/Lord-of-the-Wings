package finalna;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class receipty{
	 private static double total;
	    private static double change;
	    private double pay;
	    private static  String ch;
	    private static String firstName;
	    private static  String lastName;
	    private static  String contact;
	    private static  String address;
	    private static String py, pcs, ads, del,flava;
	    private static JTextField FN, LN, ADDRESS, CONTACT, payment;
	
	    JFrame frame;
	protected Object amountpane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receipty window = new receipty(total, change, ch,firstName,lastName,contact,address, payment, py, FN, LN, ADDRESS, CONTACT, pcs, ads, del, flava);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	/**
	 * Create the application.
	 */
	public receipty(double total, double change, String ch, String firstName, String lastName, String contact, String address, JTextField payment, String py, JTextField FN, JTextField LN, JTextField ADDRESS, JTextField CONTACT, String pcs, String ads, String del, String flava) {
        this.total = total;
        this.change = change;
        this.ch = ch;
        this.payment = payment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.address = address;
        this.py = py;
        this.FN = FN;
        this.LN = LN;
        this.ADDRESS = ADDRESS;
        this.CONTACT = CONTACT;
        this.pcs = pcs;
        this.ads = ads;
        this.del = del;
        this.flava = flava;
        initialize();
    }

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.setBounds(100, 100, 747, 724);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    
		frame = new JFrame();
		frame.setBounds(100, 100, 541, 669);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 751, 685);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblOwnedAndOperated = new JLabel("OWNED AND OPERATED BY HENRICH");
		lblOwnedAndOperated.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblOwnedAndOperated.setBounds(131, 60, 261, 14);
		panel.add(lblOwnedAndOperated);
		
		JLabel lblNewLabel_1_1 = new JLabel("ADDRESS:");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(82, 171, 131, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1_1_3_1 = new JLabel("AMOUNT");
		lblNewLabel_3_1_1_3_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_3_1_1_3_1.setBounds(230, 508, 70, 14);
		panel.add(lblNewLabel_3_1_1_3_1);
		
		JLabel lblNewLabel_3_1_1_4_1 = new JLabel("CHANGE");
		lblNewLabel_3_1_1_4_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_3_1_1_4_1.setBounds(310, 508, 70, 14);
		panel.add(lblNewLabel_3_1_1_4_1);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("TOTAL");
		lblNewLabel_3_1_1_2_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_3_1_1_2_1.setBounds(150, 508, 46, 14);
		panel.add(lblNewLabel_3_1_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(82, 143, 131, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("DELIVERY OPTION");
		lblNewLabel_3_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_1_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1.setBounds(84, 406, 150, 14);
		panel.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PHONE NUMBER:");
		lblNewLabel_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(82, 198, 131, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("PIECES");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(84, 239, 174, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ADD-ONS");
		lblNewLabel_3_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(84, 351, 150, 14);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("FLAVORS");
		lblNewLabel_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(84, 295, 150, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("-----------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2.setBounds(43, 223, 526, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("lordofthewings@gmail.com");
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel.setBounds(150, 45, 222, 14);
		panel.add(lblNewLabel);
		
		JTextPane name = new JTextPane();
		name.setFont(new Font("Courier New", Font.PLAIN, 15));
		name.setBackground(Color.WHITE);
		name.setBounds(209, 143, 282, 20);
		panel.add(name);
		
		JTextPane pcstxt = new JTextPane();
		pcstxt.setFont(new Font("Courier New", Font.PLAIN, 15));
		pcstxt.setBackground(Color.WHITE);
		pcstxt.setBounds(84, 264, 182, 20);
		panel.add(pcstxt);
		
		JTextPane address = new JTextPane();
		address.setFont(new Font("Courier New", Font.PLAIN, 15));
		address.setBackground(Color.WHITE);
		address.setBounds(209, 169, 282, 20);
		panel.add(address);
		
		JTextPane phone = new JTextPane();
		phone.setFont(new Font("Courier New", Font.PLAIN, 15));
		phone.setBackground(Color.WHITE);
		phone.setBounds(209, 194, 194, 20);
		panel.add(phone);
		
		JTextPane flavatxt = new JTextPane();
		flavatxt.setFont(new Font("Courier New", Font.PLAIN, 15));
		flavatxt.setBackground(Color.WHITE);
		flavatxt.setBounds(82, 308, 432, 40);
		panel.add(flavatxt);
		
		JTextPane ADSTXT = new JTextPane();
		ADSTXT.setFont(new Font("Courier New", Font.PLAIN, 15));
		ADSTXT.setBackground(Color.WHITE);
		ADSTXT.setBounds(84, 371, 429, 20);
		panel.add(ADSTXT);
		
		JTextPane deltxt = new JTextPane();
		deltxt.setFont(new Font("Courier New", Font.PLAIN, 15));
		deltxt.setBackground(Color.WHITE);
		deltxt.setBounds(84, 426, 174, 20);
		panel.add(deltxt);
		
		JTextPane totalpane = new JTextPane();
		totalpane.setFont(new Font("Courier New", Font.PLAIN, 15));
		totalpane.setBackground(Color.LIGHT_GRAY);
		totalpane.setBounds(150, 533, 70, 20);
		panel.add(totalpane);
		
		JTextPane amountpane = new JTextPane();
		amountpane.setFont(new Font("Courier New", Font.PLAIN, 15));
		amountpane.setBackground(Color.LIGHT_GRAY);
		amountpane.setBounds(230, 533, 70, 20);
		panel.add(amountpane);
		
		JTextPane changepane = new JTextPane();
		changepane.setFont(new Font("Courier New", Font.PLAIN, 15));
		changepane.setBackground(Color.LIGHT_GRAY);
		changepane.setBounds(310, 533, 70, 20);
		panel.add(changepane);
		
		name.setEditable(false);
		address.setEditable(false);
		phone.setEditable(false);
		ADSTXT.setEditable(false);
		totalpane.setEditable(false);
		amountpane.setEditable(false);
		changepane.setEditable(false);
		deltxt.setEditable(false);
		flavatxt.setEditable(false);
		
		
		
		 py = payment.getText();
	        pay = Double.parseDouble(py);
	        change = pay - total;
	        ch = String.valueOf(change);
		
	     name.setText(FN.getText() + " " + LN.getText());
	     address.setText(ADDRESS.getText());
	     phone.setText(CONTACT.getText());
	     pcstxt.setText(pcs);
	     ADSTXT.setText(ads);
	     deltxt.setText(del);
	     flavatxt.setText(String.valueOf(flava));
		totalpane.setText("P" +String.valueOf(total));
	    amountpane.setText("P" +String.valueOf(pay));
	    changepane.setText("P" +ch);
	    
	    JLabel lblNewLabel_4 = new JLabel("LORD OF THE WINGS");
	    lblNewLabel_4.setFont(new Font("Courier New", Font.PLAIN, 15));
	    lblNewLabel_4.setBounds(186, 31, 187, 14);
	    panel.add(lblNewLabel_4);
	    
	    JLabel lblP = new JLabel("091 General Yngente Avenue");
	    lblP.setFont(new Font("Courier New", Font.PLAIN, 15));
	    lblP.setBounds(144, 75, 261, 14);
	    panel.add(lblP);
	    
	    JLabel lblBarangayTalolongLopez = new JLabel("Barangay Talolong Lopez, Quezon");
	    lblBarangayTalolongLopez.setFont(new Font("Courier New", Font.PLAIN, 15));
	    lblBarangayTalolongLopez.setBounds(131, 88, 289, 14);
	    panel.add(lblBarangayTalolongLopez);
	    
	    JButton exit = new JButton("EXIT");
	    exit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		 JOptionPane.showMessageDialog(frame, "THANK YOU FOR PURCHASING! PLEASE ORDER AGAIN!");
	    		 frame.dispose();
	    	}
	    });
	    exit.setBounds(211, 577, 89, 23);
	    panel.add(exit);
	    
	    JLabel lblNewLabel_2_1 = new JLabel("-----------------------------------------------------------------------------------------------------------------");
	    lblNewLabel_2_1.setBounds(43, 457, 526, 14);
	    panel.add(lblNewLabel_2_1);
	    
	    JLabel lblNewLabel_5 = new JLabel("lllllllllllllllllllllllllllllllll");
	    lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
	    lblNewLabel_5.setBounds(146, 474, 288, 23);
	    panel.add(lblNewLabel_5);
	    
	}
}
