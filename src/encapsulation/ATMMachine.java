package encapsulation;

public class ATMMachine {
	
	public static void main(String[] args) {
		ATMMachine atm = new ATMMachine();
		
		Server s = new Server();
		
		s.getBalance(1234);
		
		s.setBalance(12000,1234);
		
		s.getBalance(1234);
		
	}
	
	
	}

	
	