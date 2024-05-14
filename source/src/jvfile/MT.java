package ProjectIS216;

import java.awt.EventQueue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.util.ArrayList;


public class MT extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MT frame;
	private JPanel contentPane;
	ArrayList<Float> number = new ArrayList<>();
	float num1, num2, ans;
	String oldoperator = "";
	int counter = 0;
	String btnType = "";
	double memory = 0;
	boolean isEqualsPress = false;
	private JTextField txt1;
	private JTextField txtResult;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MT frame = new MT();
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
	public MT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(246, 241, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 107, 542, 260);
		contentPane.add(panel);
		
		JButton bMR = new JButton("MR");
		bMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str;
				str = String.valueOf(memory);
				txt1.setText(str);
		        txtResult.setText(str);
			}
		});
		
		JButton bMPlus = new JButton("BACK");
		bMPlus.setBackground(new Color(175, 211, 226));
		bMPlus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bMPlus.setForeground(new Color(20, 108, 148));
		bMPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MT().toFront();
				new MT().setState(java.awt.Frame.NORMAL);
			}
		});
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		panel.add(bMPlus);
		bMR.setBackground(new Color(175, 211, 226));
		bMR.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bMR.setForeground(new Color(20, 108, 148));
		panel.add(bMR);
		
		JButton bMC = new JButton("MC");
		bMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memory = 0;
				txtResult.setText("");
				txt1.setText("");
			}
		});
		bMC.setBackground(new Color(175, 211, 226));
		bMC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bMC.setForeground(new Color(20, 108, 148));
		panel.add(bMC);
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		
		JButton lg = new JButton("log");
		lg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				Logarit newFrame = new Logarit();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}

			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		lg.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lg.setForeground(new Color(20, 108, 148));
		lg.setBackground(new Color(175, 211, 226));
		panel.add(lg);
		
		JButton ln = new JButton("ln");
		ln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				Logarit newFrame = new Logarit();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}
	
			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		ln.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ln.setForeground(new Color(20, 108, 148));
		ln.setBackground(new Color(175, 211, 226));
		panel.add(ln);
		
		JButton btnNewButton_6 = new JButton("sin");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				LuongGiac newFrame = new LuongGiac();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}
	
			private void toBack() {
				// TODO Auto-generated method stub
					
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_6.setForeground(new Color(20, 108, 148));
		btnNewButton_6.setBackground(new Color(175, 211, 226));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("cos");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				LuongGiac newFrame = new LuongGiac();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}
	
			private void toBack() {
				// TODO Auto-generated method stub
					
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_7.setForeground(new Color(20, 108, 148));
		btnNewButton_7.setBackground(new Color(175, 211, 226));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("tan");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				LuongGiac newFrame = new LuongGiac();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}
	
			private void toBack() {
				// TODO Auto-generated method stub
					
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_8.setForeground(new Color(20, 108, 148));
		btnNewButton_8.setBackground(new Color(175, 211, 226));
		panel.add(btnNewButton_8);
		
		JButton badd = new JButton("+");
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOperatorClick(e);
			}
		});
		badd.setBackground(new Color(175, 211, 226));
		badd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		badd.setForeground(new Color(20, 108, 148));
		panel.add(badd);
		
		JButton bdel = new JButton("\u2190");
		bdel.setBackground(new Color(175, 211, 226));
		bdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = txtResult.getText();
				String str1 = str.substring(0, str.length() - 1);
				txtResult.setText(str1);
			}
		});
		bdel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bdel.setForeground(new Color(20, 108, 148));
		panel.add(bdel);
		bt7.setBackground(new Color(175, 211, 226));
		bt7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt7.setForeground(new Color(20, 108, 148));
		panel.add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt8.setBackground(new Color(175, 211, 226));
		bt8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt8.setForeground(new Color(20, 108, 148));
		panel.add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt9.setBackground(new Color(175, 211, 226));
		bt9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt9.setForeground(new Color(20, 108, 148));
		panel.add(bt9);
		
		JButton bminus = new JButton("\u2212");
		bminus.setBackground(new Color(175, 211, 226));
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOperatorClick(e);
			}
		});
		bminus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bminus.setForeground(new Color(20, 108, 148));
		panel.add(bminus);
		
		JButton bC = new JButton("C");
		bC.setBackground(new Color(175, 211, 226));
		bC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bC.setForeground(new Color(20, 108, 148));
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
				txt1.setText("");
				oldoperator = "";
				number.clear();
				isEqualsPress = false;
			}
		});
		panel.add(bC);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt4.setBackground(new Color(175, 211, 226));
		bt4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt4.setForeground(new Color(20, 108, 148));
		panel.add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt5.setBackground(new Color(175, 211, 226));
		bt5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt5.setForeground(new Color(20, 108, 148));
		panel.add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt6.setBackground(new Color(175, 211, 226));
		bt6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt6.setForeground(new Color(20, 108, 148));
		panel.add(bt6);
		
		JButton bmult = new JButton("\u00D7");
		bmult.setBackground(new Color(175, 211, 226));
		bmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOperatorClick(e);
			}
		});
		bmult.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bmult.setForeground(new Color(20, 108, 148));
		panel.add(bmult);
		
		JButton binv = new JButton("1/x");
		binv.setBackground(new Color(175, 211, 226));
		binv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double oldnum = Double.parseDouble(txtResult.getText());
				oldnum = 1 / oldnum;
				txtResult.setText("" + oldnum);
				btnType = "num";
				counter = 0;
			}
		});
		binv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		binv.setForeground(new Color(20, 108, 148));
		panel.add(binv);
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt1.setBackground(new Color(175, 211, 226));
		bt1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt1.setForeground(new Color(20, 108, 148));
		panel.add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt2.setBackground(new Color(175, 211, 226));
		bt2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt2.setForeground(new Color(20, 108, 148));
		panel.add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		
		
		bt3.setBackground(new Color(175, 211, 226));
		bt3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt3.setForeground(new Color(20, 108, 148));
		panel.add(bt3);
		
		JButton bdiv = new JButton("\u00F7");
		bdiv.setBackground(new Color(175, 211, 226));
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOperatorClick(e);
			}
		});
		bdiv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bdiv.setForeground(new Color(20, 108, 148));
		panel.add(bdiv);
		
		JButton bper = new JButton("%");
		bper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double oldnum = Double.parseDouble(txtResult.getText());
				oldnum = oldnum / 100;
				txtResult.setText("" + oldnum);
				btnType = "num";
				counter = 0;
			}
		});
		bper.setBackground(new Color(175, 211, 226));
		bper.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bper.setForeground(new Color(20, 108, 148));
		panel.add(bper);
		
		JButton bdot = new JButton(".");
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bdot.setBackground(new Color(175, 211, 226));
		bdot.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bdot.setForeground(new Color(20, 108, 148));
		panel.add(bdot);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNumberClick(e);
			}
		});
		bt0.setBackground(new Color(175, 211, 226));
		bt0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt0.setForeground(new Color(20, 108, 148));
		panel.add(bt0);
		
		JButton bsign = new JButton("\u00B1");
		bsign.setBackground(new Color(175, 211, 226));
		bsign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double oldnum = Double.parseDouble(txtResult.getText());
				oldnum = -oldnum;
				txtResult.setText("" + oldnum);
				btnType = "num";
				counter = 0;
			}
		});
		bsign.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bsign.setForeground(new Color(20, 108, 148));
		panel.add(bsign);
		
		JButton bequal = new JButton("=");
		bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOperatorClick(e);
			}
		});
		bequal.setBackground(new Color(175, 211, 226));
		bequal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bequal.setForeground(new Color(20, 108, 148));
		panel.add(bequal);
		
		JButton bsqrt = new JButton("\u221A");
		bsqrt.setBackground(new Color(175, 211, 226));
		bsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double oldnum = Double.parseDouble(txtResult.getText());
				oldnum = Math.sqrt(oldnum);
				txtResult.setText("" + oldnum);
				btnType = "num";
				counter = 0;
			}
		});
		bsqrt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bsqrt.setForeground(new Color(20, 108, 148));
		panel.add(bsqrt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(557, 107, 159, 260);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("PT bậc 1");
		btnNewButton_2.setToolTipText("Giải phương trình bậc 1");
		btnNewButton_2.setBounds(0, 0, 159, 52);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(175, 211, 226));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				PT1 newFrame = new PT1();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}

			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_2.setForeground(new Color(20, 108, 148));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton btnNewButton_1 = new JButton("PT bậc 2");
		btnNewButton_1.setToolTipText("Giải phương trình bậc 2");
		btnNewButton_1.setBounds(0, 52, 159, 52);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(175, 211, 226));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				PT2 newFrame = new PT2();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}

			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_1.setForeground(new Color(20, 108, 148));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton btnNewButton_3_1 = new JButton("PT bậc 3");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				PT3 newFrame = new PT3();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}
			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_3_1.setToolTipText("Giải phương trình bậc 3");
		btnNewButton_3_1.setBounds(0, 104, 159, 52);
		btnNewButton_3_1.setForeground(new Color(20, 108, 148));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3_1.setBackground(new Color(175, 211, 226));
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3 = new JButton("HPT 2 ẩn");
		btnNewButton_3.setToolTipText("Giải hệ phương trình 2 ẩn");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.toBack();
				HPT1 newFrame = new HPT1();
				newFrame.setVisible(true);
				frame.setVisible(true);
				newFrame.toFront();
			}

			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_3.setBounds(0, 156, 159, 52);
		btnNewButton_3.setBackground(new Color(175, 211, 226));
		btnNewButton_3.setForeground(new Color(20, 108, 148));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("HPT 3 ẩn");
		btnNewButton.setToolTipText("Giải hệ phương trình 3 ẩn");
		btnNewButton.setBounds(0, 208, 159, 52);
		panel_1.add(btnNewButton);
		btnNewButton.setBackground(new Color(175, 211, 226));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HPT3 newFrame = new HPT3();
			    newFrame.setVisible(true);
			    frame.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(20, 108, 148));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 706, 87);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txt1  = new JTextField(300);
		txt1.setForeground(new Color(20, 108, 148));
		txt1.setHorizontalAlignment(SwingConstants.LEFT);
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt1.setBorder(null);
		txt1.setBounds(0, 0, 706, 48);
		panel_2.add(txt1);
		
		txtResult = new JTextField();
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBorder(null);
		txtResult.setForeground(new Color(20, 108, 148));
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtResult.setBounds(0, 44, 706, 43);
		panel_2.add(txtResult);
		txtResult.setColumns(10);
	}
		private void btnNumberClick(java.awt.event.ActionEvent e) {
			if (btnType.equals("opr")) {
				txtResult.setText("");
			}
			String num = ((JButton)e.getSource()).getText();
			String oldnum = txtResult.getText();
			txtResult.setText(oldnum + num);
			btnType = "num";
			counter = 0;
		}
		
		private void btnOperatorClick(java.awt.event.ActionEvent e) {
			btnType = "opr";
			counter++;
			String opr = ((JButton)e.getSource()).getText();
			if (counter == 1) {
				String str = txt1.getText() + txtResult.getText() + opr;
				txt1.setText(str);
				number.add(Float.valueOf(txtResult.getText()));
				if (number.size() == 2) {
					num1 = number.get(0);
					num2 = number.get(1);
					number.clear();
					if (oldoperator.equals("+")) {
						ans = num1 + num2;
					} else if (oldoperator.equals("−")) {
						ans = num1 - num2;
					} else if (oldoperator.equals("×")) {
						ans = num1 * num2;
					} else if (oldoperator.equals("÷")) {
						ans = num1 / num2;
					}
					number.add(ans);
					txtResult.setText(ans + "");
				}
					oldoperator = opr;
					if (opr.equals("=")) {
						txt1.setText("");
						oldoperator = "";
						number.clear();
					}
				}
			else {
				String str = txt1.getText();
				String str1 = str.substring(0, str.length() - 1);
				txt1.setText(str1 + opr);
				oldoperator = opr;
			}
		}
}
