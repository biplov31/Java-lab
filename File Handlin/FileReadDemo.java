import java.io.*;

public class FileReadDemo{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("newFile.txt");  // reading data from an existing file and printing it in console
		
		// to print the byte value of characters
		/* int value = fis.read();  // only reads the first character
		System.out.println("Byte value " + value); => 78
		System.out.println("Character is " + (char)value); => N */
		
		int i = 0;
		while((i = fis.read()) != -1){
			// System.out.println("Byte value is: " + i);
			System.out.print((char)i);
		}
		fis.close();
	}


	
}