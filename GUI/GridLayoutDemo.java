import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo{
	public GridLayoutDemo(){
		JFrame frame = new JFrame("GridLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(new GridLayout(2, 2));
		frame.add(new Button("A"));
		frame.add(new Button("B"));
		frame.add(new Button("C"));
		frame.add(new Button("D"));
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new GridLayoutDemo();
	}
}