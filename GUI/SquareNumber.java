import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SquareNumber {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Square Number");
		frame.setLayout(null);
		
		JLabel inputLabel = new JLabel();
		inputLabel.setText("Enter the number: ");
		inputLabel.setBounds(100, 100, 130, 30);
		frame.add(inputLabel);
		
		JTextField inputField = new JTextField();
		inputField.setBounds(100, 140, 90, 30);
		frame.add(inputField);
		
		JButton getResult = new JButton("Go");
		getResult.setBounds(200, 140, 60, 30);
		frame.add(getResult);
		
		JTextField resultField = new JTextField("Result = ");
		resultField.setBounds(100, 180, 160, 30);
		frame.add(resultField);
		
		getResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int num = Integer.parseInt(inputField.getText());
				resultField.setText("Result = " + num * num);
			}
		});
		
		frame.setVisible(true);
	}
}