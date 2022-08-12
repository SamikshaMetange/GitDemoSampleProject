package stringdiscussion;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "This is my Country";
		
		String r1[] = s1.split(" ");
		
		for( int i=3;i>=0; i--)
		{
			
			System.out.println(r1[i]);
		}
		
	}

	

}
