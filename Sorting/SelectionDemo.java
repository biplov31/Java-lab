public class SelectionDemo{
	public static void main(String[] args){
		int[] arr = {1, 5, 8, 2, 3, 4, 9, 5};
		for(int i=0; i<arr.length; i++){
			int min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[min]){
					int temp = arr[j];
					arr[j] = arr[min];
					arr[min] = temp;
					min = j;
				}
			}
		}
		 
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k]);
		}

	}
}