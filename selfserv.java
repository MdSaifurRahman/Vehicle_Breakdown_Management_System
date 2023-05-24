package VehicleBreakdown;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.DropMode;

public class selfserv extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selfserv frame = new selfserv("fdfd","kilp");
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
	public selfserv(String uid, String pid) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		String str=null;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 204));
		panel.setBounds(25, 10, 495, 46);
		contentPane.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(195, 66, 325, 274);
		
		panel_2.setLayout(null);
		contentPane.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 325, 274);
		panel_2.add(scrollPane);
		
		JTextArea txtrToKeepYour = new JTextArea();
		txtrToKeepYour.setText((String) null);
		txtrToKeepYour.setTabSize(20);
		txtrToKeepYour.setRows(20);
		txtrToKeepYour.setLineWrap(true);
		txtrToKeepYour.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		txtrToKeepYour.setEditable(false);
		txtrToKeepYour.setColumns(20);
		scrollPane.setViewportView(txtrToKeepYour);
		
		
		JLabel lblNewLabel = new JLabel("TWO WHEELER BREAKDOWN MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(41, 10, 426, 26);
		panel.add(lblNewLabel);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 66, 160, 274);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		ButtonGroup d=new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("TIRE PUNCTURE FIXATION");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnNewRadioButton_5.setBounds(6, 190, 139, 35);
		panel_1.add(rdbtnNewRadioButton_5);
		d.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("CHANGE THE COOLANT");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnNewRadioButton_4.setBounds(6, 153, 139, 35);
		panel_1.add(rdbtnNewRadioButton_4);
		d.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("MAINTAIN TIRE PRESSURE");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnNewRadioButton_3.setBounds(6, 116, 139, 35);
		panel_1.add(rdbtnNewRadioButton_3);
		d.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CLEANING THE CHAIN");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnNewRadioButton_2.setBounds(6, 79, 139, 35);
		panel_1.add(rdbtnNewRadioButton_2);
		d.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ENGINE OIL CHANGE");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnNewRadioButton.setBounds(6, 42, 139, 35);
		panel_1.add(rdbtnNewRadioButton);
		d.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("AIR FILTER CLEANING");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnNewRadioButton_1.setBounds(6, 6, 139, 35);
		panel_1.add(rdbtnNewRadioButton_1);
		d.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Get Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=null;
				if(rdbtnNewRadioButton.isSelected()) {
					str="-Here are steps to change the engine oil of a motorbike:\r\n"
							+ "\r\n"
							+ " -Gather all the necessary tools and materials, including a new oil filter, a drain pan, a wrench, a funnel, and the recommended type and amount of oil for your motorbike.\r\n"
							+ " -Warm up your motorbike for a few minutes to help the oil flow more easily.\r\n"
							+ " -Locate the drain plug on the bottom of your motorbike's engine. Place the drain pan beneath it.\r\n"
							+ " -Use a wrench to loosen the drain plug and carefully remove it. Let the old oil drain into the pan.\r\n"
							+ " -While the oil is draining, remove the old oil filter using an oil filter wrench. Be careful not to spill any oil.\r\n"
							+ " -Clean the filter mounting surface with a clean rag.\r\n"
							+ " -Apply a thin layer of oil to the gasket of the new oil filter and install it, following the manufacturer's instructions.\r\n"
							+ " -Replace the drain plug and tighten it to the manufacturer's recommended torque specification.\r\n"
							+ " -Use a funnel to pour the recommended amount and type of new oil into the engine.\r\n"
							+ " -Start your motorbike and let it run for a few minutes to circulate the new oil. Check the oil level with the dipstick and add more if necessary.\r\n"
							+ " \r\n"
							+ " And that's it! Your motorbike's engine oil has been successfully changed. Don't forget to dispose of the old oil and filter properly.";
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
					str=" Here are steps to clean the air filter of a motorbike:\r\n"
							+ " \r\n"
							+ " -Turn off the motorbike and allow it to cool down before you begin.\r\n"
							+ " -Locate the air filter on your motorbike. It is usually found inside a rectangular or circular housing on the side of the engine.\r\n"
							+ " -Remove the air filter housing by unscrewing the bolts or clasps that hold it in place.\r\n"
							+ " -Take out the air filter from the housing.\r\n"
							+ " -Tap the air filter gently to remove loose debris.\r\n"
							+ " -Use compressed air or a soft-bristled brush to remove any remaining dirt or debris.\r\n"
							+ " -Inspect the filter for any signs of damage, such as holes or tears.\r\n"
							+ " -If the filter is damaged, replace it with a new one.\r\n"
							+ " -If the filter is not damaged, clean it by soaking it in warm soapy water for 10-15 minutes.\r\n"
							+ " -Rinse the filter thoroughly with clean water and allow it to air dry completely before reinstalling it back into the air filter housing.\r\n"
							+ " \r\n"
							+ " Remember to follow the manufacturer's recommendations for cleaning and replacing your motorbike's air filter.";
				}
				else if(rdbtnNewRadioButton_2.isSelected()) {
					str=" -Tools needed: Chain Cleaner and Chain Lube (these are two separate things), an old brush, tools to remove screws\r\n"
							+ " -Complexity: Moderate\r\n"
							+ " -Steps:\r\n"
							+ " Put bike in neutral, put it on centre stand\r\n"
							+ " Remove chain housing cover. Process may vary depending on bike. You might have to remove some other parts nearby to be able to remove this part\r\n"
							+ " Spray chain cleaning fluid. You can use commercially available ones (costs about 250 Rs per bottle) or use kerosene, a cheap and very efficient cleaner)\r\n"
							+ " Remove large quantities of dirt, grease using a stick or brush or any tool\r\n"
							+ " Spray cleaning fluid on the gear and chain assembly, while rotating the wheel. Use an old brush to clean the setup further. Spray on the side, on the center. Similarly clean rear sprocket.\r\n"
							+ " Check play on the chain, It if it is too loose you've to tighten it, which is a separate process-bit effort intensive.\r\n"
							+ " Once clean, now spray chain lube.\r\n"
							+ " Chain and Chain Sprocket typically lasts 25000-30000 kms if well maintained. After that better to change it for safety, particularly if usage is heavy.";
				}
				else if(rdbtnNewRadioButton_3.isSelected()) {
					str=" To check a tire’s pressure, locate the valve stem on the inside of the wheel, remove the cap, and press an air pressure gauge onto the valve stem. Compare the pressure with what it ought to be—that information will be written on the sidewall of the tire. Use an air compressor (available at many gas stations) to fill the tire to the correct number of pounds per square inch (PSI). Let out some air if you over-inflate. Replace the valve stem cap when done. To see how your tread is doing, check the tire’s wear indicator—a little rubber knob that resides in the grooves of the tire. If the knob is at the same level of rubber that meets the road, it’s time for a tire replacement—a job for a professional mechanic.";
				}
				else if(rdbtnNewRadioButton_4.isSelected()) {
					str=" Here are steps to change the coolant on your motorcycle:\r\n"
							+ " \r\n"
							+ " -Make sure your motorcycle is cool and not running. You don't want to work on a hot engine.\r\n"
							+ " -Locate the coolant drain bolt, which is usually located at the bottom of the radiator or on the engine block.\r\n"
							+ " -Place a container under the drain bolt to catch the old coolant.\r\n"
							+ " -Loosen the drain bolt and let the old coolant drain out completely.\r\n"
							+ " -Tighten the drain bolt back up.\r\n"
							+ " -Locate the coolant fill cap, which is usually located on the radiator.\r\n"
							+ " -Remove the cap and pour in fresh coolant until it reaches the fill line.\r\n"
							+ " -Replace the cap securely.\r\n"
							+ " -Start the engine and let it run for a few minutes to circulate the new coolant throughout the system.\r\n"
							+ " -Check the coolant level again and add more as needed. And you're done!";
				}
				else if(rdbtnNewRadioButton_5.isSelected()) {
					str=" Here are steps to repair a tire puncture on a motorbike:\r\n"
							+ " \r\n"
							+ " -Locate the puncture: Look for any visible signs of a puncture such as a nail or screw sticking out of the tire or a visible hole in the tire. If you can't see anything, you can try spraying some soapy water on the tire to locate the puncture.\r\n"
							+ " -Remove the wheel: If the puncture is in the rear tire, you'll need to remove the wheel. Consult your bike's owner manual for specific instructions.\r\n"
							+ " -Remove the tire from the wheel: Use tire levers to pry the tire away from the rim.\r\n"
							+ " -Remove the inner tube: Once the tire is off, remove the inner tube from the tire.\r\n"
							+ " -Find the puncture in the inner tube: Inflate the inner tube slightly and listen for the sound of air escaping. Once you have located the puncture, mark it with a pen or marker.\r\n"
							+ " -Rough up the puncture area: Use sandpaper or a metal file to rough up the area around the puncture on the inner tube.\r\n"
							+ " -Apply rubber cement: Apply a thin layer of rubber cement around the puncture area.\r\n"
							+ " -Apply the patch: Peel off the backing of the patch and apply it to the puncture, pressing down firmly.\r\n"
							+ " -Reassemble the tire and wheel: Put the inner tube back inside the tire and reattach the tire to the wheel.\r\n"
							+ " -Inflate the tire: Use a tire pump to inflate the tire to the recommended pressure.\r\n"
							+ " \r\n"
							+ " Note: If you are unsure about your ability to repair a punctured tire or do not have the necessary tools or materials, it is best to take your bike to a professional mechanic.";
				}
				txtrToKeepYour.setText((String) str);
			}
		});
		btnNewButton.setBounds(16, 231, 129, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Userface fp=new Userface(uid,pid);
				fp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(25, 335, 61, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		
		
		
		
		
	}
}
