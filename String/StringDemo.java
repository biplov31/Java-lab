public class StringDemo{
	public static void main(String[] args){
		String id = "12 34"; // gets compiled but throws error when executing
		String finalId = id.replace(" ", "");
		int i = Integer.parseInt(id);
		int j = 5;
		int output = i + j;
		System.out.println(output);
		
		String name = "radha";
		name.toUpperCase(); // since string is immutable name is still "radha"
		name = name.toUpperCase(); // since we explicitly overrode the initial value with the new value, name is now "RADHA"
		
		// to make a string mutable, two classes can be used StringBuffer and StringBuilder
		StringBuffer city = "Kathmandu"; // error
		StringBuffer city = new StringBuffer("Kathmandu");
		// StringBuffer has append() instead of concat()
		city.append(" ").append("Sahara");  // now city = "Kathmandu Sahara"
		
		
		char[] chars = name.toCharArray();
		for(char c: chars){
			System.out.println(c);
		}
		
		String collegeName = "Patan Multiple College";
		if(collegeName.containsIgnoreCase("multiple")){
			System.out.println("Good college.");
		}
	}
}

