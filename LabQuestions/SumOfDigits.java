import java.util.Scanner;

public class SumOfDigits{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number of your choice: ");
		int num = scan.nextInt();
		int sum = 0;
		
		while(num != 0){
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Sum of the digits of the number = " + sum);
	}
}