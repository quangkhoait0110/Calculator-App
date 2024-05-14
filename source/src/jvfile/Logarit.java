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

public class Logarit extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField tr1;
	private JTextField tr2;
	private JTextField txtB;
	private JTextField tr3;
	private JTextField tr4;
	private double log, log1;
    private double mu, mu1;
    private static final double E = 2.718281828;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logarit frame = new Logarit();
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
	public Logarit() {
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
				    log = Double.parseDouble(txtA.getText());
				    if (log > 0) {
				        log = Math.log10(log);
				        tr1.setText(Double.toString(log));
				    } else {
				        tr1.setText("Error");
				    }
				} else {
				    tr1.setText("Nhập cơ số");
				}
				if (!txtA.getText().equals("")) {
				    log1 = Double.parseDouble(txtA.getText());
				    if (log1 > 0) {
				    	log1 = Math.log(log1) / Math.log(E);
				        tr2.setText(Double.toString(log1));
				    } else {
				        tr2.setText("Error");
				    }
				} else {
				    tr2.setText("Nhập cơ số");
				}
				if (!txtB.getText().equals("")) {
				    mu = Double.parseDouble(txtB.getText());
				    mu = Math.pow(10, mu);
				    tr3.setText(Double.toString(mu));
				} else {
				    tr3.setText("Nhập cơ số");
				}
				if (!txtB.getText().equals("")) {
				    mu1 = Double.parseDouble(txtB.getText());
				    mu1 = Math.pow(E, mu1);
				    tr4.setText(Double.toString(mu1));
				} else {
				    tr4.setText("Nhập cơ số");
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
				txtB.setText("");
				tr1.setText("");
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
		
		JLabel lblNewLabel = new JLabel("Logarit");
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
		
		JLabel lblNewLabel_1 = new JLabel("Nhập số b:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(15, 24, 108, 46);
		panel_1.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setForeground(new Color(20, 108, 148));
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setBounds(133, 25, 176, 46);
		panel_1.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Log10 b:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(31, 96, 94, 46);
		panel_1.add(lblNewLabel_1_1);
		
		tr1 = new JTextField();
		tr1.setForeground(new Color(20, 108, 148));
		tr1.setHorizontalAlignment(SwingConstants.LEFT);
		tr1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tr1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tr1.setColumns(10);
		tr1.setBounds(133, 96, 176, 46);
		panel_1.add(tr1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ln b:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_2.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(66, 166, 57, 46);
		panel_1.add(lblNewLabel_1_2);
		
		tr2 = new JTextField();
		tr2.setForeground(new Color(20, 108, 148));
		tr2.setHorizontalAlignment(SwingConstants.LEFT);
		tr2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tr2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tr2.setColumns(10);
		tr2.setBounds(133, 167, 176, 46);
		panel_1.add(tr2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nhập số mũ:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_3.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(340, 24, 146, 46);
		panel_1.add(lblNewLabel_1_3);
		
		txtB = new JTextField();
		txtB.setForeground(new Color(20, 108, 148));
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB.setColumns(10);
		txtB.setBounds(496, 25, 176, 46);
		panel_1.add(txtB);
		
		tr3 = new JTextField();
		tr3.setForeground(new Color(20, 108, 148));
		tr3.setHorizontalAlignment(SwingConstants.LEFT);
		tr3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tr3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tr3.setColumns(10);
		tr3.setBounds(496, 96, 176, 46);
		panel_1.add(tr3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("10^b:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(413, 96, 73, 46);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("e^b:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_2_1.setForeground(new Color(20, 108, 148));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(424, 166, 61, 46);
		panel_1.add(lblNewLabel_1_2_1);
		
		tr4 = new JTextField();
		tr4.setForeground(new Color(20, 108, 148));
		tr4.setHorizontalAlignment(SwingConstants.LEFT);
		tr4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tr4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tr4.setColumns(10);
		tr4.setBounds(496, 167, 176, 46);
		panel_1.add(tr4);
	}
	
}
