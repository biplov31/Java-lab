public class BinarySearch{
	public static void main(String[] args){
		int[] arr = {1, 6, 9, 2, 0, 8, 4};
		int target = 6;
		
		int low = 0; 
		int high = arr.length - 1;
		while(low <= high){
			int middle = low + (high - low)/2;
			
			if(target < arr[middle]) {  // too high
				high = middle - 1;
				System.out.println("Too high.");
			} else if(target > arr[middle]) {  // too low
				low = middle + 1;
				System.out.println("Too low.");
			} else {  // just right
				System.out.println("Target located at index " + middle);
			}	
		}
		System.out.println("Target not found.");

	}
}