package PracticeCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class PracticeTreeSet {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(50);
		s.add(4);
		s.add(500);
		s.add(0);
		s.add(20);
		s.add(300);
		
		System.out.println("TreeSet" + s);

		Set<Integer> hs = new HashSet<>();
		hs.add(50);
		hs.add(4);
		hs.add(500);
		hs.add(0);
		hs.add(20);
		hs.add(300);
		
//		for (Integer i : hs) {
//			System.out.print(i);
//		}
		
		
		//System.out.print("HashSet" + hs);
		
	hs.remove(500);
	System.out.println("HashSet after removal of 500: " + hs);
	
	//updating 200 into set
	
		
				hs.remove(20);
				hs.add(200);
	
		System.out.println("HashSet after updating 200: " + hs);
		
		CopyOnWriteArrayList<Integer> copy= new CopyOnWriteArrayList<>(hs);
		for (Integer i : copy) {
			if (i == 200) {
				copy.remove(i);
			}
		}
		
		System.out.println("HashSet after removing 200 from copy: " + copy);
		
		for (Integer i : copy) {
			if (i == 50) {
				copy.remove(i);
			}
		}
		
		System.out.println("HashSet after removing 50 from hs: " + hs);
System.out.println("----------------------------------------------------------------");	
		System.out.println("Printing elements of copy: " + copy);
		
	/*	for (int i=0; i<copy.size(); i++) {
			if (copy.get(i) == 4) {
				copy.set(i, 40);
				break;
			}
		}*/
		
		for (Integer i : copy) {
			if (i == 2) {
				copy.set(i, 7000);
				break;
			}
		}
		
		System.out.println("HashSet after adding 7000 in place of 40 in copy: " + copy);
	
		//current elements in copy : [0, 4, 300]
		
		for (Integer i : copy) {
			if (copy.indexOf(i) == 4) {
				copy.set(copy.indexOf(i), 7000);
			}
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("HashSet after adding 7000 in place of 4 in copy: " + copy);

	}
	
	

}
