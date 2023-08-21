import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame{
	JLabel title, resultField;
	JTextField t1, t2;
	JButton addBtn, subBtn, mulBtn, divBtn;
	Calculator(){
		// JFrame frame = new JFrame();
		// setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		title = new JLabel("Calculator");
		title.setBounds(60, 10, 300, 30);
		add(title);
		
		t1 = new JTextField(60);
		t2 = new JTextField(60);
		addBtn = new JButton("Add");
		subBtn = new JButton("Sub");
		mulBtn = new JButton("Mul");
		divBtn = new JButton("Div");
		
		t1.setBounds(100, 60, 120, 30);
		t2.setBounds(100, 100, 120, 30);
		
		addBtn.setBounds(100, 140, 60, 30);
		subBtn.setBounds(165, 140, 60, 30);
		mulBtn.setBounds(100, 185, 60, 30);
		divBtn.setBounds(165, 185, 60, 30);
		
		resultField = new JLabel("Result: ");
		resultField.setBounds(250, 80, 100, 30);
		add(resultField);
		
		add(t1);
		add(t2);
		add(addBtn);
		add(subBtn);
		add(mulBtn);
		add(divBtn);
		
		addBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				resultField.setText("= " + (num1 + num2));
			}
		});
		
		subBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				resultField.setText("= " + (num1 - num2));
			}
		});
	}
}

class SimpleCalculator {
	public static void main(String[] args){
		Calculator c = new Calculator();
		c.setBounds(500, 200, 400, 300);
		c.setVisible(true);
	}
}