import javax.swing.*;
import java.awt.*;

public class AtmUI {
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		frame.setTitle("WebATM");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLayout(null);
		
		JLabel logo = new JLabel();
		logo.setText("Web");
		frame.add(logo);
		
		JPanel cardPanel = new JPanel();
		cardPanel.setBackground(Color.gray);
		cardPanel.setBounds(250, 250, 500, 80);
		frame.add(cardPanel);
		
		JLabel cardInfo = new JLabel();
		cardInfo.setText("Please enter your card number: ");
		cardInfo.setBounds(0, 0, 100, 20);
		JTextField cardInfoField = new JTextField();
		cardInfoField.setBounds(260, 260, 100, 20);
		cardPanel.add(cardInfo);
		cardPanel.add(cardInfoField);

		frame.setVisible(true);
	}
}