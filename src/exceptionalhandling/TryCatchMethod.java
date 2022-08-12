package exceptionalhandling;

public class TryCatchMethod {
	
	public static void main(String[] args) {
		
	int	k=0;
	
	try {
		int i= 100;
		int j=0;
		System.out.println("before division line ");
		 k= i/j;
		
	}
	
	catch(ArithmeticException e) {
		System.out.println("catch is executing");
		
	}
	
	System.out.println("after division line ");
	System.out.println(k);
	}

}
