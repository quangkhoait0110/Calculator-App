package ProjectIS216;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HPT3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA1;
	private JTextField txtB1;
	private JTextField txtKQ;
	private JTextField txtA2;
	private JTextField txtB2;
	private JTextField txtC1;
	private JTextField txtC2;
	private JTextField txtD1;
	private JTextField txtD2;
	private JTextField txtA3;
	private JTextField txtB3;
	private JTextField txtC3;
	private JTextField txtD3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HPT3 frame = new HPT3();
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
	public HPT3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(246, 241, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 289, 706, 78);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		Button Giải = new Button("Giải");
		Giải.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a1 = 0, b1 = 0, c1 = 0, d1 = 0, a2 = 0, b2 = 0, c2 = 0, d2 = 0, a3 = 0, b3 = 0, c3 = 0, d3 = 0;
				
				String sa1 = txtA1.getText();
				try {
					a1 = Integer.parseInt(sa1);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtA1.selectAll();
					txtA1.requestFocus();
					return;
				}

				String sb1 = txtB1.getText();
				try {
					b1 = Integer.parseInt(sb1);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtB1.selectAll();
					txtB1.requestFocus();
					return;
				}
				String sc1 = txtC1.getText();
				try {
					c1 = Integer.parseInt(sc1);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtC1.selectAll();
					txtC1.requestFocus();
					return;
				}
				String sd1 = txtD1.getText();
				try {
					d1 = Integer.parseInt(sd1);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtD1.selectAll();
					txtD1.requestFocus();
					return;
				}
				

				String sa2 = txtA2.getText();
				try {
					a2 = Integer.parseInt(sa2);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtA2.selectAll();
					txtA2.requestFocus();
					return;
				}

				String sb2 = txtB2.getText();
				try {
					b2 = Integer.parseInt(sb2);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtB2.selectAll();
					txtB2.requestFocus();
					return;
				}
				String sc2 = txtC2.getText();
				try {
					c2 = Integer.parseInt(sc2);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtC2.selectAll();
					txtC2.requestFocus();
					return;
				}
				String sd2 = txtD2.getText();
				try {
					d2 = Integer.parseInt(sd2);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtD2.selectAll();
					txtD2.requestFocus();
					return;
				}
				

				String sa3 = txtA3.getText();
				try {
					a3 = Integer.parseInt(sa3);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtA3.selectAll();
					txtA3.requestFocus();
					return;
				}

				String sb3 = txtB3.getText();
				try {
					b3 = Integer.parseInt(sb3);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtB3.selectAll();
					txtB3.requestFocus();
					return;
				}
				String sc3 = txtC3.getText();
				try {
					c3 = Integer.parseInt(sc3);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtC3.selectAll();
					txtC3.requestFocus();
					return;
				}
				String sd3 = txtD3.getText();
				try {
					d3 = Integer.parseInt(sd3);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtD3.selectAll();
					txtD3.requestFocus();
					return;
				}
				
				
			    String kq1 ="0";

				HePT_3 engine = new HePT_3(a1, b1, c1, d1, a2, b2, c2, d2, a3, b3, c3, d3);

			    kq1 = engine.compute();

				txtKQ.setText(kq1);
			}
		});
		Giải.setBackground(new Color(175, 211, 226));
		Giải.setForeground(new Color(20, 108, 148));
		Giải.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(Giải);
		
		Button Xóa = new Button("Xóa");
		Xóa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA1.setText("");
				txtB1.setText("");
				txtC1.setText("");
				txtD1.setText("");
				txtA2.setText("");
				txtB2.setText("");
				txtC2.setText("");
				txtD2.setText("");
				txtA3.setText("");
				txtB3.setText("");
				txtC3.setText("");
				txtD3.setText("");
				txtA1.requestFocus();
			}
		});
		Xóa.setForeground(new Color(20, 108, 148));
		Xóa.setBackground(new Color(175, 211, 226));
		Xóa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(Xóa);
		
		Button Thoát = new Button("Thoát");
		Thoát.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this.toBack();
				setVisible(false);
				new MT().toFront();
				new MT().setState(java.awt.Frame.NORMAL);
			}
		});
		Thoát.setForeground(new Color(20, 108, 148));
		Thoát.setBackground(new Color(175, 211, 226));
		Thoát.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(Thoát);
		
		JLabel lblNewLabel = new JLabel("Giải hệ phương trình 3 ẩn");
		lblNewLabel.setForeground(new Color(20, 108, 148));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 10, 706, 22);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 42, 706, 240);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Hệ phương trình có dạng:");
		lblNewLabel_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 20, 235, 34);
		panel_1.add(lblNewLabel_1);
		
		txtA1 = new JTextField();
		txtA1.setHorizontalAlignment(SwingConstants.TRAILING);
		txtA1.setForeground(new Color(20, 108, 148));
		txtA1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA1.setBounds(244, 19, 50, 34);
		panel_1.add(txtA1);
		txtA1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("x +");
		lblNewLabel_2.setForeground(new Color(20, 108, 148));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(299, 20, 41, 34);
		panel_1.add(lblNewLabel_2);
		
		txtB1 = new JTextField();
		txtB1.setHorizontalAlignment(SwingConstants.TRAILING);
		txtB1.setForeground(new Color(20, 108, 148));
		txtB1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB1.setBounds(340, 19, 50, 34);
		panel_1.add(txtB1);
		txtB1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả:");
		lblNewLabel_4.setForeground(new Color(20, 108, 148));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 115, 131, 25);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 211, 226));
		panel_2.setBounds(10, 149, 686, 85);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtKQ = new JTextField();
		txtKQ.setForeground(new Color(20, 108, 148));
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtKQ.setBounds(6, 10, 670, 65);
		panel_2.add(txtKQ);
		txtKQ.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("y +");
		lblNewLabel_5.setForeground(new Color(0, 102, 153));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(392, 20, 41, 34);
		panel_1.add(lblNewLabel_5);
		
		txtA2 = new JTextField();
		txtA2.setHorizontalAlignment(SwingConstants.TRAILING);
		txtA2.setForeground(new Color(20, 108, 148));
		txtA2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA2.setColumns(10);
		txtA2.setBounds(244, 61, 50, 34);
		panel_1.add(txtA2);
		
		JLabel lblNewLabel_2_1 = new JLabel("x +");
		lblNewLabel_2_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(299, 67, 41, 34);
		panel_1.add(lblNewLabel_2_1);
		
		txtB2 = new JTextField();
		txtB2.setHorizontalAlignment(SwingConstants.TRAILING);
		txtB2.setForeground(new Color(20, 108, 148));
		txtB2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB2.setColumns(10);
		txtB2.setBounds(340, 61, 50, 34);
		panel_1.add(txtB2);
		
		JLabel lblNewLabel_5_1 = new JLabel("y +");
		lblNewLabel_5_1.setForeground(new Color(0, 102, 153));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5_1.setBounds(392, 66, 41, 34);
		panel_1.add(lblNewLabel_5_1);
		
		txtC1 = new JTextField();
		txtC1.setHorizontalAlignment(SwingConstants.TRAILING);
		txtC1.setForeground(new Color(20, 108, 148));
		txtC1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtC1.setColumns(10);
		txtC1.setBounds(428, 20, 50, 34);
		panel_1.add(txtC1);
		
		txtC2 = new JTextField();
		txtC2.setHorizontalAlignment(SwingConstants.TRAILING);
		txtC2.setForeground(new Color(20, 108, 148));
		txtC2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtC2.setColumns(10);
		txtC2.setBounds(428, 62, 50, 34);
		panel_1.add(txtC2);
		
		txtD1 = new JTextField();
		txtD1.setHorizontalAlignment(SwingConstants.TRAILING);
		txtD1.setForeground(new Color(20, 108, 148));
		txtD1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtD1.setColumns(10);
		txtD1.setBounds(517, 19, 50, 34);
		panel_1.add(txtD1);
		
		txtD2 = new JTextField();
		txtD2.setHorizontalAlignment(SwingConstants.TRAILING);
		txtD2.setForeground(new Color(20, 108, 148));
		txtD2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtD2.setColumns(10);
		txtD2.setBounds(517, 61, 50, 34);
		panel_1.add(txtD2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("z =");
		lblNewLabel_5_1_1.setForeground(new Color(0, 102, 153));
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5_1_1.setBounds(482, 20, 33, 34);
		panel_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("z =");
		lblNewLabel_5_1_1_1.setForeground(new Color(0, 102, 153));
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5_1_1_1.setBounds(482, 67, 33, 34);
		panel_1.add(lblNewLabel_5_1_1_1);
		
		txtA3 = new JTextField();
		txtA3.setHorizontalAlignment(SwingConstants.TRAILING);
		txtA3.setForeground(new Color(20, 108, 148));
		txtA3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA3.setColumns(10);
		txtA3.setBounds(244, 106, 50, 34);
		panel_1.add(txtA3);
		
		txtB3 = new JTextField();
		txtB3.setHorizontalAlignment(SwingConstants.TRAILING);
		txtB3.setForeground(new Color(20, 108, 148));
		txtB3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB3.setColumns(10);
		txtB3.setBounds(340, 107, 50, 34);
		panel_1.add(txtB3);
		
		txtC3 = new JTextField();
		txtC3.setHorizontalAlignment(SwingConstants.TRAILING);
		txtC3.setForeground(new Color(20, 108, 148));
		txtC3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtC3.setColumns(10);
		txtC3.setBounds(428, 107, 50, 34);
		panel_1.add(txtC3);
		
		txtD3 = new JTextField();
		txtD3.setHorizontalAlignment(SwingConstants.TRAILING);
		txtD3.setForeground(new Color(20, 108, 148));
		txtD3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtD3.setColumns(10);
		txtD3.setBounds(517, 107, 50, 34);
		panel_1.add(txtD3);
		
		JLabel lblNewLabel_2_2 = new JLabel("x +");
		lblNewLabel_2_2.setForeground(new Color(20, 108, 148));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(299, 107, 41, 34);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("y +");
		lblNewLabel_5_1_2.setForeground(new Color(0, 102, 153));
		lblNewLabel_5_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5_1_2.setBounds(392, 107, 41, 34);
		panel_1.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("z =");
		lblNewLabel_5_1_1_1_1.setForeground(new Color(0, 102, 153));
		lblNewLabel_5_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5_1_1_1_1.setBounds(482, 107, 33, 34);
		panel_1.add(lblNewLabel_5_1_1_1_1);
	}
}
