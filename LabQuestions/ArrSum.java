public class ArrSum{
	public static void main(String[] args){
		int sum = 0;
		int[] arr = {1, 5, 6, 8, 5};
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum / arr.length);
	}
}