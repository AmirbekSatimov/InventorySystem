package login_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Login_Page {

	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
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
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(0, 0, 204));
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login System");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 41));
		lblLogin.setBounds(94, 11, 255, 43);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
		lblUsername.setBounds(67, 68, 99, 17);
		frame.getContentPane().add(lblUsername);
		
		JLabel lbPassword = new JLabel("Password");
		lbPassword.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
		lbPassword.setBounds(67, 147, 99, 17);
		frame.getContentPane().add(lbPassword);
		
		textUsername = new JTextField();
		textUsername.setForeground(new Color(0, 0, 0));
		textUsername.setBounds(230, 65, 163, 20);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(230, 147, 163, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = passwordField.getText();
				String username = textUsername.getText();
				
				if (password.contains("Banana") && username.contains("Amirbek")) {
					passwordField.setText(null);
					textUsername.setText(null);
					
					InventorySystem InventorySytem = new InventorySystem();
					InventorySystem.main(null);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Invalid Password or Username", "Login Error", JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					textUsername.setText(null);
				}
			}
		});
		btnLogin.setBounds(67, 209, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Arial", Font.BOLD, 15));
		btnCancel.setBackground(new Color(255, 255, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frmLoginSystem = new JFrame("Cancel");
				if(JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm You Wish to Cancel", "Login", 
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0); 
				}
			}
		});
		btnCancel.setBounds(304, 209, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 196, 399, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 53, 399, 4);
		frame.getContentPane().add(separator_1);
	}
}


