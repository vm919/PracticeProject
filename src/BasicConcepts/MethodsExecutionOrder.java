package BasicConcepts;

import PracticeCollections.PracticeArrayList;

public class MethodsExecutionOrder {
	 static int b = 10;
		
	public static void main(String[] args) {
		System.out.println("Main method called");
		MethodsExecutionOrder pa = new MethodsExecutionOrder();
		pa.getNonStatic();
		get();
	}
	
	static void get() {
		System.out.println("static void get()" + b);
	}

	 void getNonStatic() {
		System.out.println("void getNonStatic()" + b);
	}
	 
	static {
		System.out.println("Static Block");
	} 

	
	public MethodsExecutionOrder() {
		System.out.println("Printing Constructor");	
	}

}
