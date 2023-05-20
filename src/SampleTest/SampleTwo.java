package SampleTest;

public class SampleTwo extends SampleOne{
	SampleOne s  = new SampleOne();
	void methodTwo(){
		s.num = 20;
		
	}
	
	public static void main(String[] args) {
		SampleTwo t =  new SampleTwo();
		System.out.println(t.num);
		System.out.println();
		
		String s = "monday";
		
		
		for(int i= s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
		
		
		
	}
			
}
