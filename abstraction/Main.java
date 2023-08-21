public class Main{
	public static void main(String[] args){
		Child child = new Child();
		// child.sayHello();
		
		// child.divide(10, 0);  // we get an error here to the statement below does not get executed. hence the need for exception handling.
		// System.out.println("Program executed successfully.")
		
		try{
			// code block that could cause an exception
			System.out.println("Dividing...");
			child.divide(10, 0);
			System.out.println("Divide is success.");
		} catch (Exception e){ // Excpeption class is the parent of all the exceptions that could occur. RuntimeException extends Exception. ArithmeticException extends RuntimeException
			// catch block is important so we know that an exception occurred. otherwise line 12 and 13 just don't execute without any explanation after error is thrown at line 12.
			e.printStackTrace();  
			System.out.println("Exception occurred.");
		} finally {
			// finally block is executed whether or not an exception occurs.
			System.out.println("Finally block executed.")
		}
		System.out.println("Program executed successfully.");
		
		// throw - single runtime exception. done inside a method block
		// throws - multiple compile time exceptions. done with method declaration
	}
}

/* class Parent{
	void sayHello(){
		System.out.println("Hello from parent.");
	}
}

class Child extends Parent{
	
} */