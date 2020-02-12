package example;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UI_Btn implements ActionListener {
	JFrame f = new JFrame();
	JButton[] b = new JButton[17];
	JTextField t;
	JButton bPlus, bMinus, bMulti, bDiv, bResult, bClear;
	JLabel prev, last, operator;
	
	public UI_Btn() {
		prev = new JLabel("");
		last = new JLabel("");
		operator = new JLabel("");
		t = new JTextField(11);
		t.setText("0");
		t.setHorizontalAlignment(JTextField.RIGHT);
		f.setSize(430, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0; i<10; i++) {
			b[i] = new JButton(String.valueOf(i));
		}

		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMulti = new JButton("*");
		bDiv = new JButton("/");
		bResult = new JButton("=");
		bClear = new JButton("CE");
		
		f.setLayout(null);
		
		//setBounds(오른쪽, 아래로, 버튼의 가로폭, 버튼의 세로폭)
		f.add(b[7]);
		b[7].setBounds(10, 150, 90, 60);
		f.add(b[4]);
		b[4].setBounds(10, 220, 90, 60);
		//b4.addActionListener(new MyListener());
		f.add(b[1]);
		b[1].setBounds(10, 290, 90, 60);
		f.add(bClear);
		bClear.setBounds(10, 360, 90, 60);
		
		f.add(b[8]);
		b[8].setBounds(110, 150, 90, 60);
		f.add(b[5]);
		b[5].setBounds(110, 220, 90, 60);
		f.add(b[2]);
		b[2].setBounds(110, 290, 90, 60);
		f.add(b[0]);
		b[0].setBounds(110, 360, 90, 60);
		
		f.add(b[9]);
		b[9].setBounds(210, 150, 90, 60);
		f.add(b[6]);
		b[6].setBounds(210, 220, 90, 60);
		f.add(b[3]);
		b[3].setBounds(210, 290, 90, 60);
		f.add(bResult);
		bResult.setBounds(210, 360, 90, 60);
		
		f.add(bDiv);
		bDiv.setBounds(310, 150, 90, 60);
		f.add(bMulti);
		bMulti.setBounds(310, 220, 90, 60);
		f.add(bMinus);
		bMinus.setBounds(310, 290, 90, 60);
		f.add(bPlus);
		bPlus.setBounds(310, 360, 90, 60);
		
		for(int i=0; i<10; i++) {
			b[i].addActionListener(this);
		}
		bClear.addActionListener(this);
		
		t.setBounds(10,30,390,80);
		f.add(t);
		
		f.add(t, BorderLayout.NORTH);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		UI_Btn ui = new UI_Btn();
		
		
		/*b[7].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.setText("7");
			}
		});*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<10; i++) {
			if(e.getSource().equals(b[i])) {
				t.setText(String.valueOf(i));
			}
		}
		if(e.getSource().equals(bResult)) {
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
		if(e.getSource().equals(bClear)) {
			clearAll();
		}
		
	}

	private void clearAll() {
		t.setText("0");
	}
}
