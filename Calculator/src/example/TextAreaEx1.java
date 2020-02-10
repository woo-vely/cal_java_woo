package example;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextAreaEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField t = new JTextField();
		JLabel label = new JLabel("ют╥б");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		
		JButton btn = new JButton("click");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(t.getText());
			}
			
		});
		f.add(t, BorderLayout.CENTER);
		f.add(label, BorderLayout.NORTH);
		f.add(btn, BorderLayout.SOUTH);
		f.setVisible(true);
	}
}
