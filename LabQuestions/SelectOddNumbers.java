import java.util.Scanner;

public class SelectOddNumbers{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = scan.nextInt();
		System.out.print("Enter second number: ");
		int n2 = scan.nextInt();
		int n = n1 + 1;
		int sum = 0;
		
		while(n < n2){
			if(n % 2 != 0){
				System.out.print(n + "\t");
				sum += n;
			}
			n++;
		}
		System.out.println("Sum = " + sum);
	
	}

}	