package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Newrqst extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnm;
	private JTextField textFieldmdl;
	private JTextField textFieldphn;
	private JTextField txtHello;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newrqst frame = new Newrqst("fdfd","hfjfk");
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
	public Newrqst(String uid, String pid) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(51, 102, 204));
		panel_2.setBounds(24, 10, 495, 46);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_5 = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_5.setBounds(41, 10, 426, 26);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), new EtchedBorder(EtchedBorder.LOWERED, null, null)));
		panel.setBounds(24, 66, 495, 290);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NEW REQUEST");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(201, 10, 93, 13);
		panel.add(lblNewLabel);
		
		ButtonGroup bj=new ButtonGroup();
		
//		mnNewMenu.add(bj);
		
		textFieldnm = new JTextField();
		textFieldnm.setToolTipText("ENTER MODEL");
		textFieldnm.setBounds(104, 35, 100, 25);
		panel.add(textFieldnm);
		textFieldnm.setColumns(10);
		
		textFieldmdl = new JTextField();
		textFieldmdl.setBounds(324, 78, 100, 25);
		panel.add(textFieldmdl);
		textFieldmdl.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(37, 38, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MODEL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(269, 84, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CURRENT LOCATION");
		lblNewLabel_3.setBounds(37, 145, 167, 13);
		panel.add(lblNewLabel_3);
		
		textFieldphn = new JTextField();
		textFieldphn.setBounds(324, 35, 100, 25);
		panel.add(textFieldphn);
		textFieldphn.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PHONE NO.");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(226, 41, 88, 13);
		panel.add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(37, 168, 387, 57);
		panel.add(textArea);
		
		JLabel done = new JLabel("REQUEST SUBMITTED");
		done.setBounds(175, 235, 139, 25);
		panel.add(done);
		done.setVisible(false);
		
		txtHello = new JTextField();
		txtHello.setBackground(new Color(255, 255, 255));
		txtHello.setText("");
		txtHello.setColumns(10);
		txtHello.setBounds(57, 107, 100, 25);
		panel.add(txtHello);
		txtHello.setEditable(false);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(51, 102, 204));
		menuBar.setBounds(47, 75, 110, 22);
		panel.add(menuBar);
		String str=null;
		JMenu mnNewMenu = new JMenu("BRAND  ->");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setBackground(new Color(51, 102, 204));
		menuBar.add(mnNewMenu);
		
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("TVS");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="TVS";
				txtHello.setText(str);
				txtHello.setEditable(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("HONDA");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="HONDA";
				txtHello.setText(str);
				txtHello.setEditable(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("HERO");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="HERO";
				txtHello.setText(str);
				txtHello.setEditable(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("KAWASAKI");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="KAWASKI";
				txtHello.setText(str);
				txtHello.setEditable(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("SUZUKI");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="SUZUKI";
				txtHello.setText(str);
				txtHello.setEditable(false);
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("OTHER");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHello.setText("");
				txtHello.setEditable(true);				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JLabel lblfld = new JLabel("*REQUIRED FIELD");
		lblfld.setForeground(new Color(204, 0, 0));
		lblfld.setFont(new Font("Tahoma", Font.ITALIC, 8));
		lblfld.setBounds(269, 255, 80, 13);
		panel.add(lblfld);
		lblfld.setVisible(false);
		
		JLabel lblnm = new JLabel("*");
		lblnm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnm.setForeground(new Color(204, 0, 0));
		lblnm.setBounds(26, 38, 29, 13);
		panel.add(lblnm);
		lblnm.setVisible(false);
		
		JLabel lblphn = new JLabel("*");
		lblphn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblphn.setForeground(new Color(204, 0, 0));
		lblphn.setBounds(234, 41, 29, 13);
		panel.add(lblphn);
		lblphn.setVisible(false);
		
		JLabel lblmdl = new JLabel("*");
		lblmdl.setHorizontalAlignment(SwingConstants.RIGHT);
		lblmdl.setForeground(new Color(204, 0, 0));
		lblmdl.setBounds(252, 84, 29, 13);
		panel.add(lblmdl);
		lblmdl.setVisible(false);
		
		JLabel lblbnd = new JLabel("*");
		lblbnd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblbnd.setForeground(new Color(204, 0, 0));
		lblbnd.setBounds(26, 107, 29, 13);
		panel.add(lblbnd);
		lblbnd.setVisible(false);
		
		JLabel lblloc = new JLabel("*");
		lblloc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblloc.setForeground(new Color(204, 0, 0));
		lblloc.setBounds(8, 145, 29, 13);
		panel.add(lblloc);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldnm.getText().isEmpty()) {
					lblnm.setVisible(true);
					lblfld.setVisible(true);
				}
				else if(textFieldmdl.getText().isEmpty()) {
					lblmdl.setVisible(true);
					lblfld.setVisible(true);
				}
				else if(textFieldphn.getText().isEmpty()) {
					lblphn.setVisible(true);
					lblfld.setVisible(true);
				}
				else if(textArea.getText().isEmpty()) {
					lblloc.setVisible(true);
					lblfld.setVisible(true);
				}
				else if(txtHello.getText().isEmpty()) {
					lblbnd.setVisible(true);
					lblfld.setVisible(true);
				}
				else {
					String name,brand,model,location,phno;
					name=textFieldnm.getText();
					brand=txtHello.getText();
					model=textFieldmdl.getText();
					location=textArea.getText();
					phno=textFieldphn.getText();
					done.setVisible(true);
					textFieldnm.setEditable(false);
					txtHello.setEditable(false);
					textFieldmdl.setEditable(false);
					textArea.setEditable(false);
					textFieldphn.setEditable(false);
					lblnm.setVisible(false);
					lblfld.setVisible(false);
					lblloc.setVisible(false);
					lblbnd.setVisible(false);
					lblphn.setVisible(false);
					UserInterface ab=new UserInterface();
					ab.newRequest(uid, name, phno, brand, model, location);
					}
			}
		});
		btnNewButton.setBounds(359, 247, 100, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Userface fp=new Userface(uid,pid);
				fp.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.setBounds(8, 250, 62, 22);
		panel.add(btnNewButton_1);
		
		
		
		
		
		
	}
}
