import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 480, 571);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 20));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(10, 53, 480, 30);
		panel.add(lblWelcome);
		
		textField = new JTextField();
		textField.setBounds(120, 161, 240, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 238, 240, 30);
		panel.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername.setBounds(120, 136, 240, 25);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPassword.setBounds(120, 213, 240, 25);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorderPainted(false);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(93, 143, 252));
		btnLogin.setBounds(120, 295, 240, 30);
		panel.add(btnLogin);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me");
		chckbxRememberMe.setBackground(new Color(255, 255, 255));
		chckbxRememberMe.setFont(new Font("Arial", Font.PLAIN, 13));
		chckbxRememberMe.setBounds(120, 334, 111, 25);
		panel.add(chckbxRememberMe);
		
		JLabel lblDontHaveAn = new JLabel("Don't have an account yet?");
		lblDontHaveAn.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDontHaveAn.setBounds(120, 500, 165, 25);
		panel.add(lblDontHaveAn);
		
		JLabel lblSignup = new JLabel("Signup");
		lblSignup.setForeground(new Color(0, 153, 153));
		lblSignup.setFont(new Font("Arial", Font.BOLD, 13));
		lblSignup.setBounds(280, 500, 46, 25);
		panel.add(lblSignup);
		
		JButton btnLogInWith = new JButton("Log in with Google");
		btnLogInWith.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogInWith.setIcon(new ImageIcon(Login.class.getResource("/resources/google_16px.png")));
		btnLogInWith.setBackground(new Color(240, 240, 240));
		btnLogInWith.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogInWith.setBounds(120, 417, 240, 33);
		panel.add(btnLogInWith);
		
		JLabel lblForgotPasword = new JLabel("Forgot pasword?");
		lblForgotPasword.setForeground(new Color(0, 153, 204));
		lblForgotPasword.setFont(new Font("Arial", Font.PLAIN, 12));
		lblForgotPasword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForgotPasword.setBounds(260, 336, 100, 25);
		panel.add(lblForgotPasword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(480, 0, 514, 571);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		ImageIcon loginIcon = new ImageIcon(Login.class.getResource("resources/login.jpg"));	
		Image image = loginIcon.getImage();
		Image loginImg = image.getScaledInstance(514, 571, Image.SCALE_DEFAULT);
		loginIcon = new ImageIcon(loginImg);
		
		JLabel label = new JLabel(new ImageIcon(loginImg));
//		label.setIcon(new ImageIcon(Login.class.getResource("/resources/login.jpg")));
		label.setBounds(0, 0, 514, 571);
		panel_1.add(label);
		
	}
}
