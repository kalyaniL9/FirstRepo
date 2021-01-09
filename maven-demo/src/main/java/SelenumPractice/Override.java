package SelenumPractice;

public class Override extends  Inheritance{

	public void method1() {
		System.out.println("First Method in Override class");
	}
	
	public void method3() {
		System.out.println("Third Method in Override class only");
	}
	
	public static void main(String[] args) {
		Override OV = new Override();
		OV.method1();
		OV.method2();
		
		System.out.println("********************");
		
        Inheritance obj1 = new Override();
        obj1.method1();
        obj1.method2();
        
		
		
	}

}
