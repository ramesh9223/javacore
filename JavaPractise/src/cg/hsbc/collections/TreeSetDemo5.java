package cg.hsbc.collections;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
	
	String name;
	int id;
	
	
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	
	


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}


	@Override
	public int compareTo(Object o) {
		
		int  id1= this.id;
		
		Employee e= (Employee)o;
		
		int id2=e.id;
					
		return id1-id2;
	}
	
}

public class TreeSetDemo5{
	public static void main(String[] args) {
		
		Employee e1= new Employee("Raja", 5);
		Employee e2= new Employee("Ramesh", 10);
		Employee e3= new Employee("Sita", 15);
		Employee e4= new Employee("Gita", 11);
		Employee e5= new Employee("Sunita", 10);
		
		TreeSet t = new TreeSet();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
		
		TreeSet t1= new TreeSet(new EmployeeComparator());
		
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
					
		System.out.println(t1);//Dictionary Order wrt to EmployeeComparator
	}
}

class EmployeeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		String s1=e1.name;
		String s2=e2.name;
		
		return s1.compareTo(s2);
	}
	
}