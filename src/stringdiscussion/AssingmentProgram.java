package stringdiscussion;

public class AssingmentProgram {
	
	// wright a program to reverse mumbai by using string methods
	
	public static void main(String[] args) {
		
		String a = "I am Ram";
		
		String reverse ="";
		
		for (int i=a.length()-1;i>=0;i--)
			
			reverse=reverse+a.charAt(i);
		{
			System.out.println(reverse);
		}
		
		
		
	}

}
