package PracticeQuestions;


/*
 * Given an integer, reverse it. (14587953)
 * */
public class ReverserInteger {

	public static void main(String[] args) {
		int b = 12345;
		reversePositiveInteger(b);
		reverseNegativeInteger(-b);
		reverseIntegerUsingString(b);
		int x = 2100000003;
		System.out.println("value of x: " + x);
		System.out.println("*********************");
		reversePositiveInteger(x);
		Integer a = 500;
		Integer f = 100;
		System.out.println(a==f);
		
	}
	
	public static void reversePositiveInteger(int b) {
		
		int i=0;
		while( b>0) {
			int g = b%10;
			i = i * 10 + g;
			b= b/10;
		}
		System.out.println(i);

	}
	public static void reverseNegativeInteger(int c) {
		int h=0;
		while( c<0) {
			int g = c%10;
			h = h * 10 + g;
			c= c/10;
		}
		System.out.println(h);

	}
	public static void reverseIntegerUsingString(int x) {
		//String a = Integer.toString(x);
		String a = String.valueOf(x);
		
		String rev="";
		for (int j = a.length()-1; j >=0 ; j--) {
			
			rev = rev+a.charAt(j);
		}
		int z = Integer.parseInt(rev);
		System.out.println(z);
		System.out.println("Check if z is an integer by dividing by 10" + z/10);


	}
}


