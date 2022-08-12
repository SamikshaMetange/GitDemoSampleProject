package exceptionalhandling;

public class Throw {
	
	public static void main(String[] args) {
		int i=50;
		
		if(i>20)
		{ throw new NullPointerException("something went wrong ,please try later");
			
			
		}
		
		else {
			throw new ClassCastException("something went wrong,please try later after sometime");
			
		}
		
	}

}
