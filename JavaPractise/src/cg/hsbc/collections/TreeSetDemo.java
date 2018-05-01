package cg.hsbc.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		
		t.add("A");
		t.add("B");
		t.add("A"); // Duplicates are not allowed
		t.add("C");
		
		//t.add(new Integer(5)); // CCE
		//t.add(null); // NPE
		
		System.out.println(t);

	}

}
