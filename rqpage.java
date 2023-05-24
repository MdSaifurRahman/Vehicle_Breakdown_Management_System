package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class rqpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rqpage frame = new rqpage("hello","uhweu");
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
	public rqpage(String uid,String pid) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 204));
		panel.setBounds(25, 10, 495, 46);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(41, 10, 426, 26);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(51, 102, 204), null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(23, 65, 495, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CUSTOMER DETAILS");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(51, 102, 204));
		lblNewLabel_1.setBounds(28, 5, 115, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BRAND");
		lblNewLabel_1_1.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(182, 5, 43, 16);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ADDRESS");
		lblNewLabel_1_2.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(384, 5, 54, 16);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("MODEL");
		lblNewLabel_1_1_1.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(288, 5, 42, 16);
		panel_1.add(lblNewLabel_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 30, 475, 15);
		panel_1.add(separator);
		
		
		MechanicInterface ob=new MechanicInterface();
		Vector<Service> s=ob.history(uid);
		int l=s.size();
		int k=0;
	
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 65, 475, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 99, 475, 2);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 135, 475, 2);
		panel_1.add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(10, 173, 475, 2);
		panel_1.add(separator_3_1);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setBounds(10, 210, 475, 2);
		panel_1.add(separator_3_2);
		
		JSeparator separator_3_3 = new JSeparator();
		separator_3_3.setBounds(10, 246, 475, 2);
		panel_1.add(separator_3_3);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mechface mk=new Mechface(uid,pid);
				mk.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(25, 336, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel labels1[]=new JLabel[l];
		JLabel labels2[]=new JLabel[l];
		JLabel labels3[]=new JLabel[l];
		JLabel labels4[]=new JLabel[l];
		JLabel labels5[]=new JLabel[l];
		
		int y=20;
		if(s!=null) {
			for(Service i:s) {
				String name,num,com,mod,add,mecn,mecnu;
				name=i.userName;
				labels1[k] = new JLabel(name);
				num=i.userNo;
				labels2[k] = new JLabel(num);
				com=i.company;
				labels3[k] = new JLabel(com);
				mod=i.model;
				labels4[k] = new JLabel(mod);
				add=i.address;
				labels5[k] = new JLabel(add);
				
				labels1[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels1[k].setForeground(new Color(0, 0, 0));
				labels1[k].setFont(new Font("Segoe UI", Font.BOLD, 13));
				labels1[k].setBounds(20, 10+y, 55, 20);
				panel_1.add(labels1[k]);
				labels2[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels2[k].setForeground(new Color(0, 0, 0));
				labels2[k].setFont(new Font("Segoe UI", Font.BOLD, 12));
				labels2[k].setBounds(95, 10+y, 60, 20);
				panel_1.add(labels2[k]);
				labels3[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels3[k].setForeground(new Color(0, 0, 0));
				labels3[k].setFont(new Font("Segoe UI", Font.BOLD, 13));
				labels3[k].setBounds(175, 10+y, 55, 20);
				panel_1.add(labels3[k]);
				labels4[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels4[k].setForeground(new Color(0, 0,0));
				labels4[k].setFont(new Font("Segoe UI", Font.BOLD, 13));
				labels4[k].setBounds(270, 10+y, 55, 20);
				panel_1.add(labels4[k]);
				labels5[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels5[k].setForeground(new Color(0, 0, 0));
				labels5[k].setFont(new Font("Segoe UI", Font.BOLD, 13));
				labels5[k].setBounds(350, 10+y, 75, 20);
				panel_1.add(labels5[k]);
				
				k++;
				y+=40;
				
				
			}
		}
	}
}
