import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class InterfaceMain {

	private JFrame frame;
	private JTextField textFieldAccount;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceMain window = new InterfaceMain();
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
	public InterfaceMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldAccount = new JTextField();
		textFieldAccount.setBounds(140, 90, 150, 25);
		frame.getContentPane().add(textFieldAccount);
		textFieldAccount.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(140, 140, 150, 25);
		frame.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JButton btnNewButtonSignIn = new JButton("\u767B\u5165");
		btnNewButtonSignIn.setBounds(160, 193, 99, 27);
		frame.getContentPane().add(btnNewButtonSignIn);
		
		JLabel lblNewLabelAccount = new JLabel("\u5E33\u865F");
		lblNewLabelAccount.setBounds(57, 90, 57, 19);
		frame.getContentPane().add(lblNewLabelAccount);
		
		JLabel lblNewLabelPassword = new JLabel("\u5BC6\u78BC");
		lblNewLabelPassword.setBounds(57, 144, 57, 19);
		frame.getContentPane().add(lblNewLabelPassword);
		
		JLabel labelTop = new JLabel("     \u8ACB\u8F38\u5165\u5E33\u865F\u5BC6\u78BC");
		labelTop.setBounds(136, 55, 147, 19);
		frame.getContentPane().add(labelTop);
		
		JLabel labelQuestionNoAccount = new JLabel("\u6C92\u6709\u5E33\u865F\u55CE?");
		labelQuestionNoAccount.setBounds(170, 233, 89, 19);
		frame.getContentPane().add(labelQuestionNoAccount);
		
		JButton btnNewButtonRegister = new JButton("\u8A3B\u518A");
		btnNewButtonRegister.setBounds(160, 276, 99, 27);
		frame.getContentPane().add(btnNewButtonRegister);
	}
}
