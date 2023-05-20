package SampleTest;

public class MySample {

	public MySample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String ("Vaibhav");
		String s2 = new String ("Vaibhav");
		String s3 = "Vaibhav";
		
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true
		
		String s4 = "Vaibhav";
		String s5 = "Vai" + "bhav";
		System.out.println(s5);
		System.out.println(s4 == s5); //true
		System.out.println("++++++++++++++++++++");
		
		String s6 = "Va";
		String s7 = s6 + "ibhav";
		System.out.println(s7);
		System.out.println(s4 == s7); //false
		
		//for our pupose ***
		System.out.println("////////////////////////");
		String s8 = s7;
		System.out.println(s4 == s8);
		System.out.println("Value of S8  " + s8);
		
		final String s9 = "Vaib";
		String s10 = s9 + "hav";
		System.out.println("s9  " + s9 + " s10 " + s10);
		System.out.println(s4 == s10); //true
		
	}

}
