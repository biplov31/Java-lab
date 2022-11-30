import java.util.Scanner;

public class DeleteElement{
	public static void main(String[] args){
		int[] arr = {1, 4, 8, 9, 4, 6};
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the index you want to delete an element at: ");
		int idx = scan.nextInt();
		int[] arr2 = new int[arr.length - 1];
		int j = 0;
		
		for(int i=0; i<arr.length; i++){
			if(i != idx){
				while(j < arr.length - 1){
					arr2[j] = arr[i];
					j++;
					break;
				}
			}		
		}
		
		for(int ele : arr2){
			System.out.println(ele);
		}
		
	}
}