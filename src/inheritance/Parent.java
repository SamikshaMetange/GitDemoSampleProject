package inheritance;

public class Parent  extends Grandparent{
	 
	public static void home() {
		
		System.out.println("home method form parrent class");
	}
	
	public void decore() {
		System.out.println("decore method form parent class");
	}
	
	public void property() {
		System.out.println(" property method form parent class");
	}
	
	static public void furniture() {
		System.out.println("funiture method form parent class");
		
		}
	
	public void car() {
		System.out.println("car method form parent class");
	}
	
	 void marry() {
		System.out.println("marry method from parent class");
	}
	public static void main(String[] args) {
		 Parent p =new  Parent();
		 
		 p.m1();
		 
		 p.farm();
		 
		 p.m2();
		 
		 p.car();
	}
	
	
	}


