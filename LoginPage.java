package VehicleBreakdown;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Button;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextArea;

public class LoginPage extends JFrame {

	private JLayeredPane contentPane;
	private JTextField userlog;
	private JPasswordField passwordField;
	private JTextField textField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup d=new ButtonGroup();
		
		UserInterface abc1=new UserInterface();
		MechanicInterface abc2=new MechanicInterface();
		
		JPanel MechPanel = new JPanel();
		MechPanel.setBackground(new Color(255, 255, 255));
		MechPanel.setBounds(140, 85, 272, 235);
		contentPane.add(MechPanel);
		MechPanel.setLayout(null);
		MechPanel.setVisible(false);
		
		JLabel lblMechanicPortal = new JLabel("MECHANIC PORTAL");
		lblMechanicPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMechanicPortal.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblMechanicPortal.setBounds(58, 10, 163, 28);
		MechPanel.add(lblMechanicPortal);
		
		textField = new JTextField();
		textField.setToolTipText("Enter Username...");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		textField.setBounds(97, 64, 145, 28);
		MechPanel.add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("Bad Credentials");
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setBounds(100, 212, 92, 13);
		MechPanel.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setVisible(false);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(97, 116, 145, 28);
		MechPanel.add(passwordField_1);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid=textField.getText();
				String pid=passwordField_1.getText();
				if(abc2.verifyLogin(uid, pid)) {
					lblNewLabel_4_1.setVisible(false);
					Mechface uframe=new Mechface(uid,pid);
					uframe.setVisible(true);
					dispose();
				}
				else {
					lblNewLabel_4_1.setVisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(142, 154, 100, 30);
		MechPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		
		btnNewButton_2_1.setBounds(32, 154, 100, 30);
		MechPanel.add(btnNewButton_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 48, 252, 162);
		MechPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lable1_1 = new JLabel("Username");
		lable1_1.setBounds(10, 20, 68, 27);
		panel_2.add(lable1_1);
		lable1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lable2_1 = new JLabel("Password");
		lable2_1.setBounds(10, 66, 59, 27);
		panel_2.add(lable2_1);
		lable2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Create new account..");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewMech nm=new NewMech();
				nm.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1.setBounds(85, 139, 129, 13);
		panel_2.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(SystemColor.textHighlight);
		
		
		
		JPanel UserPanel = new JPanel();
		UserPanel.setBackground(new Color(255, 255, 255));
		UserPanel.setBounds(140, 85, 272, 235);
		contentPane.add(UserPanel);
		
		
		userlog = new JTextField();
		userlog.setBounds(97, 62, 145, 28);
		userlog.setToolTipText("Enter Username...");
		userlog.setHorizontalAlignment(SwingConstants.LEFT);
		userlog.setColumns(10);
		
		JLabel lable1 = new JLabel("Username");
		lable1.setBounds(21, 65, 66, 27);
		lable1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lable2 = new JLabel("Password");
		lable2.setBounds(21, 114, 59, 27);
		lable2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblNewLabel_4 = new JLabel("Bad Credentials");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(97, 212, 92, 13);
		UserPanel.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter Password");
		passwordField.setBounds(97, 111, 145, 28);
		
		JLabel lblNewLabel = new JLabel("USER PORTAL");
		lblNewLabel.setBounds(84, 10, 123, 28);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid=userlog.getText();
				String pid=passwordField.getText();
				if(abc1.verifyLogin(uid, pid)) {
					lblNewLabel_4.setVisible(false);
					Userface uframe=new Userface(uid,pid);
					uframe.setVisible(true);
					dispose();
				}
				else {
					lblNewLabel_4.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(142, 149, 100, 30);
		UserPanel.setLayout(null);
		UserPanel.add(userlog);
		UserPanel.add(lable1);
		UserPanel.add(lable2);
		UserPanel.add(passwordField);
		UserPanel.add(lblNewLabel);
		UserPanel.add(btnNewButton);
		UserPanel.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("Create new account..");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewUser nu=new NewUser();
				nu.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setBounds(90, 189, 129, 13);
		UserPanel.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 48, 252, 162);
		UserPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(21, 101, 100, 30);
		panel_3.add(btnNewButton_2);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(180, 85, 193, 256);
		contentPane.add(panel);
		contentPane.setLayer(panel, 2);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 66, 172, 150);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JRadioButton adminbut = new JRadioButton("MECHANIC");
		adminbut.setBounds(27, 6, 128, 39);
		panel_4.add(adminbut);
		adminbut.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		d.add(adminbut);
		
		JRadioButton userbut = new JRadioButton("USER");
		userbut.setBounds(27, 49, 108, 46);
		panel_4.add(userbut);
		userbut.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		d.add(userbut);
		
		JButton btnNewButton_3 = new JButton("ENTER");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(userbut.isSelected()) {
					panel.setVisible(false);
					UserPanel.setVisible(true);
					
				}
				if(adminbut.isSelected()) {
					panel.setVisible(false);
					MechPanel.setVisible(true);
				}
			}
		});
		btnNewButton_3.setBounds(37, 101, 100, 28);
		panel_4.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("WELCOME");
		lblNewLabel_3.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel_3.setBounds(59, 25, 86, 17);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 102, 204));
		panel_1.setBounds(22, 10, 495, 46);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1.setBounds(41, 10, 426, 26);
		panel_1.add(lblNewLabel_1);
		panel.setVisible(true);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				MechPanel.setVisible(false);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				UserPanel.setVisible(false);
			}
		});
	}
}
