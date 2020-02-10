package example;

import java.awt.Color;

import javax.swing.*;

public class Array_Btn extends JFrame{
	private JButton btn[];
	JFrame f = new JFrame();
	JLabel label = new JLabel();
	
	public static void main(String args[]){
		Array_Btn cal = new Array_Btn();
		cal.setTitle("Calculator");
		cal.setSize(300,300);
		cal.setVisible(true);
		cal.setResizable(false);
	}
	
	public void Array_Btn() {
		btn = new JButton[16];
		for(int i=0; i<10; i++) {
			btn[i] = new JButton(String.valueOf(i));
		}
		btn[10] = new JButton("/");
		btn[11] = new JButton("*");
		btn[12] = new JButton("+");
		btn[13] = new JButton("-");
		btn[14] = new JButton("CE");
		btn[15] = new JButton("=");
		
		for(int i=0; i<btn.length; i++) {
			if(i<10) {
				btn[i].setForeground(Color.black);
			}else if(i>=10 && i<14) {
				btn[i].setForeground(Color.orange);
			}else {
				btn[i].setForeground(Color.gray);
			}
		}
	}
	
}
