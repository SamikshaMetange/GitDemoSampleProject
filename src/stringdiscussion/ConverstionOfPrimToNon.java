package stringdiscussion;

public class ConverstionOfPrimToNon {
	public static void main(String[] args) {
		int i1 = 56;
		
		 String s1=String.valueOf(i1);
		 
		 System.out.println(s1+4);//564
		 
		 boolean b = false ;
		 
		 String s2 =String.valueOf(b);
		 
		 System.out.println(s2);//false
		 
		 
		 String s3 = "10";
		 
		int i2 = Integer.parseInt(s3);
		
		System.out.println(i2);
		
		
		 
		 
		 String s5 ="58.45";
		 
		 double d = Double.parseDouble(s5);
		 
		 System.out.println(d+8);//66.45
		 
		 //isDigit (char ch)
		 
		 char s4 = 'a';
		 
		 boolean e = Character.isDigit(s4);
		 
		 System.out.println(e);//false
		 
        char s6 = '0';
		 
		 boolean g = Character.isDigit(s6);
		 
		 System.out.println(g);//true
		 
		 //isalphabetic (char ch)
		 
		 char s7 = 'a';
		 
		 boolean ahgahghg= Character.isAlphabetic(s7);
		 
		 System.out.println(ahgahghg);//true
		 
         char s8 = '0';
		 
		 boolean huihdfkdkf= Character.isAlphabetic(s7);
		 
		 System.out.println(huihdfkdkf);//true
		 
		 //regularexpression
		 
		 String s9 = "Hauston";
		 
		 String s10 = s9.replaceAll("[A-Z]","h");
		 System.out.println(s10);
		 
		 String s11 ="String";
		 
		 String s12 = s11.replaceAll("[^A-Z]", "p");
		 
		 System.out.println(s12);//Spppppp
		 
		 String s13 ="String";
		 
		String s14 = s13.replaceAll("[a-z]","%");
		 
		System.out.println(s14);///S%%%%%
		
		String s15 =s13.replaceAll("[A-Za-z]", "#");
		
		System.out.println(s15);//#####
		
		
		String s16 ="Ac4657cen&%ture";
		
		String s17 = s16.replaceAll("[^A-Za-z]", "");
		
		System.out.println(s17);//ACCENTURE
		
	String s18 = s16.replaceAll("[A-Za-z0-9]", "");
	
	System.out.println(s18);//&%
		
		
		
	}
	
	 
}
