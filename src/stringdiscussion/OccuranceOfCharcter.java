package stringdiscussion;

public class OccuranceOfCharcter {
	
	

	public static void main(String[] args) {
		String s1 = "Pennsylvania";
		
		int count=0;
		
		for ( int i=0;i<s1.length()-1;i++)
		{
		     char c = s1.charAt(i);
		     
		     
			if (c =='n')
		     {
		    	 count++;
		     }
		     
			System.out.println("total occurace of n is"+count);
		}
		
	}

}
