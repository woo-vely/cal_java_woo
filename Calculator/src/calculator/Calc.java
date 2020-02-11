package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc implements ActionListener{
	JFrame f = new JFrame();
	JTextField display;
	JLabel prev, last, operator;
	JPanel displayPanel;
	JPanel btnPanel = new JPanel();
	JButton[] btn = new JButton[17];
	
	public Calc() {
		
		f.add(btnPanel);
		
		prev = new JLabel("");
		last = new JLabel("");
		operator = new JLabel("");
		
		displayPanel = new JPanel();
		displayPanel.setLayout(new FlowLayout());
		btnPanel.setLayout(new GridLayout(0,4));
		
		/*out = new JLabel("0", JLabel.RIGHT);
		out.setOpaque(true);
		f.add(out, BorderLayout.NORTH);*/
		
		display = new JTextField(11);
		display.setText("0");
		display.setHorizontalAlignment(JTextField.RIGHT);

		
		
		for(int i=0; i<10; i++) {
			btn[i] = new JButton(String.valueOf(i));
		}
		btn[11] = new JButton("/");
		btn[12] = new JButton("*");
		btn[13] = new JButton("+");
		btn[14] = new JButton("-");
		btn[15] = new JButton("CE");
		btn[16] = new JButton("=");
		
		
		
		for(int i=7; i<=9; i++) {
			btnPanel.add(btn[i]);
			btn[i].addActionListener(this);
		}
		btnPanel.add(btn[11]);
		btn[11].addActionListener(this);
		
		for(int i=4; i<=6; i++) {
			btnPanel.add(btn[i]);
			btn[i].addActionListener(this);
		}
		btnPanel.add(btn[12]);
		btn[12].addActionListener(this);
		
		for(int i=1; i<=3; i++) {
			btnPanel.add(btn[i]);
			btn[i].addActionListener(this);
		}
		btnPanel.add(btn[13]);
		btn[13].addActionListener(this);
		
		btnPanel.add(btn[15]);
		btn[15].addActionListener(this);
		btnPanel.add(btn[0]);
		btn[0].addActionListener(this);
		btnPanel.add(btn[16]);
		btn[16].addActionListener(this);
		btnPanel.add(btn[14]);
		btn[14].addActionListener(this);
		
	
		
		f.setSize(500,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Calc();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<10; i++) {
			if(e.getSource().equals(btn[i])) {
				display.setText(String.valueOf(i));
			}
			if(e.getSource().equals(btn[16])) {
				double op1, op2, result;
				op1 = Double.parseDouble(prev.getText());
				op2 = Double.parseDouble(last.getText());
				
				if(operator.getText().equals("+")) {
					result = op1+op2;
				}
				if(operator.getText().equals("-")) {
					result = op1-op2;
				}
				if(operator.getText().equals("*")) {
					result = op1*op2;
				}
				if(operator.getText().equals("/")) {
					result = op1/op2;
				}
			}
						
			/*else if(e.getSource().equals(btn[12])) {
				out.setText("*");
				operator();
			}else if(e.getSource().equals(btn[13])) {
				out.setText("+");
			}else if(e.getSource().equals(btn[14])) {
				out.setText("-");
			}else if(e.getSource().equals(btn[15])) {
				clearAll();
			}else if(e.getSource().equals(btn[16])) {
				out.setText("");
			}*/
		}
		
	}
	private void operator() {
		// TODO Auto-generated method stub
		
	}
	private void clearAll() {
		display.setText("0");
	}
}
