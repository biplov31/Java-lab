public class StudentInfo{
	String name;
	int age;
	String faculty;
	Boolean passedHighschool;
	
	StudentInfo(String name, int age, String degree, Boolean passedHighschool){
		this.name = name;
		this.age = age; 
		this.faculty = degree;
		this.passedHighschool = passedHighschool;
	}
	
	StudentInfo(String name, int age, String grade){
		this.name = name;
		this.age = age; 
		this.faculty = grade;
	}
	
	public static void main(String[] args){
		StudentInfo student1 = new StudentInfo("Ram", 20, "Humanities");
		System.out.println(student1.name + " is a " + student1.age + "-year-old student of " + student1.faculty + " department.");
	}
}