import java.util.Arrays;
import java.util.Scanner;

public class SecondGreatest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many number do you want to store in the array?");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers into the array: ");
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("The second greatest number = " + arr[arr.length-2]);
		
	}
}