package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FeedbackForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedbackForm frame = new FeedbackForm("hef","hoieef",2);
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
	 * @param i 
	 */
	public FeedbackForm(String uid, String pid, int i) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 76, 452, 226);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Thanks for the Feedback!");
		lblNewLabel_2.setBounds(205, 317, 159, 13);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("Enter feedback for the admins");
		textArea.setBounds(10, 36, 432, 180);
		panel.add(textArea);
		
		JLabel lblNewLabel = new JLabel("FEEDBACK FORM");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(143, 10, 158, 13);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fbform=textArea.getText();
				Feedback bh=new Feedback(fbform,i);
				textArea.setEditable(false);
				lblNewLabel_2.setVisible(true);
			}
		});
		btnNewButton.setBounds(385, 307, 97, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i==1) {
				Userface fp=new Userface(uid,pid);
				fp.setVisible(true);
				dispose();
				}
				else {
					Mechface fp=new Mechface(uid,pid);
					fp.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButton_1.setBounds(45, 314, 60, 21);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 102, 204));
		panel_1.setBounds(24, 10, 495, 46);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1.setBounds(41, 10, 426, 26);
		panel_1.add(lblNewLabel_1);
		
		
	}

}
