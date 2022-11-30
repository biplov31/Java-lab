import java.util.Scanner;

public class AddArrayElement{
	public static void main(String[] args){
		int[] arr = {1, 4, 8, 9, 4, 6};
		int[] arr2 = new int[arr.length + 1];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the index to add an element at: ");
		int idx = scan.nextInt();
		System.out.print("Enter the number you want to add: ");
		int num = scan.nextInt();
				
		for(int i=0; i<arr.length; i++){
			if (i == idx){
				arr2[idx] = num;	
				arr2[idx + 1] = arr[idx];
			} else if(i < idx) {
				arr2[i] = arr[i];
			} else {
				arr2[i+1] = arr[i];
			}
		}
		
		for(int ele : arr2){
			System.out.println(ele);
		}
		
	}
}