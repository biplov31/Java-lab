import java.util.Scanner; 

public class Book{
	String name, author;
	int publishYear;
		
	public static void main(String[] args){
		Book book1 = new Book();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of the book: ");
		book1.name = scan.nextLine();
		System.out.print("Enter the name of the author: ");
		book1.author = scan.nextLine();
		System.out.print("Enter the publish year: ");
		book1.publishYear = scan.nextInt();		
		
		System.out.println(book1.name + " was written by " + book1.author + " in year " + book1.publishYear);
	}
}
