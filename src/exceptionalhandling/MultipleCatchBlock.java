package exceptionalhandling;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		int k=0;
	   
		   try {
				int i= 100;
				int j=0;
				System.out.println("before division line ");
				 k= i/j;
				
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("catch is executing");	
			}
		   
		   catch (NullPointerException e) {
			   System.out.println("Null pointer exception");
			   
			   }
		   
			
			System.out.println("after division line ");
			System.out.println(k);
	   	
	   
	

}
}

