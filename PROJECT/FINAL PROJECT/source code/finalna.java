package finalna;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class finalna {
	
	JFrame frame;
	private JTextField FN;
	private JTextField LN;
	private JTextField CONTACT;
	private JTextField ADDRESS;
	private JTextField payment;
	String py, ch;
	double am, pay, change, total;
	String pcs, ads1, del, flava;
	private JCheckBox[] checkboxes;
	private int currentlimit = 1;
	double delfee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalna window = new finalna();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void clearSelectedCheckboxes() {
	    for (int i = 0; i < checkboxes.length; i++) {
	        checkboxes[i].setSelected(false);
	    }
	}
	/**
	 * Create the application.
	 */
	public finalna() {
		initialize();
	} 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 958, 553);
		frame.getContentPane().add(panel);
		 
		 JLabel lblNewLabel_3_1_1_1 = new JLabel("ADD-ONS");
		 lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		 lblNewLabel_3_1_1_1.setBounds(237, 344, 169, 14);
		 panel.add(lblNewLabel_3_1_1_1);
		 
		 JLabel lblNewLabel_3_1_1 = new JLabel("FLAVORS");
		 lblNewLabel_3_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		 lblNewLabel_3_1_1.setBounds(237, 199, 169, 14);
		 panel.add(lblNewLabel_3_1_1);
		 
		 JLabel lblNewLabel_3_2 = new JLabel("DELIVERY OPTIONS");
		 lblNewLabel_3_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		 lblNewLabel_3_2.setBounds(382, 56, 169, 14);
		 panel.add(lblNewLabel_3_2);
		 
		 JLabel lblNewLabel_3_1 = new JLabel("PIECES/PRICES");
		 lblNewLabel_3_1.setBounds(10, 198, 169, 14);
		 panel.add(lblNewLabel_3_1);
		 lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		 
		 JLabel lblNewLabel_3 = new JLabel("CUSTOMER INFORMATION");
		 lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		 lblNewLabel_3.setBounds(10, 56, 169, 14);
		 panel.add(lblNewLabel_3);
		 
		 JLabel lblNewLabel_2 = new JLabel("O R D E R");
		 lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 37));
		 lblNewLabel_2.setBounds(295, -26, 371, 94);
		 panel.add(lblNewLabel_2);
		
	
		 JPanel panel_1 = new JPanel();
		 panel_1.setForeground(Color.YELLOW);
		 panel_1.setBackground(new Color(255, 215, 0));	
		panel_1.setLayout(null);
		panel_1.setBounds(10, 75, 362, 112);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 11, 105, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblLastName.setBounds(10, 34, 105, 14);
		panel_1.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblAddress.setBounds(10, 59, 89, 14);
		panel_1.add(lblAddress);
		
		JLabel lblContactNumber = new JLabel("Contact No:");
		lblContactNumber.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblContactNumber.setBounds(10, 84, 159, 14);
		panel_1.add(lblContactNumber);
		
		FN = new JTextField();
		FN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		FN.setColumns(10);
		FN.setBounds(106, 11, 246, 20);
		panel_1.add(FN);
		
		LN = new JTextField();
		LN.setColumns(10);
		LN.setBounds(106, 34, 246, 20);
		panel_1.add(LN);
		
		CONTACT = new JTextField();
		CONTACT.setColumns(10);
		CONTACT.setBounds(106, 84, 246, 20);
		panel_1.add(CONTACT);
		
		ADDRESS = new JTextField();
		ADDRESS.setColumns(10);
		ADDRESS.setBounds(106, 59, 246, 20);
		panel_1.add(ADDRESS);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 215, 0));
		panel_3.setLayout(null);
		panel_3.setBounds(10, 215, 221, 202);
		panel.add(panel_3);
		
		final JRadioButton six = new JRadioButton("6 pcs (1 Flavor)- PHP 150");
		six.setBackground(new Color(255, 215, 0));
		six.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		six.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		six.setBounds(6, 7, 184, 23);
		panel_3.add(six);
		
		final JRadioButton twelve = new JRadioButton("12 pcs (2 Flavors)-PHP 280");
		twelve.setBackground(new Color(255, 215, 0));
		twelve.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		twelve.setBounds(6, 33, 207, 23);
		panel_3.add(twelve);
		
		final JRadioButton twenty = new JRadioButton("20 pcs (2 Flavors)-PHP 380");
		twenty.setBackground(new Color(255, 215, 0));
		twenty.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		twenty.setBounds(6, 59, 207, 23);
		panel_3.add(twenty);
		
		final JRadioButton thirty = new JRadioButton("30 pcs (3 Flavors)-PHP 630");
		thirty.setBackground(new Color(255, 215, 0));
		thirty.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		thirty.setBounds(6, 85, 193, 23);
		panel_3.add(thirty);
		
		final JRadioButton forty = new JRadioButton("40 pcs (4 Flavors/ w 1 Dip)-PHP 860");
		forty.setBackground(new Color(255, 215, 0));
		forty.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		forty.setBounds(6, 111, 273, 23);
		panel_3.add(forty);
		
		final JRadioButton fifty = new JRadioButton("50 pcs (5 Flavors/ w 2 Dip)-PHP 999");
		fifty.setBackground(new Color(255, 215, 0));
		fifty.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		fifty.setBounds(6, 137, 224, 23);
		panel_3.add(fifty);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 215, 0));
		panel_4.setLayout(null);
		panel_4.setBounds(237, 215, 278, 122);
		panel.add(panel_4);
		
		final JCheckBox classic = new JCheckBox("Classic Buffalo");
		classic.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		classic.setBackground(new Color(255, 215, 0));
		classic.setBounds(6, 7, 141, 23);
		panel_4.add(classic);
		
		final JCheckBox salted = new JCheckBox("Salted Egg");
		salted.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		salted.setBackground(new Color(255, 215, 0));
		salted.setBounds(6, 33, 127, 23);
		panel_4.add(salted);
		
		final JCheckBox lemon = new JCheckBox("Lemon Glazed");
		lemon.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lemon.setBackground(new Color(255, 215, 0));
		lemon.setBounds(6, 59, 127, 23);
		panel_4.add(lemon);
		
		final JCheckBox buttered = new JCheckBox("Buttered Garlic");
		buttered.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		buttered.setBackground(new Color(255, 215, 0));
		buttered.setBounds(6, 85, 127, 23);
		panel_4.add(buttered);
		
		final JCheckBox teriyaki = new JCheckBox("Teriyaki");
		teriyaki.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		teriyaki.setBackground(new Color(255, 215, 0));
		teriyaki.setBounds(177, 7, 97, 23);
		panel_4.add(teriyaki);
		
		final JCheckBox soy = new JCheckBox("Soy Garlic");
		soy.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		soy.setBackground(new Color(255, 215, 0));
		soy.setBounds(177, 33, 97, 23);
		panel_4.add(soy);
		
		final JCheckBox honey = new JCheckBox("Honey BBQ");
		honey.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		honey.setBackground(new Color(255, 215, 0));
		honey.setBounds(177, 59, 97, 23);
		panel_4.add(honey);
		
		final JCheckBox hickory = new JCheckBox("Hickory BBQ");
		hickory.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		hickory.setBackground(new Color(255, 215, 0));
		hickory.setBounds(177, 85, 141, 23);
		panel_4.add(hickory);
		
		checkboxes = new JCheckBox[]  {classic,salted,lemon,buttered,teriyaki,soy,honey,hickory};
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 215, 0));
		panel_5.setLayout(null);
		panel_5.setBounds(237, 361, 278, 56);
		panel.add(panel_5);
		
		final JRadioButton saltedDip = new JRadioButton("Salted Egg");
		saltedDip.setForeground(new Color(0, 0, 0));
		saltedDip.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		saltedDip.setBackground(new Color(255, 215, 0));
		saltedDip.setBounds(43, 7, 109, 23);
		panel_5.add(saltedDip);
		
		final JRadioButton dipsauce = new JRadioButton("Dip Sauce Garlic Mayo");
		dipsauce.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		dipsauce.setBackground(new Color(255, 215, 0));
		dipsauce.setBounds(43, 33, 159, 23);
		panel_5.add(dipsauce);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(74, 74, 74));
		panel_6.setLayout(null);
		panel_6.setBounds(535, 61, 221, 297);
		panel.add(panel_6);
		
		JLabel totalTxt = new JLabel("Total");
		totalTxt.setForeground(Color.WHITE);
		totalTxt.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		totalTxt.setBounds(24, 11, 46, 14);
		panel_6.add(totalTxt);
		
		JLabel paymentTxt = new JLabel("Payment");
		paymentTxt.setForeground(Color.WHITE);
		paymentTxt.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		paymentTxt.setBounds(24, 81, 69, 14);
		panel_6.add(paymentTxt);
		
		final JTextPane tottxt = new JTextPane();
		tottxt.setBounds(24, 29, 166, 20);
		panel_6.add(tottxt);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 215, 0));
		panel_2.setBounds(382, 75, 133, 112);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		payment = new JTextField();
		payment.setColumns(10);
		payment.setBounds(24, 102, 166, 20);
		panel_6.add(payment);
		
		final JRadioButton pickup = new JRadioButton("Pick-Up");
		pickup.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		pickup.setBackground(new Color(255, 215, 0));
		pickup.setBounds(24, 19, 109, 23);
		panel_2.add(pickup);
		
		final JRadioButton delivery = new JRadioButton("Delivery");
		delivery.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		delivery.setBackground(new Color(255, 215, 0));
		delivery.setBounds(24, 45, 109, 23);
		panel_2.add(delivery);
		
		JButton btnNewButton = new JButton("CONFIRM ORDER");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(37, 168, 153, 82);
		panel_6.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				flava = "";
				if (pickup.isSelected() == true) {
					del = "PICKUP";
				}
				if (delivery.isSelected() == true) {
					delfee = 30;
					total += delfee;
					del = "DELIVERY (P30)";	
				}
				if (classic.isSelected() == true) {
					flava = " CLASSIC BUFFALO";
				}
				if (salted.isSelected() == true) {
					flava  +=", " + "SALTED EGG";
				}
				if (lemon.isSelected() == true) {
					flava  += ", " +"LEMON GLAZED";
				}
				if (buttered.isSelected() == true) {
					flava  += ", " +"BUTTERED GARLIC";
				}if (teriyaki.isSelected() == true) {
					flava  += ", " +"TERIYAKI";
				}if (soy.isSelected() == true) {
					flava  += ", " +"SOY GARLIC";
				}if (honey.isSelected() == true) {
					flava  += ", " +"HONEY BBQ";
				}if (hickory.isSelected() == true) {
					flava  += ", " +"HICKORY";
				}
				if(saltedDip.isSelected() == true && dipsauce.isSelected() == true) {
					ads1 = "SALTED EGG + DIP SAUCE GARLIC MAYO";
				}
				else if(saltedDip.isSelected() == true && dipsauce.isSelected() == false) {
					ads1 = "SALTED EGG";
				}else if(saltedDip.isSelected() == false && dipsauce.isSelected() == true) {
					ads1 = "DIP SAUCE GARLIC MAYO";
				}
				else {ads1 = "no adds-on";}
			
				  py = payment.getText();
			        pay = Double.parseDouble(py);
			        change = pay - total;
			        ch = String.valueOf(change);
			        String firstNameValue = FN.getText();
			        String lastNameValue = LN.getText();
			        String contactValue = CONTACT.getText();
			        String addressValue = ADDRESS.getText();
			        receipty window = new receipty(total, change, ch, firstNameValue, lastNameValue, contactValue, addressValue, payment, py, FN, LN, ADDRESS, CONTACT, pcs, ads1, del, flava);
			        frame.dispose();
			        window.frame.setVisible(true);
			        
			        
			}
		});
		
		classic.setEnabled(false);
		salted.setEnabled(false);
		lemon.setEnabled(false);
		buttered.setEnabled(false);
		teriyaki.setEnabled(false);
		soy.setEnabled(false);
		honey.setEnabled(false);
		hickory.setEnabled(false);
		saltedDip.setEnabled(false);
		dipsauce.setEnabled(false);
		
	
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\v960-ning-16-g-x_1.jpg"));
		lblNewLabel_1.setBounds(-11, -13, 801, 464);
		panel.add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(-1, 442, 801, 100);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\resize-16907447417688839roosteresportlogodesignremovebgpreviewremovebgpreview (1).png"));
		lblNewLabel_4.setBounds(4, 5, 178, 81);
		panel_7.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("lordofthewings@gmail.com");
		lblNewLabel_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(111, 33, 276, 23);
		panel_7.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("LORD OF THE WINGS");
		lblNewLabel_5_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(110, 15, 276, 23);
		panel_7.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("09387517577");
		lblNewLabel_5_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(111, 50, 276, 23);
		panel_7.add(lblNewLabel_5_2);
		
		JLabel lblAboutUs = new JLabel("ABOUT US");
		lblAboutUs.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		lblAboutUs.setBounds(682, 27, 134, 32);
		panel_7.add(lblAboutUs);
		
		JLabel lblContactUs = new JLabel("SEND US YOUR FEEDBACK");
		lblContactUs.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		lblContactUs.setBounds(477, 27, 178, 32);
		panel_7.add(lblContactUs);
		
		JLabel lblOtherBranches = new JLabel("OTHER BRANCHES");
		lblOtherBranches.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		lblOtherBranches.setBounds(311, 27, 178, 32);
		panel_7.add(lblOtherBranches);
		

		pickup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pickup.isSelected() == true) {
					delivery.setSelected(false);
				}
			}
		});
		
		delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (delivery.isSelected() == true) {
					pickup.setSelected(false);
				}
			}
		});
		
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(six.isSelected() == true) {
					am = 150;
					total = am;
					pcs = "6";
					tottxt.setText("P" + total);
					twelve.setSelected(false);
					twenty.setSelected(false);
					thirty.setSelected(false);
					forty.setSelected(false);
					fifty.setSelected(false);
					
					classic.setEnabled(true);
					salted.setEnabled(true);
					lemon.setEnabled(true);
					buttered.setEnabled(true);
					teriyaki.setEnabled(true);
					soy.setEnabled(true);
					honey.setEnabled(true);
					hickory.setEnabled(true);
					saltedDip.setEnabled(true);
					dipsauce.setEnabled(true);
					
					
					currentlimit=1;
					   clearSelectedCheckboxes();
				}else {total = 0;
				tottxt.setText("P" + total);
				classic.setEnabled(false);
				salted.setEnabled(false);
				lemon.setEnabled(false);
				buttered.setEnabled(false);
				teriyaki.setEnabled(false);
				soy.setEnabled(false);
				honey.setEnabled(false);
				hickory.setEnabled(false);
				saltedDip.setEnabled(false);
				dipsauce.setEnabled(false);}
			}
		});
		
		twelve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(twelve.isSelected() == true) {
					am = 280;
					total = am;
					pcs = "12";
					tottxt.setText("P" + total);
					six.setSelected(false);
					twenty.setSelected(false);
					thirty.setSelected(false);
					forty.setSelected(false);
					fifty.setSelected(false);
					classic.setEnabled(true);
					salted.setEnabled(true);
					lemon.setEnabled(true);
					buttered.setEnabled(true);
					teriyaki.setEnabled(true);
					soy.setEnabled(true);
					honey.setEnabled(true);
					hickory.setEnabled(true);
					saltedDip.setEnabled(true);
					dipsauce.setEnabled(true);
					currentlimit=2;
					   clearSelectedCheckboxes();
			}else {total = 0;
			tottxt.setText("P" + total);classic.setEnabled(false);
			salted.setEnabled(false);
			lemon.setEnabled(false);
			buttered.setEnabled(false);
			teriyaki.setEnabled(false);
			soy.setEnabled(false);
			honey.setEnabled(false);
			hickory.setEnabled(false);
			saltedDip.setEnabled(false);
			dipsauce.setEnabled(false);}
			}
		});
		
		twenty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(twenty.isSelected() == true) {
					am = 480;
					total = am;
					pcs = "20";
					tottxt.setText("P" + total);
					six.setSelected(false);
					twelve.setSelected(false);
					thirty.setSelected(false);
					forty.setSelected(false);
					fifty.setSelected(false);
					classic.setEnabled(true);
					salted.setEnabled(true);
					lemon.setEnabled(true);
					buttered.setEnabled(true);
					teriyaki.setEnabled(true);
					soy.setEnabled(true);
					honey.setEnabled(true);
					hickory.setEnabled(true);
					saltedDip.setEnabled(true);
					dipsauce.setEnabled(true);
					currentlimit=2;
					   clearSelectedCheckboxes();
			}else {total = 0;
			tottxt.setText("P" + total);classic.setEnabled(false);
			salted.setEnabled(false);
			lemon.setEnabled(false);
			buttered.setEnabled(false);
			teriyaki.setEnabled(false);
			soy.setEnabled(false);
			honey.setEnabled(false);
			hickory.setEnabled(false);
			saltedDip.setEnabled(false);
			dipsauce.setEnabled(false);}
			}
		});
		
		thirty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(thirty.isSelected() == true) {
					am = 630;
					total = am;
					pcs = "20";
					tottxt.setText("P" + total);
					six.setSelected(false);
					twelve.setSelected(false);
					twenty.setSelected(false);
					forty.setSelected(false);
					fifty.setSelected(false);
					classic.setEnabled(true);
					salted.setEnabled(true);
					lemon.setEnabled(true);
					buttered.setEnabled(true);
					teriyaki.setEnabled(true);
					soy.setEnabled(true);
					honey.setEnabled(true);
					hickory.setEnabled(true);
					saltedDip.setEnabled(true);
					dipsauce.setEnabled(true);
					currentlimit=3;
					   clearSelectedCheckboxes();
				}else {total = 0;
				tottxt.setText("P" + total);
				classic.setEnabled(false);
				salted.setEnabled(false);
				lemon.setEnabled(false);
				buttered.setEnabled(false);
				teriyaki.setEnabled(false);
				soy.setEnabled(false);
				honey.setEnabled(false);
				hickory.setEnabled(false);
				saltedDip.setEnabled(false);
				dipsauce.setEnabled(false);}
			}
		});
		
		forty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(forty.isSelected() == true) {
					am = 860;
					total = am;
					pcs = "40";
					tottxt.setText("P" + total);
					six.setSelected(false);
					twelve.setSelected(false);
					twenty.setSelected(false);
					thirty.setSelected(false);
					fifty.setSelected(false);
					classic.setEnabled(true);
					salted.setEnabled(true);
					lemon.setEnabled(true);
					buttered.setEnabled(true);
					teriyaki.setEnabled(true);
					soy.setEnabled(true);
					honey.setEnabled(true);
					hickory.setEnabled(true);
					saltedDip.setEnabled(true);
					dipsauce.setEnabled(true);
					currentlimit=4;
					   clearSelectedCheckboxes();
					
				}else {total = 0;
				tottxt.setText("P" + total);
				classic.setEnabled(false);
				salted.setEnabled(false);
				lemon.setEnabled(false);
				buttered.setEnabled(false);
				teriyaki.setEnabled(false);
				soy.setEnabled(false);
				honey.setEnabled(false);
				hickory.setEnabled(false);
				saltedDip.setEnabled(false);
				dipsauce.setEnabled(false);}
			}
		});
		
		fifty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fifty.isSelected() == true) {
					am = 999;
					total = am;
					pcs = "50";
					tottxt.setText("P" + total);
					six.setSelected(false);
					twelve.setSelected(false);
					twenty.setSelected(false);
					thirty.setSelected(false);
					forty.setSelected(false);
					classic.setEnabled(true);
					salted.setEnabled(true);
					lemon.setEnabled(true);
					buttered.setEnabled(true);
					teriyaki.setEnabled(true);
					soy.setEnabled(true);
					honey.setEnabled(true);
					hickory.setEnabled(true);
					saltedDip.setEnabled(true);
					dipsauce.setEnabled(true);
					currentlimit=5;
					   clearSelectedCheckboxes();
				}else {total = 0;
				tottxt.setText("P" + total);
				classic.setEnabled(false);
				salted.setEnabled(false);
				lemon.setEnabled(false);
				buttered.setEnabled(false);
				teriyaki.setEnabled(false);
				soy.setEnabled(false);
				honey.setEnabled(false);
				hickory.setEnabled(false);
				saltedDip.setEnabled(false);
				dipsauce.setEnabled(false);}
			}
		});
				
		for (int i = 0 ;i< checkboxes.length;i++) {
			final JCheckBox checkbox = checkboxes[i];
			checkbox.addItemListener(new ItemListener() {

				public void itemStateChanged(ItemEvent e) {
			            int selectedCount = 0;
			            for (int j = 0; j < checkboxes.length; j++) {
			                if (checkboxes[j].isSelected()) {
			                    selectedCount++;
			                  
			                }
			            }
			            if (selectedCount > currentlimit) {
	                        JCheckBox source = (JCheckBox) e.getSource();
	                        source.setSelected(false);
	                    }
	                }
	            });
				}
		saltedDip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(saltedDip.isSelected() == true) {
					total = total + 20;
					tottxt.setText("P" + total);
				} else {
						total = total - 20;
						tottxt.setText("P" + total);
					}
				}
		});
		dipsauce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dipsauce.isSelected() == true) {
					total = total + 25;
					tottxt.setText("P" + total);
				}else {
					total = total -25;
					tottxt.setText("P"+ total);
				}
			}
		});
		
		
		
	}
}