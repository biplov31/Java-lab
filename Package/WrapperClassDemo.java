public class WrapperClassDemo{
	public static void main(String[] args){
		int num = 5;
		Integer num = 5;
		
		char c = 'a';
		Character gender = 'M';
		
		float price = 50.6F;
		int a = (int) price; // type casting
		float f = a; // we can directly convert int to float but we need typecasting for vice-versa
		Double balance = 9808980.908080;
		
		BigDecimal hugeBalance = new BigDecimal(34234234234.3424);
	}
}