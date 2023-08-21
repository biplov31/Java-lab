/* import java.util.Scanner;

public class SelectEvenNum{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);  
		System.out.println("Enter the two numbers: ");
		int n1 = scan.nextInt();
		int n = n1 + 1;
		int n2 = scan.nextInt();
		
		while(n < n2){			
			if(n % 2 == 0){
				System.out.print(n + "\t");
			} 
			n++;
		}
	}
} */

public class SelectEvenNum{
	public static void main(String[] args){
		int sum = 0;
		for(int i=2; i<10; i++){
			sum = (i % 2 == 0) ? sum+i : return;
		}
		System.out.println("Sum = " + sum);
	}
}