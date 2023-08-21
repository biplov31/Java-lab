public class Child extends Parent{
	// private void sayHello(){}; // cannot reduce visibility of inherited method from default to private
	// public/protected void sayHello(){};  // no error - can increase visibility from default to public/protected (private < default < protected < public)
	void sayHello(){
		// super.sayHello();
		System.out.println("Hello from Child");  // method overriding: sayHello from parent is overridden in child class
	}
	
	
}