package example;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UI_Btn {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JTextField t = new JTextField("");
		f.setSize(430, 500);
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
		b7.setBounds(10, 150, 90, 60);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.setText("7");
			}
		});
		f.add(b4);
		b4.setBounds(10, 220, 90, 60);
		//b4.addActionListener(new MyListener());
		f.add(b1);
		b1.setBounds(10, 290, 90, 60);
		f.add(bClear);
		bClear.setBounds(10, 360, 90, 60);
		
		f.add(b8);
		b8.setBounds(110, 150, 90, 60);
		f.add(b5);
		b5.setBounds(110, 220, 90, 60);
		f.add(b2);
		b2.setBounds(110, 290, 90, 60);
		f.add(b0);
		b0.setBounds(110, 360, 90, 60);
		
		f.add(b9);
		b9.setBounds(210, 150, 90, 60);
		f.add(b6);
		b6.setBounds(210, 220, 90, 60);
		f.add(b3);
		b3.setBounds(210, 290, 90, 60);
		f.add(bResult);
		bResult.setBounds(210, 360, 90, 60);
		
		f.add(bDiv);
		bDiv.setBounds(310, 150, 90, 60);
		f.add(bMul);
		bMul.setBounds(310, 220, 90, 60);
		f.add(bMinus);
		bMinus.setBounds(310, 290, 90, 60);
		f.add(bPlus);
		bPlus.setBounds(310, 360, 90, 60);
		
		
		t.setBounds(10,30,390,80);
		f.add(t);
		
		f.add(t, BorderLayout.NORTH);
		f.setVisible(true);
	}
}
