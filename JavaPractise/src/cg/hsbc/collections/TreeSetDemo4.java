package cg.hsbc.collections;

import java.util.Comparator;
import java.util.TreeSet;

/*WAP to isert Srting & StringBuffer object to TreeSet where sorting order is increasing length order. 
If two srting has the same length consider their alphabetical order*/

public class TreeSetDemo4 {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet(new MyHeterogenousComparator());
		
		t.add(new StringBuffer("A")); 
		t.add(new StringBuffer("B"));
		t.add("AA");
		t.add("ABC");
		t.add("X");
		
		System.out.println(t);

	}

}

class MyHeterogenousComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		
		int l1= s1.length();
		int l2= s2.length();
		
		if(l1>l2)
			return -1;
		else if(l1<l2)
			return 1;
		else
			return s1.compareTo(s2);
	
	}
	
}
