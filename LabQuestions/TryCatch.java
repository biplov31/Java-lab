public class TryCatch{
	public static void main(String[] args){
		try{
			int arr[] = {9, 0, 1};
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Always be positive.");
		}
	}
}