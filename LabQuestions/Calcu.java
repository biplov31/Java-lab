import java.util.Scanner;

public class Calcu{
	
	static void display(int result){
		System.out.println("\nYour output is: " + result + "\n");
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);  
		
		while(true){
			System.out.println("\n<--- Calculator! --->\n");
			System.out.println("Enter the operands and operator of your choice: ");
			// only supports two operands and only works when the characters are separated by spaces
			int num1 = scan.nextInt();
			String op = scan.next();
			int num2 = scan.nextInt();
			
			switch(op){
				case "+":
					Calcu.display(num1 + num2);	
					break;
				case "-":
					Calcu.display(num1 - num2);	
					break;
				case "*":
					Calcu.display(num1 * num2);	
					break;		
				case "/":
					Calcu.display(num1 / num2);	
					break;
				default:
					System.out.println("Please enter a valid command.");
			}
			
			System.out.print("Press 0 to exit and 1 to continue: ");
			int exit = scan.nextInt();
			if(exit == 0){
				break;
			} else {
				continue;
			}
		}
	
	}
}