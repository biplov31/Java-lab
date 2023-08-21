import java.io.*;

// read data from newFile.txt and write it to newFile2.txt
public class FileWriterDemo {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream fis = new FileInputStream("newFile.txt");
		String dataToWrite = "";
		int i = 0;
		
		while((i = fis.read()) != -1){
			char c = (char)i;
			dataToWrite = dataToWrite.concat(String.valueOf(c));
		}
		fis.close();
		System.out.println(dataToWrite);
		System.out.println("Reading finished.");
		System.out.println("Writing started.");
		
		FileWriter fw = new FileWriter("newFile2.txt");
	}
}

import java.io.*;

public class FileCopy {
  public static void main(String[] args) throws IOException {
    FileInputStream source = new FileInputStream("input.txt");
    FileOutputStream destination = new FileOutputStream("output.txt");
	
	int c;
	while ((c = source.read()) != -1) {
		destination.write(c);
	}
	source.close();
	destination.close();
  }
}
