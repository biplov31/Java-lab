public class Marker{
	// String name; // HellonullWorld
	String name = "";  // HelloWorld
	Marker m;
	public static void main(String[] args){
		// Marker m;
		// System.out.println(m);  
		Marker marker = new Marker();  // we need to call print() through the object
		// print();  // error because we cannot call a non-static method print() from a static method main
		
		String output = marker.getOutput();
		System.out.println(output); // Hello
		
		// String output2 = marker.print(); // does not work because print() does not return anything
		// void output2 = marker.print(); // Illegal
		
		String output3 = marker.print2();
		System.out.println(output3);  // Testing
		
	}
	void print(){
		// System.out.println(m);
		// System.out.println("Hello" + name + "World");
	}
	String print2(){
		// return System.out.println("Testing");
		String output3 = "Testing";
		return output3;
	}
	String getOutput(){
		String output = "Hello";
		return output;
	}
	
	// inner class
	class Duster{
		private String color;
	}
}

// no return type - does not compile
// void return type - no return statement
// any other return type - needs return statement