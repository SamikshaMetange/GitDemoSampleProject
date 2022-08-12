package stringdiscussion;

public class MethodsInStringClass {
	
	

	public static void main(String[] args) {
		
	//	1.Equals (string s)
		
		String s1 ="abc";
		
		String s2 = "abc";
				
		boolean s3 = s1.equals(s2);	
		
		System.out.println(s3);
		
		boolean s4 = s2.equals(s1);
		
		System.out.println(s4);
		
		
		
		// 2.EqualsIgnoreCase(String):
		
		String s5 ="PUNE";
		
		String s6 ="PUNE";
		
		boolean s7 =s5.equalsIgnoreCase(s6);
		System.out.println(s7);
		
		
		//length
		
		String s9 ="Bhopal";
		
		int s10 = s9.length();
		
		System.out.println(s10);
		
		String s11 ="Mumbai";
		
		int s12 = s11.length();
		
		System.out.println(s12);
		
		String s13 = "bhopal &  mumbai";
		
	     int s14 =s13.length();
	     
	     System.out.println(s14);
	     
	    
	     
	    // charAt(int index)

			String s111 = "Hyderabad";

			char s121 = s111.charAt(8);

			System.out.println(s121);
			
			String s15 = "Mumbai";
			
			char s16 = s15.charAt(3);
			
			System.out.println(s16);
			
			String s17 ="Banglore";
			
			char s18 = s17.charAt(1);
			
			System.out.println(s18);
			
			//subString (int beginindex)
			
			String s19 ="Secunderbad";
			
			String s20 = s19.substring(5);
			
			System.out.println(s20);
			
			String s21 ="Ahemdabad";
			
			String s22 = s21.substring(6);
			
			System.out.println(s22);
			
			//substring (int beginindex, intendindex)
			
			String s23 ="Punecity";
			
			String s24 =s23.substring(2,7);
			
			System.out.println(s24);
			
			String s25 = "khamgaoncity";
			
		    String s26 = s25.substring(3,5);
		    		
		    System.out.println(s26);
		    
		    
		    //tolowercase;
		    
		    
		    String s27 = "Baramati";
		    String s29 =s27.toUpperCase();
		    String s28 = s27.toLowerCase();//baramatu
		    System.out.println(s28);//baramati
		    System.out.println(s29);//BARAMATI
		    
		    //replace (char int, char new)
		    
		    String s30 = "Hydrabad";
		    String s31 = s30.replace("H","h");
		    System.out.println(s31);//hydrabad
		    String s34 = "hdvgshvghv";
		    String s35 = s34.replace("hdvgshvghv","gsgyugybh ");
		    System.out.println(s31);//hydrabad
		    System.out.println(s35);
		    
		    
		 // replace(String seq1, String seq2)
		    
		    String  s32 = "Aurangabad";
		    String s33 = s32.replace("Auranga", "osmana");
		    System.out.println(s33);
		    
		    // trim()
		    
		    String s36 = "  space string  ";
		    String s37 = s36.trim();
		    System.out.println(s37);//space string
		    
		    //indexOf(char ch)
		    
		    String s38 = "Ahmedabad";
		    int a1 =s38.indexOf("a");
		    System.out.println(a1);//5
		    
		    //lastindexof(char ch)
		    String s39 = "Ahmedabada";
		    int b =s39.lastIndexOf("a");
		    System.out.println(b);//9
		    
//			contains(String s)
		    
		    String s40 ="Bengluru";
		    
		    boolean s41 =s40.contains("luru");
		    System.out.println(s41);
		    
		    
		   // startsWith()
		    
		    String s42="Rameshwaram";
		    boolean s43 =s42.startsWith("Ram");
		    System.out.println(s43);//true
		    boolean s44 = s42.startsWith("esh");
		    System.out.println(s44);//false
		    
		    //endsWith
		    String s45 = "Maharastra";
		    boolean s46 = s45.endsWith("tra");
		    System.out.println(s46);//true
		    
		    //split
		    
		    String s47 ="I lives in pune";
		    
		    String[] s48 =s47.split(" ");
		    
		    for(String s49:s48)
		    {
		    	System.out.println(s49);
		    	
		    }
		    
		    
		    //tochararray();
		    
		   String s50 = "Velocity";
		   
		   char[]s51 =s50.toCharArray();
		   
		   for(char c:s51)
		   {
		    	System.out.println(c);
		    	
		    }
		   
	}
}
		    		
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	
