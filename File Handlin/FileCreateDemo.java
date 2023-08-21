import java.io.*;

public class FileCreateDemo{
	public static void main(String[] args){
		/* throws FileNotFoundException {
		FileOutputStream output = new FileOutputStream("hello.txt"); */
		
		try{
			System.out.println("Creating text file.");
			FileOutputStream output = new FileOutputStream("newFile.txt");
			
			String value = "Namaskar sathi ho.";
			byte[] bytes = value.getBytes();  // converting string value into byte
			
			// just to show the byte values in the console. Not necessary to write into the file.
			/* System.out.println("Printing byte value.");
			for(byte b: bytes){
				System.out.print(b);
			}
			System.out.println("\n");
			System.out.println("Printed byte values."); */
			
			output.write(bytes);
			
			// byte[] bytes = {65, 32, 97};
			// output.write(65);
			output.close();
			System.out.println("Txt file created successfully.");
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe) {  // nested catch
			ioe.printStackTrace();
		}	
	}
}