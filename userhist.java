package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;

public class userhist extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userhist frame = new userhist("Hello","hello");
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
	public userhist(String uid, String pid) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 204));
		panel.setBounds(27, 10, 590, 46);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(83, 10, 426, 26);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Userface hj=new Userface(uid,pid);
				hj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 335, 70, 21);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(51, 102, 204), null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(27, 66, 590, 264);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		UserInterface ob=new UserInterface();
		Vector<Request> r = ob.history(uid);
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(51, 102, 204));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 28, 55, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MODEL");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(258, 28, 65, 13);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MECHANIC DETALS");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(333, 28, 135, 13);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CONTACT");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(93, 28, 65, 13);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("BRAND");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(182, 28, 55, 13);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_6 = new JLabel("ADDRESS");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setForeground(new Color(51, 102, 204));
		lblNewLabel_1_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_6.setBounds(497, 28, 55, 13);
		panel_1.add(lblNewLabel_1_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 51, 570, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 90, 570, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 129, 570, 2);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 170, 570, 2);
		panel_1.add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(10, 212, 570, 2);
		panel_1.add(separator_3_1);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setBounds(10, 252, 570, 2);
		panel_1.add(separator_3_2);
		
		
		int l=r.size();
		int k=0;
	
		
		JLabel labels1[]=new JLabel[l];
		JLabel labels2[]=new JLabel[l];
		JLabel labels3[]=new JLabel[l];
		JLabel labels4[]=new JLabel[l];
		JLabel labels5[]=new JLabel[l];
		JLabel labels6[]=new JLabel[l];
		JLabel labels7[]=new JLabel[l];
		
		int y=20;
		if(r!=null) {
			for(Request i:r) {
				String name,num,com,mod,add,mecn,mecnu;
				name=i.name;
				labels1[k] = new JLabel(name);
				num=i.number;
				labels2[k] = new JLabel(num);
				com=i.company;
				labels3[k] = new JLabel(com);
				mod=i.model;
				labels4[k] = new JLabel(mod);
				add=i.address;
				labels5[k] = new JLabel(add);
				mecn=i.mechanic;
				labels6[k] = new JLabel(mecn);
				mecnu=i.mechNumber;
				labels7[k] = new JLabel(mecnu);
				labels1[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels1[k].setForeground(new Color(0, 0, 0));
				labels1[k].setFont(new Font("Segoe UI", Font.BOLD, 12));
				labels1[k].setBounds(10, 38+y, 55, 20);
				panel_1.add(labels1[k]);
				labels2[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels2[k].setForeground(new Color(0, 0, 0));
				labels2[k].setFont(new Font("Segoe UI", Font.BOLD, 10));
				labels2[k].setBounds(93, 38+y, 60, 20);
				panel_1.add(labels2[k]);
				labels3[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels3[k].setForeground(new Color(0, 0, 0));
				labels3[k].setFont(new Font("Segoe UI", Font.BOLD, 12));
				labels3[k].setBounds(182, 38+y, 55, 20);
				panel_1.add(labels3[k]);
				labels4[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels4[k].setForeground(new Color(0, 0,0));
				labels4[k].setFont(new Font("Segoe UI", Font.BOLD, 12));
				labels4[k].setBounds(258, 38+y, 55, 20);
				panel_1.add(labels4[k]);
				labels5[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels5[k].setForeground(new Color(0, 0, 0));
				labels5[k].setFont(new Font("Segoe UI", Font.BOLD, 10));
				labels5[k].setBounds(497, 38+y, 75, 20);
				panel_1.add(labels5[k]);
				labels6[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels6[k].setForeground(new Color(0, 0, 0));
				labels6[k].setFont(new Font("Segoe UI", Font.BOLD, 12));
				labels6[k].setBounds(333, 38+y, 75, 20);
				panel_1.add(labels6[k]);
				labels7[k].setHorizontalAlignment(SwingConstants.LEFT);
				labels7[k].setForeground(new Color(0, 0, 0));
				labels7[k].setFont(new Font("Segoe UI", Font.BOLD, 10));
				labels7[k].setBounds(430, 38+y,65, 20);
				panel_1.add(labels7[k]);
				k++;
				y+=40;
				
				
			}
		}
	}
}
