package inheritance;

public class AcessTestInSamePacakage {
	
	public void m1() {
		System.out.println("executing the m1 method");
		
	}
	public static void main(String[] args) {
		Grandparent A =new Grandparent();
		A.farm();//accesing the public method inside the same pacakage
		A.m1();
		Parent p =new Parent();
		p.decore();
		
		
		
	}

}
