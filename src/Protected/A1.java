package Protected;

public class A1 {
	
	protected void m1() {
		
		System.out.println("protected method m1 from a1 class");
	}
	
	protected void m2() {
		
		System.out.println("protected method m2 from A1 class");
	}
    public static void main(String[] args) {
    	A1 a1 =new A1();
    	a1.m1();
    	a1.m2();
	}
}
