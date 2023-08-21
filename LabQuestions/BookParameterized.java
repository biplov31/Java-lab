public class BookParameterized{
	String title, theme;
	int pages;
	
	BookParameterized(String title, String theme, int pages){
		this.title = title;
		this.theme = theme;
		this.pages = pages;
	}
	
	public void display(){
		System.out.println(title + " is a " + pages + " pages long book about " + theme);
	}
	
	public static void main(String[] args){
		BookParameterized book1 = new BookParameterized("Ramayan", "love", 500);
		book1.display();
	}
}