public class AccessModifier{
	private String name;
	protected void message(){
		System.out.println("This is kind of confidential.");
	}
	public void alsoMessage(){
		System.out.println("This is not confidential.");
	}
	
}

class Demo extends AccessModifier{
	public static void main(String[] args){
		Demo d1 = new Demo();
		d1.message();
		d1.alsoMessage();
		d1.name = "Maguna";
	}	
}

/* class DemoTwo{
	public static void main(String[] args){
		DemoTwo d2 = new DemoTwo();
		d2.alsoMessage();
	}	
} */




