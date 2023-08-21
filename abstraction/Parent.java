public class Parent{
	// child class can access this method unless the method is private
	void sayHello(){
		System.out.println("Hello from parent.");
	}
	
	void divide(int a, int b){
		int c = a/b;
		System.out.println(c);
	}
}