package example;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayout1 {
	private final static int btnS = 5;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton[] btn = new JButton[btnS];
		GridBagConstraints[] gbc = new GridBagConstraints[btnS];
		GridBagLayout gbl = new GridBagLayout();
		panel.setLayout(gbl);
		
		for(int i=0; i<btnS; i++) {
			btn[i] = new JButton("btn"+i);
			gbc[i] = new GridBagConstraints();
		}
		
		gbc[0].gridx = 0;
		gbc[0].gridy = 1;
		panel.add(btn[0], gbc[0]);
		gbc[0].gridx = 0;
		gbc[0].gridy = 2;
		panel.add(btn[1], gbc[1]);
		gbc[0].gridx = 1;
		gbc[0].gridy = 0;
		panel.add(btn[2], gbc[2]);
		gbc[0].gridx = 2;
		gbc[0].gridy = 0;
		panel.add(btn[3], gbc[3]);
		gbc[0].gridx = 1;
		gbc[0].gridy = 1;
		panel.add(btn[4], gbc[4]);

		
		
		frame.setContentPane(panel);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
