package cg.hsbc.collections;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		
		t.add(new StringBuffer("A")); // CCE  StringBuffer is not comparable
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("D"));
		
			
		
		System.out.println(t);

	}

}
