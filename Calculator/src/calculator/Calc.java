package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame implements ActionListener{
	private JPanel displayPanel;
	private JPanel btnPanel;
	private JPanel debugPanel;
	
	private JTextField display;
	
	private JButton[] btn;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMulti;
	private JButton btnDiv;
	private JButton btnClear;
	private JButton btnResult;
	
	private JLabel prev;
	private JLabel operator;
	private JLabel flag;
	
	double op1, op2, result;
	
	public static void main(String[] args) {
		Calc calc = new Calc();
	}
	
	public Calc() {
		this.setSize(300,400);
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		displayPanel = new JPanel();
		btnPanel = new JPanel();
		debugPanel = new JPanel();
		
		displayPanel.setLayout(new FlowLayout());
		btnPanel.setLayout(new GridLayout(0,4,5,5));
		debugPanel.setLayout(new FlowLayout());
		
		display = new JTextField(11);
		display.setText("0");
		display.setHorizontalAlignment(JTextField.RIGHT);
		
		displayPanel.add(display);
		
		btn = new JButton[10];
		for(int i=0; i<10; i++) {
			btn[i] = new JButton(String.valueOf(i));
			btn[i].addActionListener(this);
		}
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnMulti = new JButton("*");
		btnDiv = new JButton("/");
		btnResult = new JButton("=");
		btnClear = new JButton("CE");
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMulti.addActionListener(this);
		btnDiv.addActionListener(this);
		btnResult.addActionListener(this);
		btnClear.addActionListener(this);
		
		for(int i=7; i<=9; i++) {
			btnPanel.add(btn[i]);
		}
		btnPanel.add(btnDiv);
		for(int i=4; i<=6; i++) {
			btnPanel.add(btn[i]);
		}
		btnPanel.add(btnMulti);
		for(int i=1; i<=3; i++) {
			btnPanel.add(btn[i]);
		}
		btnPanel.add(btnPlus);
		btnPanel.add(btnClear);
		btnPanel.add(btn[0]);
		btnPanel.add(btnResult);
		btnPanel.add(btnMinus);
		
		prev = new JLabel("");
		operator = new JLabel("");
		flag = new JLabel("");
		
		debugPanel.add(new JLabel("prev: "));
		debugPanel.add(prev);
		debugPanel.add(new JLabel("operator: "));
		debugPanel.add(operator);
		debugPanel.add(new JLabel("flag: "));
		debugPanel.add(flag);
		
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(btnPanel, BorderLayout.CENTER);
		this.add(debugPanel, BorderLayout.SOUTH);
		
		this.setVisible(true);
		//System.out.println(btn.length);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<btn.length; i++) {
			if(e.getSource() == btn[i]) {
				if(display.getText().equals("0")) {
					display.setText(""+i);
				}else {
					if(operator.getText().equals("")) {
						display.setText(display.getText()+i);
					}else {
						if(flag.getText().equals("")) {
							display.setText(""+i);
							flag.setText("#");
						}else {
							display.setText(display.getText()+i);
						}
					}
				}
			}
		}
		
		if(e.getSource() == btnClear) {
			clearAll();
		}
		if(e.getSource() == btnPlus) {
			prev.setText(display.getText());
			operator.setText("+");
			flag.setText("");
		}
		if(e.getSource() == btnMinus) {
			prev.setText(display.getText());
			operator.setText("-");
			flag.setText("");
		}
		if(e.getSource() == btnMulti) {
			prev.setText(display.getText());
			operator.setText("*");
			flag.setText("");
		}
		if(e.getSource() == btnDiv) {
			prev.setText(display.getText());
			operator.setText("/");
			flag.setText("");
		}
		
		if(e.getSource() == btnResult) {
			op1 = Double.parseDouble(prev.getText());
			op2 = Double.parseDouble(display.getText());
			
			if(operator.getText().equals("+")) {
				result = op1+op2;
				display.setText(""+result);
			}
			if(operator.getText().equals("-")) {
				result = op1-op2;
				display.setText(""+result);
			}
			if(operator.getText().equals("*")) {
				result = op1*op2;
				display.setText(""+result);
			}
			if(operator.getText().equals("/")) {
				result = op1/op2;
				display.setText(""+result);
			}
		}
	}

	private void clearAll() {
		display.setText("0");
	}
}



















