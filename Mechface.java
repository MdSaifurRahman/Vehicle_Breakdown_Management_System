package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Button;

public class Mechface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mechface frame = new Mechface("fdsd","hdh");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param pid 
	 * @param uid 
	 */
	public Mechface(String uid, String pid) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 10, 495, 46);
		panel.setBackground(new Color(51, 102, 204));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(41, 10, 426, 26);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(25, 95, 237, 235);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_1.setBounds(72, 0, 102, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(uid);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(26, 29, 178, 30);
		panel_1.add(lblNewLabel_2);
		
		JTextArea txtrThisSystemIs = new JTextArea();
		txtrThisSystemIs.setText("This system is designed to give your\r\nbusiness a digital platform to boost\r\nyour business and also help the ones\r\nwho need you to reach you easily\r\n\r\nThanks for using the app.");
		txtrThisSystemIs.setEditable(false);
		txtrThisSystemIs.setBounds(0, 58, 237, 140);
		panel_1.add(txtrThisSystemIs);
		
		JButton btnNewButton_4 = new JButton("Feedback");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeedbackForm fb=new FeedbackForm(uid,pid,2);
				fb.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_4.setBackground(new Color(240, 240, 240));
		btnNewButton_4.setBounds(0, 208, 85, 21);
		panel_1.add(btnNewButton_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(51, 102, 204), null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(290, 95, 200, 235);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("CHECK REQUEST");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chkrq nj=new chkrq(uid,pid);
				nj.setVisible(true);
				AllotMechanic zz=new AllotMechanic();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton.setBounds(38, 35, 126, 39);
		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("VIEW HISTORY");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rqpage r=new rqpage(uid,pid);
				r.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(38, 100, 126, 39);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("LOG OUT");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage fame=new LoginPage();
				fame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(38, 169, 126, 39);
		panel_2.add(btnNewButton_3);
	}
}
