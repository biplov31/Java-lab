public class PrintSelectSum{
	public static void main(String[] args){
		int n1 = 5;
		int n2 = 10;
		int sum = n1 + n2;
		while(n1 <= n2){
			sum += n1;
			n1++;
		}
		System.out.println(sum);

	}	
	
}	
