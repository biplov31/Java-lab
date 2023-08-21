public class InsertionDemo {
	public static void main(String[] args){
		int[] arr = {1, 5, 8, 2, 3, 4, 9, 5};
		
		for(int i=0; i<arr.length; i++){
			for(int j=i; j>0; j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k] + "\t");
		}
	}
}