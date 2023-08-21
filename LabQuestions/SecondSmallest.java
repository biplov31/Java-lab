import java.util.Scanner;

public class SecondSmallest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many number do you want to store in the array?");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers into the array: ");
		for(int i=0; i<n; i++){
			// arr[i] = args[i].parseInt();
			arr[i] = scan.nextInt();
		}
		
		for(int j=0; j<n-1; j++){
			for(int k=0; k<n-j-1; k++){
				if(arr[j] > arr[k]){
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}				
			}
		}
		System.out.println("Second smallest number = " + arr[1]);
	}
}