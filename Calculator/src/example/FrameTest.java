package example;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("frame�� ����!!");
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());	//button�� ũ�⸦ �˸°� ����	��->��, ��->�Ʒ�
		
		JButton btn1 = new JButton("button1");
		JButton btn2 = new JButton("button2");
		JButton btn3 = new JButton("button3");
		JButton btn4 = new JButton("button4");
		JButton btn5 = new JButton("button5");

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		setVisible(true);
		this.setResizable(true);
	}
}

public class FrameTest{
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}

