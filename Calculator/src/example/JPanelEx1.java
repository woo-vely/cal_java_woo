package example;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelEx1 extends JFrame{
	JFrame f = new JFrame();
	JButton[] btn = new JButton[17];
	JPanel p = new JPanel();
	
	public static void main(String[] args) {
		JPanelEx1 jp1 = new JPanelEx1();
	}
	public JPanelEx1() {
		f.add(p);
		p.setLayout(new GridLayout(4,4, 10, 60));
		
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
			p.add(btn[i]);
		}
		p.add(btn[11]);
		for(int i=4; i<=6; i++) {
			p.add(btn[i]);
		}
		p.add(btn[12]);
		for(int i=1; i<=3; i++) {
			p.add(btn[i]);
		}
		p.add(btn[13]);
		p.add(btn[15]);
		p.add(btn[0]);
		p.add(btn[16]);
		
		
		f.setSize(300,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
