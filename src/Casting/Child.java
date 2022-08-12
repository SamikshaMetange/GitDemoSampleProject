package Casting;

public class Child extends Parent {
	
	public void m5 () {
		System.out.println("m5 method from child class");
	}
	public static void main(String[] args) {
		Child c = new Child();
		Parent pp = (Parent) c;// UP CASTING
		pp.m2();
		((Child) pp).m5();
		
		Parent p1 = new Child();
		p1.m1();
		Parent k =new Parent();
		Child c1 = (Child)k;//DOWN CASTING
		Child ccccc = (Child)pp;
		c1.m1();
		c1.m4();
		ccccc.m4();
		
	}
	
	

}
