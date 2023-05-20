package PracticeQuestions;

public class CustomExceptionCallerClass {

	public static void methodForCustomException() throws MyCustomExceptionClass {
		if (10<12)
			throw new MyCustomExceptionClass("Exception Occured");
		}
	
	public static void main(String[] args) {
		
	}

}
