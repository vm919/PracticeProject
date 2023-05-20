package SampleTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;




public class SampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			 SampleThree st = new SampleThree();
		
		     System.out.println(10 * 20 + "Javatpoint");   
		     System.out.println("Javatpoint" + 10 * 20);
		     
		     //--------
		     
		     System.out.println(10 + 20 + "Javatpoint");   
		     System.out.println("Javatpoint" + 10 + 20);
		     
		     //---------
		     
		     reverseString("Laptop");
		     
		     findCharacterOccuranceInString("OCCURANCEAAAABBBB");
		     
		     //----------
		     
		     st.dataType();
		     
		     
		    } 
	
	static void reverseString(String str) {
		String var = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			var = var + str.charAt(i);
		}
		
		System.out.println(var);
		
	}
	
	
	
	/*
	 * OCCURANCE
	 * */
	
	
	static void findCharacterOccuranceInString(String str) {
		HashMap<Character, Integer> hm = new HashMap();
		hm.put(str.charAt(0), 1);
		
		//OCCURANCE
		for(int i=1; i<str.length(); i++) {
			
			if(hm.containsKey((str.charAt(i))))
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			else {
				hm.put(str.charAt(i), 1);
				
			}
		}
		
		for(Entry<Character, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey() + "" + entry.getValue());
		}
	}
	
	
	boolean b;
	char c;
	byte by;
	short s;
	int i;
	long l;
	double d;
	float f;

//	Character ch = new Character();
	
	String str;
	
	void dataType() {
		
		boolean X;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("boolean " + b);
		System.out.println("char " + c);
		System.out.println("byte " + by);
		System.out.println("short " + s);
		System.out.println("integer " + i);
		System.out.println("long " + l);
		System.out.println("double " + d);
		System.out.println("float " + f);
		System.out.println("String " + str);
		//System.out.println("boolean in method " + x);
		
	}
	
	static void findFirstNonRepeatedCharacter() {
		int arr[] = new int[] {1,2,8,3,6,4,5,6,2,7,8,9};

		for(int i=0; i<arr.length; i++) {
	        if ( arr.indexOf(i) == arr.lastIndexOf(i)) {
	            System.out.println("First non-repeating character is: "+i);
	            break;
	        }
	        }
		
	}
	
	

}
