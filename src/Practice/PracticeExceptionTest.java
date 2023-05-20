package Practice;

public class PracticeExceptionTest {

	public PracticeExceptionTest() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) throws PracticeCustomExceptionClass {
	int a = 10;
	
	System.out.println("a");
	
	if (a<12)
		throw new PracticeCustomExceptionClass("a is less than 12 " + 10);
	/*
	try {
		if (a<12)
			throw new PracticeCustomExceptionClass("a is less than 12 " + 10);
		}
		catch(PracticeCustomExceptionClass p) {
			p.getMessage("Enter the correct value of a");
		}
		*/
}
}




