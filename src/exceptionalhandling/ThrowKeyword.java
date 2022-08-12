package exceptionalhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;

public class ThrowKeyword {
	
	public static void main(String[] args) throws FileNotFoundException,InterruptedIOException
	{
		
		
		FileInputStream fis = new FileInputStream("//c//program files//d drive");
		
		System.out.println("After locting the file");
		
		
	}

}
