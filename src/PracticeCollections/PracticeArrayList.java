package PracticeCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeArrayList {
	public static void main(String[] args) {
		Integer a[] = new Integer[5];
		List list = new ArrayList();
		list.add(5);
		list.add(5.5);
		list.add("name");
		list.add('c');
		list.add(false);
		
		System.out.println(list);
		
		List<Integer> listOne = new ArrayList<>();
		listOne.add(4);
		listOne.add(2);
		listOne.add(3);
		listOne.add(8);
	
		Collections.sort(listOne);
		
		System.out.println("Printing listOne" + listOne);
		
	}
}
