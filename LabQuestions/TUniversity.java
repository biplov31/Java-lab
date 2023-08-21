public class TUniversity{
	String course = "BCA";
	int years = 4;
	public void task(){
		System.out.println("Design BCA.");
	}
}

class Aadim extends TUniversity{
	String course = super.course;
	int years = 6;
	public void task(){
		System.out.println("Teach BCA.");
	}
}

class Student extends Aadim{
	String course = super.course;
	int years = super.years;
	public void task(){
		System.out.println("Study BCA.");
	}
}

class Main{
	public static void main(String[] args){
		Student ram = new Student();
		System.out.println("Spend " + ram.years + " years contemplating " + ram.course);
		ram.task();
	}
}