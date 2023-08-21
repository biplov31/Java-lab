public class GreatestEle {
	public static void main(String[] args){
		int[] arr = {1, 4, 6, 9, 22, 19};
		int large;
		
		large = arr[0];
		System.out.println("Greatest number is ");
		for (int i=0; i<arr.length; i++) {
			if(large < arr[i]) {
				large = arr[i];
			}
		}
		System.out.println(large);
	}
}