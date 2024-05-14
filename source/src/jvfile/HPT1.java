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

public class HPT1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	private JTextField txtD;
	private JTextField txtE;
	private JTextField txtC;
	private JTextField txtF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HPT1 frame = new HPT1();
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
	public HPT1() {
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
				int a = 0, b = 0, c = 0, d = 0, e1 = 0, f = 0;
				
				String sa = txtA.getText();
				try {
					a = Integer.parseInt(sa);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtA.selectAll();
					txtA.requestFocus();
					return;
				}

				String sb = txtB.getText();
				try {
					b = Integer.parseInt(sb);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtB.selectAll();
					txtB.requestFocus();
					return;
				}
				String sc = txtC.getText();
				try {
					c = Integer.parseInt(sc);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtC.selectAll();
					txtC.requestFocus();
					return;
				}
				String sd = txtD.getText();
				try {
					d = Integer.parseInt(sd);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtD.selectAll();
					txtD.requestFocus();
					return;
				}
				String se = txtE.getText();
				try {
					e1 = Integer.parseInt(se);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtE.selectAll();
					txtE.requestFocus();
					return;
				}
				String sf = txtF.getText();
				try {
					f = Integer.parseInt(sf);
				}
				catch(Exception ex) {
					String kq = "Nhập sai định dạng!!!"; 
					txtKQ.setText(kq);
					txtF.selectAll();
					txtF.requestFocus();
					return;
				}
				
				String kq1 = null;

				HePT_1 engine = new HePT_1(a, b, c, d, e1, f);

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
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtD.setText("");
				txtE.setText("");
				txtF.setText("");
				txtKQ.setText("");
				txtA.requestFocus();
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
		
		JLabel lblNewLabel = new JLabel("Giải hệ phương trình 2 ẩn");
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
		lblNewLabel_1.setBounds(10, 20, 230, 34);
		panel_1.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.TRAILING);
		txtA.setForeground(new Color(20, 108, 148));
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setBounds(250, 20, 50, 34);
		panel_1.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("x +");
		lblNewLabel_2.setForeground(new Color(20, 108, 148));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(303, 20, 41, 34);
		panel_1.add(lblNewLabel_2);
		
		txtB = new JTextField();
		txtB.setHorizontalAlignment(SwingConstants.TRAILING);
		txtB.setForeground(new Color(20, 108, 148));
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB.setBounds(346, 20, 50, 34);
		panel_1.add(txtB);
		txtB.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả:");
		lblNewLabel_4.setForeground(new Color(20, 108, 148));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 90, 131, 25);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 211, 226));
		panel_2.setBounds(10, 116, 686, 107);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtKQ = new JTextField();
		txtKQ.setForeground(new Color(20, 108, 148));
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtKQ.setBounds(6, 10, 670, 87);
		panel_2.add(txtKQ);
		txtKQ.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("y =");
		lblNewLabel_5.setForeground(new Color(0, 102, 153));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(402, 20, 41, 34);
		panel_1.add(lblNewLabel_5);
		
		txtD = new JTextField();
		txtD.setHorizontalAlignment(SwingConstants.TRAILING);
		txtD.setForeground(new Color(20, 108, 148));
		txtD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtD.setColumns(10);
		txtD.setBounds(250, 62, 50, 34);
		panel_1.add(txtD);
		
		JLabel lblNewLabel_2_1 = new JLabel("x +");
		lblNewLabel_2_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(303, 62, 41, 34);
		panel_1.add(lblNewLabel_2_1);
		
		txtE = new JTextField();
		txtE.setHorizontalAlignment(SwingConstants.TRAILING);
		txtE.setForeground(new Color(20, 108, 148));
		txtE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtE.setColumns(10);
		txtE.setBounds(346, 62, 50, 34);
		panel_1.add(txtE);
		
		JLabel lblNewLabel_5_1 = new JLabel("y =");
		lblNewLabel_5_1.setForeground(new Color(0, 102, 153));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5_1.setBounds(402, 62, 41, 34);
		panel_1.add(lblNewLabel_5_1);
		
		txtC = new JTextField();
		txtC.setHorizontalAlignment(SwingConstants.TRAILING);
		txtC.setForeground(new Color(20, 108, 148));
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtC.setColumns(10);
		txtC.setBounds(441, 20, 50, 34);
		panel_1.add(txtC);
		
		txtF = new JTextField();
		txtF.setHorizontalAlignment(SwingConstants.TRAILING);
		txtF.setForeground(new Color(20, 108, 148));
		txtF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtF.setColumns(10);
		txtF.setBounds(441, 62, 50, 34);
		panel_1.add(txtF);
	}
}