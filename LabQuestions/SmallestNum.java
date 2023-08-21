public class SmallestNum{
	public static void main(String[] args){
		int[] arr = {0, 1, 7, 9, 2};
		
		int small = arr[0];
		for (int i=0; i<arr.length; i++) {
			if(small > arr[i]) {
				small = arr[i];
			}
		}
		
		System.out.println("Smallest Number = " + small);
	}
}