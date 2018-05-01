package cg.hsbc.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet(new MyStringBufferComparator());
		
		t.add(new StringBuffer("A")); // CCE  StringBuffer is not comparable
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("D"));
		
		System.out.println(t);

	}

}

class MyStringBufferComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s1.compareTo(s2);
		
	}
	
}
