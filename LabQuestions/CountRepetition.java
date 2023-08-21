import java.util.Scanner;
public class CountRepetition {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = {6, 9, 8, 8, 0, 2, 8, 2, 10, 23, 10, 0, 6, 6, 9};
		System.out.println("Enter the number you want to search.");
		int num = scan.nextInt();
		int count = 0;
		
		for(int ele : arr){
			if(ele == num){
				count++;
			}
		}
		
		System.out.println("Your number is repeated "+ count + " times.");
	}
}