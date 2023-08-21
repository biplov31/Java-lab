import javax.swing.*;

public class Exercise extends JFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500, 300);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Exercise");
		frame.setLayout(null);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Name: ");
		nameLabel.setBounds(50, 50, 100, 20);
		frame.add(nameLabel);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(155, 50, 150, 20);
		frame.add(nameField);
		
		JLabel addressLabel = new JLabel();
		addressLabel.setText("Address: ");
		addressLabel.setBounds(50, 100, 100, 20);
		frame.add(addressLabel);
		
		JTextArea addressField = new JTextArea();
		JScrollPane scrlBar = new JScrollPane(addressField);
		scrlBar.setBounds(155, 100, 150, 150);
		frame.add(scrlBar);
		
		JButton displayBtn = new JButton("Display");
		displayBtn.setBounds(155, 300, 90, 30);
		frame.add(displayBtn);
		
		
		frame.setVisible(true);
	}
}