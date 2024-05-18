package thucHanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class loi_a extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNhap;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loi_a frame = new loi_a();
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
	public loi_a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(loi_a.class.getResource("/thucHanh/HinhAnh/1_dog.png")));
		lblNewLabel.setBounds(101, 11, 190, 147);
		contentPane.add(lblNewLabel);
		
		
		textFieldNhap = new JTextField();
		textFieldNhap.setBounds(62, 169, 272, 20);
		contentPane.add(textFieldNhap);
		textFieldNhap.setColumns(10);

		JButton btnNewButton = new JButton("xem hình");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tt = textFieldNhap.getText();
				ImageIcon icon = new ImageIcon(tt);
				icon.setImage(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT ));
				lblNewLabel.setIcon(icon);
			}
		});
		btnNewButton.setBounds(157, 205, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("...");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser("src/ThucHanh/HinhAnh");
				jfc.setDialogTitle("Hãy chọn 1 tập tin hình ảnh để xem");
				jfc.setFileFilter(new FileNameExtensionFilter("Các tập tin *.jpg","jpg"));
				jfc.setFileFilter(new FileNameExtensionFilter("Các tập tin *.png","png"));
				int chon = jfc.showOpenDialog(rootPane);
				if(chon == JFileChooser.APPROVE_OPTION) {
					File file = jfc.getSelectedFile();
					textFieldNhap.setText(file.getAbsolutePath());
				}
			}
		});
		btnNewButton_1.setBounds(335, 168, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
