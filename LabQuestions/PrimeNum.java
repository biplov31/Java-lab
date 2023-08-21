import java.util.Scanner;
public class PrimeNum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = scan.nextInt();
		System.out.print("Enter second number: ");
		int n2 = scan.nextInt();
		int sum = 0;
		
		for(int i=n1+1; i<n2; i++){
			boolean flag = true;
			for(int j=2; j<i; j++){
				if(i % j == 0){
					flag = false;
					break;
				} 
			}
			if(flag == true){
				System.out.print(i + "\t");
				sum += i;
			}	
		}
		System.out.println("Sum = " + sum);
	}
}