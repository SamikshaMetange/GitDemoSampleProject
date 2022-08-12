package stringdiscussion;

public class IndexPositionOfChar {
	
	public static void main(String[] args) {
		String s1 = "Delhi";
		
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			
			if(c=='h' || c=='i'||c=='l'|| c=='D'|| c=='e')
			{
				System.out.println("Character  "+c+" is at "+i+"th position");
			}
		}
	}
	

}
