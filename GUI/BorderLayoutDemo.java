import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame{  // don't need to write frame.setTitle etc. when we have extended JFrame
	public BorderLayoutDemo(){
		
		setTitle("Border Layout Demo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton center = new JButton("Center");
		
		frame.add(north, BorderLayout.NORTH);	
		frame.add(south, BorderLayout.SOUTH);
		frame.add(east, BorderLayout.EAST);	
		frame.add(west, BorderLayout.WEST);
		frame.add(center, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new BorderLayoutDemo();
	}
}