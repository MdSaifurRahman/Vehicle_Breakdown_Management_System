package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.LayoutManager;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JTextArea;

public class NewMech extends JFrame {

	private JPanel contentPane;
	private JTextField newuser;
	private JPasswordField pw1;
	private JPasswordField pw2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel picf;
	private JLabel lblNewLabel_4;
	private JLabel image;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton_3;
	private JPanel panel_2;
	private JLabel lblNewLabel_5;
	private JTextField phfld;
	private JLabel phrqd;
	private JLabel lcrqd;
	private JTextField nfld;

	/**
	 * Launch the application.
	 * @return 
	 */
	public boolean validpw(String s) {
	
		String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + "(?=.*[-+_!@#$%^&*., ?]).+$";

		Pattern p = Pattern.compile(regex);

		if (s.length()!=8) {
			return false;
		}	

		// Find match between given string
		// & regular expression
		Matcher m = p.matcher(s);

		if (m.matches())
			return true;
		else
			return false;
		}
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMech frame = new NewMech();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public NewMech() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(20, 66, 255, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		newuser = new JTextField();
		newuser.setToolTipText("Enter email id");
		newuser.setBounds(80, 15, 145, 28);
		panel.add(newuser);
		newuser.setColumns(10);
		
		JButton btnNewButton = new JButton("check availability");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton.setBounds(98, 52, 85, 28);
		panel.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("Not Available");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 10));
		lblNewLabel_3.setBounds(187, 60, 75, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("EMAIL");
		lblNewLabel.setBounds(10, 10, 60, 34);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		MechanicInterface ab=new MechanicInterface();
		
		lblNewLabel_4 = new JLabel("Availaibe");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 10));
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setForeground(new Color(51, 255, 102));
		lblNewLabel_4.setBounds(48, 60, 54, 13);
		panel.add(lblNewLabel_4);
		lblNewLabel_3.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(20, 176, 311, 100);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		pw1 = new JPasswordField();
		pw1.setToolTipText("Password must be of length 8 and must contain a Special Character, an Uppercase letter and a lowecase letter");
		pw1.setBounds(145, 10, 145, 28);
		pw1.setEditable(false);
		panel_1.add(pw1);
		
		pw2 = new JPasswordField();
		pw2.setBounds(145, 48, 145, 28);
		pw2.setEditable(false);
		panel_1.add(pw2);
		
		nfld = new JTextField();
		
		lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1.setBounds(64, 16, 71, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("Account Created!");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_7.setBounds(233, 307, 100, 13);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
		JButton btnNewButton_2 = new JButton("Click To Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame=new LoginPage();
				frame.setVisible(true);
				dispose();	
			}
		});
		btnNewButton_2.setBounds(206, 330, 143, 28);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setVisible(false);
		
		
		
		lblNewLabel_2 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 54, 125, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("Pasword format not accepted");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(155, 77, 145, 18);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		btnNewButton_1 = new JButton("CREATE");
		btnNewButton_1.setBounds(389, 206, 110, 39);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(pw1.getText().isEmpty()) && (validpw(pw1.getText())))
		     {
				if(pw1.getText().equals(pw2.getText())) {
					if(!nfld.getText().isEmpty()) {
						if(!phfld.getText().isEmpty()) {
							lblNewLabel_6.setVisible(false);
							lblNewLabel_7.setVisible(true);
							btnNewButton_2.setVisible(true);
							lblNewLabel_8.setVisible(false);
							String nepw=pw1.getText();
							String neus=newuser.getText();
							ab.addMechanic(neus, nepw,nfld.getText(),phfld.getText());
							pw1.setEditable(false);
							pw2.setEditable(false);
							newuser.setEditable(false);
							nfld.setEditable(false);
							phfld.setEditable(false);
							lcrqd.setVisible(false);
							phrqd.setVisible(false);
						}
						else {
							phrqd.setVisible(false);							
						}
					}
					else {
						lcrqd.setVisible(false);
					}
				}
				else {
					lblNewLabel_6.setVisible(true);
					lblNewLabel_8.setVisible(false);
				}
		     }
			else {
				lblNewLabel_8.setVisible(true);
			}
			}
			});
		
		btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame=new LoginPage();
				frame.setVisible(true);
				dispose();	
			}
		});
		btnNewButton_3.setBounds(20, 335, 57, 21);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_6 = new JLabel("Passwords not matched");
		lblNewLabel_6.setBounds(389, 255, 117, 12);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(51, 102, 204));
		panel_2.setBounds(25, 10, 495, 46);
		contentPane.add(panel_2);
		
		lblNewLabel_5 = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_5.setBounds(41, 10, 426, 26);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(285, 66, 250, 46);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel ntx = new JLabel("NAME");
		ntx.setFont(new Font("Segoe UI", Font.BOLD, 11));
		ntx.setBounds(38, 15, 52, 13);
		panel_3.add(ntx);
		
		lcrqd = new JLabel("Required");
		lcrqd.setForeground(Color.RED);
		lcrqd.setBounds(10, 0, 52, 13);
		panel_3.add(lcrqd);
		
		
		nfld.setBounds(100, 10, 140, 25);
		panel_3.add(nfld);
		nfld.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(285, 114, 250, 52);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		phfld = new JTextField();
		phfld.setBounds(99, 10, 141, 25);
		panel_4.add(phfld);
		phfld.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("PHONE NO.");
		lblNewLabel_10.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_10.setBounds(10, 15, 63, 13);
		panel_4.add(lblNewLabel_10);
		
		phrqd = new JLabel("Required");
		phrqd.setForeground(Color.RED);
		phrqd.setBounds(188, 39, 52, 13);
		panel_4.add(phrqd);
		lblNewLabel_6.setVisible(false);
		
		lcrqd.setVisible(false);
		phrqd.setVisible(false);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt=newuser.getText();
				if (!ab.newUserCheck(txt)) {
					lblNewLabel_3.setVisible(false);
					lblNewLabel_4.setVisible(true);
					pw1.setEditable(true);
					pw2.setEditable(true);
					
				}
				else {
					lblNewLabel_4.setVisible(false);
					lblNewLabel_3.setVisible(true);
					pw1.setEditable(false);
					pw2.setEditable(false);
					
				}
				
			}
		});
	}
}
