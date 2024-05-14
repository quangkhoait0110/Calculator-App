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
import javax.swing.DropMode;

public class LuongGiac extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField tr1;
	private JTextField tr3;
	private JTextField tr4;
	private double r1, r2, r3, r4;
    private double d1, d2, d3, d4;
    private static final double E = 2.718281828;
    private JTextField tr2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LuongGiac frame = new LuongGiac();
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
	public LuongGiac() {
		getComponents();

    // Other methods and variables go here
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
				if (!txtA.getText().equals("")) {
				    r1 = Double.parseDouble(txtA.getText());
				    r1 = (Math.cos(Math.PI * r1 / 180)) / (Math.sin(Math.PI * r1 / 180));
				    tr4.setText(Double.toString(r1));
				    r2 = Double.parseDouble(txtA.getText());
				    r2 = (Math.sin(Math.PI * r2 / 180)) / (Math.cos(Math.PI * r2 / 180));
				    tr3.setText(Double.toString(r2));
				    r3 = Double.parseDouble(txtA.getText());
				    r3 = (Math.cos(Math.PI * r3 / 180));
				    tr2.setText(Double.toString(r3));
				    r4 = Double.parseDouble(txtA.getText());
				    r4 = (Math.sin(Math.PI * r4 / 180));
				    tr1.setText(Double.toString(r4));
				}
				else if (!txtB.getText().equals("")) {
				    d1 = Double.parseDouble(txtB.getText());
				    d1 = Math.sin(Math.PI * 180 / d1);
				    tr1.setText(Double.toString(d1));
				    d2 = Double.parseDouble(txtB.getText());
				    d2 = Math.cos(Math.PI * 180 / d2);
				    tr2.setText(Double.toString(d2));
				    d3 = Double.parseDouble(txtB.getText());
				    d3 = (Math.sin(Math.PI * 180 / d3)) / (Math.cos(Math.PI * 180 / d3));
				    tr3.setText(Double.toString(d3));
				    d4 = Double.parseDouble(txtB.getText());
				    d4 = (Math.cos(Math.PI * 180 / d4)) / (Math.sin(Math.PI * 180 / d4));
				    tr4.setText(Double.toString(d4));
				}
				else
				{
					tr1.setText("Chưa nhập dữ liệu");
					tr2.setText("Chưa nhập dữ liệu");
					tr3.setText("Chưa nhập dữ liệu");
					tr4.setText("Chưa nhập dữ liệu");
				}
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
				tr1.setText("");
				txtB.setText("");
				tr2.setText("");
				tr3.setText("");
				tr4.setText("");
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
		
		JLabel lblNewLabel = new JLabel("Lượng giác");
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
		
		JLabel lblNewLabel_1 = new JLabel("Nhập số:");
		lblNewLabel_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(15, 63, 94, 46);
		panel_1.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setForeground(new Color(20, 108, 148));
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setBounds(133, 64, 176, 46);
		panel_1.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập số:");
		lblNewLabel_1_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 177, 94, 46);
		panel_1.add(lblNewLabel_1_1);
		
		txtB = new JTextField();
		txtB.setForeground(new Color(20, 108, 148));
		txtB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtB.setColumns(10);
		txtB.setBounds(133, 179, 176, 46);
		panel_1.add(txtB);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sin:");
		lblNewLabel_1_3.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(419, 18, 45, 37);
		panel_1.add(lblNewLabel_1_3);
		
		tr1 = new JTextField();
		tr1.setForeground(new Color(20, 108, 148));
		tr1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tr1.setColumns(10);
		tr1.setBounds(474, 18, 176, 37);
		panel_1.add(tr1);
		
		tr3 = new JTextField();
		tr3.setForeground(new Color(20, 108, 148));
		tr3.setHorizontalAlignment(SwingConstants.LEFT);
		tr3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tr3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tr3.setColumns(10);
		tr3.setBounds(474, 128, 176, 37);
		panel_1.add(tr3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cos:");
		lblNewLabel_1_1_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(419, 73, 45, 37);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tan:");
		lblNewLabel_1_2_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(419, 128, 45, 37);
		panel_1.add(lblNewLabel_1_2_1);
		
		tr4 = new JTextField();
		tr4.setForeground(new Color(20, 108, 148));
		tr4.setHorizontalAlignment(SwingConstants.LEFT);
		tr4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tr4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tr4.setColumns(10);
		tr4.setBounds(474, 183, 176, 37);
		panel_1.add(tr4);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Cot:");
		lblNewLabel_1_2_1_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(419, 183, 45, 37);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		tr2 = new JTextField();
		tr2.setForeground(new Color(20, 108, 148));
		tr2.setHorizontalAlignment(SwingConstants.LEFT);
		tr2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tr2.setColumns(10);
		tr2.setBounds(474, 73, 176, 37);
		panel_1.add(tr2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Đổi Radian sang Độ");
		lblNewLabel_1_1_2.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(15, 119, 294, 46);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Đổi Độ sang Radian");
		lblNewLabel_1_1_2_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBounds(15, 10, 294, 46);
		panel_1.add(lblNewLabel_1_1_2_1);
	}
	
}
