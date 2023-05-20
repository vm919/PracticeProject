package Practice;

public class PracticeConstructor {

	public static void main(String[] a) {
		System.out.println("Inside main method");
		PracticeConstructor pc = new PracticeConstructor();
		PracticeConstructor pc1 = new PracticeConstructor("hello");
		
	}
	
	public PracticeConstructor() {
		System.out.println("Inside normal Constructor");
	}
	
	public PracticeConstructor(String s) {
		System.out.println("Inside parameterized Constructor");
	}
	
	static {
		System.out.println("Inside static block");
	}
	
	public static void main() {
		
	}
	

	
}

 class A{
	
}
