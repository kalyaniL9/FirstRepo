package SelenumPractice;

public class Overloading1 {
	
	
	
	public static void method1() {
		System.out.println("First Method with no aruguments");
	}
	
	public static void method1(int age) {
		System.out.println("Second Method with 1 aruguments and age  is :" + age);
	}

	
	public static void method1(int age, String Name) {
		System.out.println("Third Method with 3 aruguments and age/Name :" + age +" ," + Name);
	}
	public static void main(String[] args) {
		method1();
		method1(20);
		method1(19,"Sam" );

	}

}
