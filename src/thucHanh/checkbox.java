package thucHanh;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkbox extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox frame = new checkbox();
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
	public checkbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 34, 142, 115);
		contentPane.add(panel);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("12");
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("23");
		panel.add(chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(194, 34, 142, 120);
		contentPane.add(panel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("a");
		panel_1.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("b");
		panel_1.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soThich = "", mauThich="";
				for(Component com:panel.getComponents()) {
					JCheckBox jcb = (JCheckBox)com;
					if(jcb.isSelected()) 
						soThich += jcb.getText() + ", ";
				}
				for(Component com:panel_1.getComponents()) {
					JRadioButton jrb = (JRadioButton)com;
					if(jrb.isSelected()) {
						
						mauThich = jrb.getText();
						break;
					}
				}
				JOptionPane.showMessageDialog(null, "So la " + soThich + ", Mau thich " + mauThich);
			}
			
});
		btnNewButton.setBounds(147, 204, 89, 23);
		contentPane.add(btnNewButton);
	}
}
