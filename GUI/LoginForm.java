import javax.swing.*;

public class LoginForm{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Login Form");
		frame.setLayout(null);
		
		JLabel usernameLabel = new JLabel();
		usernameLabel.setText("Username:");
		usernameLabel.setBounds(50, 50, 100, 20);
		frame.add(usernameLabel);
		
		JTextField usernameField = new JTextField();
		usernameField.setBounds(50+100+5, 50, 150, 20);
		frame.add(usernameField);
		
		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Password:");
		passwordLabel.setBounds(50, 100, 100, 20);
		frame.add(passwordLabel);
		
		JPasswordField passwordField = new JPasswordField();		
		passwordField.setBounds(155, 100, 150, 20);		
		frame.add(passwordField);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(155, 150, 90, 40);
		frame.add(loginBtn);
		
		loginBtn.addActionListener(new ActionListener() {   // ActionListener is an interface given through anonymous function
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				System.out.println("Your username is: " + username);
				
				// String password = passwordField.getText();
				char[] password = passwordField.getPassword();
				String p = "";
				for(char c: password){
					p = p.concat(c+"");
				}
				System.out.println("Your password is: " + p);
				
				if(username.isEmpty() || p.isEmpty()){
					JOptionPane.showInternalMessageDialog(null, "Username and password required.", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, "Welcome " + username);
			}
		});
		
		frame.setVisible(true);
	}
}