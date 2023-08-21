import javax.swing.*;

public class HelloWorld{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Hello World");
		frame.setLayout(null);
		
		JLabel helloLabel = new JLabel();
		helloLabel.setText("Hello from Aadim College");
		helloLabel.setBounds(50, 50, 500, 20);
		
		frame.add(helloLabel);  // need to add element to the frame because frame is what gets displayed
	}
}