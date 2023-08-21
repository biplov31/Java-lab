import java.util.Scanner;
import java.util.Arrays;

public class Calculator{
	
	
	public static int[] getNums(String args[]){
		System.out.print("Enter the operands: ");
		// int num1 = Integer.parseInt(args[0]);
		// int num2 = Integer.parseInt(args[1]);
		int[] num = {};
		num[0] = Integer.parseInt(args[0]);
		num[1] = Integer.parseInt(args[1]);
		
		return num;
	} 
	static void add(int n1, int n2){
		System.out.println(n1 + n2);
	}
	static void subtract(int n1, int n2){
		System.out.println(n1 - n2);
	}
	static void multiply(int n1, int n2){
		System.out.println(n1 * n2);
	}
	static void divide(int n1, int n2){
		System.out.println(n1 / n2);
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n<--Calculator!-->\n");
		
		/* System.out.print("Enter the operands: ");
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]); */
		
		System.out.println("Enter 1 to perform addition: ");
		System.out.println("Enter 2 to perform subtraction: ");
		System.out.println("Enter 3 to perform multiplication: ");
		System.out.println("Enter 4 to perform division: ");
		System.out.print("Your choice is: ");
		String choice = scan.next(); 
		
		int[] arr = Calculator.getNums();
		int num1 = arr[0];
		int num2 = arr[1];
		
		switch(choice){
			case "1":
				Calculator.add(num1, num2);
				break;
			case "2":
				Calculator.subtract(num1, num2);
				break;
			case "3":
				Calculator.multiply(num1, num2);
				break;
			case "4":
				Calculator.divide(num1, num2);
				break;	
			default:
				System.out.println("Please enter a valid command."); 
		} 
	}
	
}