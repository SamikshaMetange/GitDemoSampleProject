package inheritance;

public class Child extends Parent  {
	
	
	public static void eduction() {
		System.out.println("education method for chid class");
		
	}
	
	public void bike() {
		System.out.println("bike method for child class");
	}
	
	public void marry() {
		System.out.println("marry method from child class");
	}
	
       public static void main(String[] args) {
    	   Child ch=new Child ();
    	   Parent pp = new Child ();
    	   
    	   pp.car();//from parent class
    	   pp.marry();//from child  class
    	   ch.home();
    	   ch.furniture();
    	   ch.decore();
    	   ch.car();
    	   ch.property();
    		ch.farm() ; 
    		ch.marry();
    			   
	}

}
