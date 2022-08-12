package exceptionalhandling;

public class FinalBlock {
	
	
    public static void main(String[] args) {
    	
    	try {
			int i = 100;
			int j = 0;
			
			System.out.println(" before division line ");
			
			int k =i/j;
			
			System.out.println("After division line");
			
		     System.out.println(k);
		}
		
		catch (NullPointerException e)
    	
		{ System.out.println("Arithematic exception block ");
		
		String message=e.getMessage();
		
		System.out.println(message);
		
		}
    	
    	finally {
    		
    		System.out.println("Executig Finally Block");
    	}
	
    }
}

