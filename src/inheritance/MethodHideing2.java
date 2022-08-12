package inheritance;

public class MethodHideing2 extends MethodHideing  {
	
	public static void m1() {
		System.out.println("m1 method from methodhideing2 class");
	}
	
	public static void main(String[] args) {
		MethodHideing2 MH2 = new MethodHideing2();
		MH2.m1();//child class
		
		MethodHideing mh  = new MethodHideing();
		mh.home();//parent class
		mh.furniture();
		
		MethodHideing mmhh = new MethodHideing2();
		mmhh.furniture();//from parent class
		mmhh.m1();//from parent class
		
		
		
		
	}

}
