package example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BtnAction {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		
		JTextField t = new JTextField("");
		t.setBounds(10,10,100,30);
		f.add(t);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		
		f.add(btn1);
		f.add(btn2);

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("click");
				t.setText("1");
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("click");
				t.setText("2");
			}
		});
	}
}
