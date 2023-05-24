package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Vector;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chkrq extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chkrq frame = new chkrq("e","ii");
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
	public chkrq(String uid,String pid) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MechanicInterface bj=new MechanicInterface();
		
		Service x=bj.currentjob(uid);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 204));
		panel.setBounds(23, 10, 495, 46);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(41, 10, 426, 26);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 69, 495, 236);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ASSIGNED TASK");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(182, 10, 135, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CUSTOMER NAME       :");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2.setBounds(34, 47, 135, 13);
		panel_1.add(lblNewLabel_2);
		
		if(x == null) {
			 Service n=new Service("Not Assigned, please stay in queue","Not Assigned, please stay in queue","Not Assigned, please stay in queue","Not Assigned, please stay in queue","Not Assigned, please stay in queue");
			 x=n;
		}
		JLabel nlab = new JLabel(x.userName);
		nlab.setFont(new Font("Segoe UI", Font.BOLD, 13));
		nlab.setBounds(179, 47, 235, 13);
		panel_1.add(nlab);
		
//		if(x.userNo ==null) x.userNo="Not Assigned, please stay in queue";
		JLabel numlab = new JLabel(x.userNo);
		numlab.setFont(new Font("Segoe UI", Font.BOLD, 13));
		numlab.setBounds(179, 70, 235, 13);
		panel_1.add(numlab);
		
		JLabel lblNewLabel_2_1 = new JLabel("CUSTOMER NUMBER :");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(34, 70, 135, 13);
		panel_1.add(lblNewLabel_2_1);
		
		
		JLabel brlab = new JLabel(x.company);
		brlab.setFont(new Font("Segoe UI", Font.BOLD, 13));
		brlab.setBounds(179, 93, 235, 13);
		panel_1.add(brlab);
		
		JLabel lblNewLabel_2_2 = new JLabel("BRAND                          :");
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(34, 93, 135, 13);
		panel_1.add(lblNewLabel_2_2);
		
//		if(x.model== null) x.model="Not Assigned, please stay in queue";
		JLabel modlab = new JLabel(x.model);
		modlab.setFont(new Font("Segoe UI", Font.BOLD, 13));
		modlab.setBounds(179, 116, 235, 13);
		panel_1.add(modlab);
		
		JLabel lblNewLabel_2_3 = new JLabel("MODEL                          :");
		lblNewLabel_2_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(34, 116, 135, 13);
		panel_1.add(lblNewLabel_2_3);
		
//		if(x.address == null) x.address="Not Assigned, please stay in queue";
		JLabel addlab = new JLabel(x.address);
		addlab.setFont(new Font("Segoe UI", Font.BOLD, 13));
		addlab.setBounds(179, 139, 235, 13);
		panel_1.add(addlab);
		
		JLabel lblNewLabel_2_4 = new JLabel("ADDRESS                      :");
		lblNewLabel_2_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(34, 139, 135, 13);
		panel_1.add(lblNewLabel_2_4);
		
		JButton btnNewButton = new JButton("MARK AS DONE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bj.endService(uid);
				//AllotMechanic gh=new AllotMechanic();
			}
		});
		btnNewButton.setBounds(182, 178, 135, 35);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mechface m1=new Mechface(uid,pid);
				m1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(23, 319, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
	}

}
