public class Wood{
	String build = "fiber";
	String feature = "insulator";
	public void use(){
		System.out.print("I am rigid and provide support.");
	}
}

class Foam extends Wood{
	String build = super.build;
	public void use(){
		System.out.println("I am soft and provide cushion.");
	}
}

class Duster extends Wood {
	String feature = super.feature;
	public void use(){
		super.use();
	}
}

class Main{
	public static void main(String[] args){
		Foam f1 = new Foam();
		System.out.println(f1.build);
		f1.use();
		Duster d1 = new Duster();
		d1.use();
	}
}