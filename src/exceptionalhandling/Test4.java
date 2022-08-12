package exceptionalhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis =new FileInputStream("C:\\Program Files\\Common Files\\Services\\verisign.bmp");
		System.out.println("After locating the file");
	}

}
