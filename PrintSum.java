public class PrintSum{
	public static void main(String[] args){
		//String a = args[0];  // value taken from arrays 0th and 1st index from command line (java PrintSum 5 10 => a=5 and b=10)
		int a = Integer.parseInt(args[0]);
		//String b = args[1];
		int b = Integer.parseInt(args[1]);
		
		System.out.println(a+b);
	
	}
}