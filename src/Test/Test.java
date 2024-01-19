package Test;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Testing for Github");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jai Shree Ram"); 
		add(3,6);
	}
	
	//static block
	static{
		System.out.println("Entered into Static block");
	}
	
	//adding a new method for pull request
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println("The value of c is: " + c);
	}

	//adding a new method for commit
	public static void add(int a, int b) {
		int c = a*b;
		System.out.println("The value of c is: " + c);
	}


	
	
}
