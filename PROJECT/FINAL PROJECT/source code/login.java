package finalna;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class login {

	JFrame frame;
	private JTextField USER;
	private JPasswordField PASS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 682, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(319, 0, 347, 433);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOG IN ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(63, 23, 249, 92);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 43));
		panel.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblUsername.setBounds(63, 162, 91, 14);
		lblUsername.setForeground(Color.WHITE);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblPassword.setBounds(63, 212, 91, 14);
		lblPassword.setForeground(Color.WHITE);
		panel.add(lblPassword);
		
		USER = new JTextField();
		USER.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		USER.setBounds(63, 187, 240, 20);
		USER.setBackground(Color.WHITE);
		panel.add(USER);
		USER.setColumns(10);
		
		PASS = new JPasswordField();
		PASS.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		PASS.setBounds(63, 237, 240, 20);	
		PASS.setBackground(Color.WHITE);
		panel.add(PASS);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnNewButton.setBounds(63, 291, 240, 23);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = USER.getText();
		        String password = PASS.getText();
		        pro pros = new pro();
		        finalna finals = new finalna();
		        if ("user".equals(username) && "admin".equals(password))
		        {	frame.dispose();
		        	pros.frame.setVisible(true);
		        } else {
		            JOptionPane.showMessageDialog(frame, "Invalid username or password!");
		        }
			}
		});
		panel.add(btnNewButton);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
		chckbxNewCheckBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(63, 261, 145, 23);
		chckbxNewCheckBox.setBackground(Color.RED);
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					PASS.setEchoChar((char)0);
				}else
				{
					PASS.setEchoChar('*');
				}	
			}
		});
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("\"When it comes to Chicken Wings, ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(78, 100, 206, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("We Reign Supreme - Lord of the Wings!\"");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(66, 119, 406, 28);
		panel.add(lblNewLabel_2_2);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PASS.setText("");
				USER.setText("");
			}
		
		});
		btnNewButton_1.setBounds(63, 325, 240, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 321, 433);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\2ND YR BSIT\\2ND SEMESTER\\OBJECT ORIENTED PROGRAMMING\\PROJECT\\364235844_527041532893560_4241998159015827697_n.png"));
		lblNewLabel_1.setBounds(-89, 11, 384, 383);
		panel_1.add(lblNewLabel_1);
	}
}
