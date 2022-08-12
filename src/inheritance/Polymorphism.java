package inheritance;

public class Polymorphism {
	
	public void m1( int b,String m) {
		System.out.println("zero argument constructor is executing");
	}
	
	public void   m1(String m,int b) {
		System.out.println("one argument constructor is executing");
		
	}
       public static void main(String[] args) {
    	   Polymorphism p =new Polymorphism();
    	   p.m1("ABD",40);
    	   p.m1("def",70);
    	   
    	   
	}
}
