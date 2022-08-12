package stringdiscussion;

public class Assignment2 {
	
	//wright a program to print the characters of string which 
	//are present at even position
	public static void main(String[] args) {
		String s1 ="Gandhinagar";
				
				
				for (int i=0;i<s1.length();i++)
				{
					if (i%2==0)
					{
						char c = s1.charAt(i);
						System.out.println(c);
					}
					
				

			}
	}
	
}
