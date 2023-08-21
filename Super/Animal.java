class Animal {
	public String name;  
	/*
	if we declare this string as private it cannot be accessed outside of this class, so we should use a public getter to be able to access it from the child class
	public String getName(){
		return name;
	}
	and use super.getName() in the dog class instead of super.name
	*/
	public Animal(String name){
		this.name = name;
	}
	public void sayHello(){
		System.out.println("My name is " + name + " and I am an Animal.");
	}
}

class Dog extends Animal {
	private String breed;
	public Dog(String name, String breed) {
		// we can use the 'super' keyword to call the superclass constructor and pass values from the subclass to the superclass
		super(name);  // calling the constructor of the superclass to initialize the 'name' field of the 'Animal' class with the value of the 'name' argument that is passed to the 'Dog' class constructor
		this.breed = breed;
	}
	public void sayHello() {
		super.sayHello();
		System.out.println("My name is " + super.name + " and I am actually a " + breed);
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Tony", "Golden Retriever");
		dog.sayHello();
	}
}

