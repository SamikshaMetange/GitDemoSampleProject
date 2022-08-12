package inheritance;

     final class C {
   
    	public void home() {
    		System.out.println("home method from parent class");
    	}
    
    	public void property() {
    		System.out.println("property method from parent class ");
    	}
    	
    	static public void furniture () {
    	System.out.println(" furniture method from parent class");	
    	}
    	
    	public void farm() {
    		System.out.println("farm method from grandparent class");
    	}
    public static void main(String[] args) {
    	C farm =new C ();
    	
	}
    
    }
    


