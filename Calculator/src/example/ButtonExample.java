package example;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton bPlus = new JButton("+");
		JButton bMinus = new JButton("-");
		JButton bMul = new JButton("*");
		JButton bDiv = new JButton("/");
		JButton bResult = new JButton("=");
		JButton bClear = new JButton("CE");
		
		f.setLayout(null);
		
		//setBounds(오른쪽, 아래로, 버튼의 가로폭, 버튼의 세로폭)
		f.add(b7);
		b7.setBounds(10, 10, 100, 50);
		f.add(b4);
		b4.setBounds(10, 110, 100, 50);
		f.add(b1);
		b1.setBounds(10, 210, 100, 50);
		f.add(bClear);
		bClear.setBounds(10, 310, 100, 50);
		
		f.add(b8);
		b8.setBounds(110, 10, 100, 50);
		f.add(b5);
		b5.setBounds(110, 110, 100, 50);
		f.add(b2);
		b2.setBounds(110, 210, 100, 50);
		f.add(b0);
		b0.setBounds(110, 310, 100, 50);
		
		
		f.setVisible(true);
	}
	
}
