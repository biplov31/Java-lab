import java.util.Scanner;

public class PrintSelectNum{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);  
		System.out.println("Enter the two numbers: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		while(n1 <= n2){
			System.out.print(n1 + "\t");
			n1++;
		}
	}
}