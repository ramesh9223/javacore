package cg.hsbc.collection;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

class A1{
	public int i;
	protected int j;
	
}
class B2 extends A1{
	int j;
	
	void display() {
		super.j=3;
		super.i=10;
		System.out.println(i+""+j);
	}
}

class Super{
	private int i;
	private int j;
}

class child extends Super{
	void display() {
		super.j=super.i + 1;
		
		System.out.println(super.i+""+super.j);
	}
}



public class Test {
	public enum Quarter{
		J,F,M
	};
		
	void adda(int varA) {
		varA+=3;
	}
	public static void main(String[] args) {
		//System.out.println(new MNOP().x+""+new MNOP().y);
		//System.out.println(Quarter.F.ordinal());
		
		/*B2 obj= new B2();
		obj.i=1;
		obj.j=2;
		obj.display();*/
		
		/*Thread t= Thread.currentThread();
		t.setName("mythread");
		System.out.println(t);*/
		
		/*int varA=0;
		adda(varA++);
		System.out.println(varA);*/
		
		/*double number=189563245.4567d;
		String numbera= String.format("%,.2f", number);
		
		System.out.println(numbera);*/
		
		/*Test h= new Test();
		
		h.methodA();*/
		
		Test p= new Test();
		p.start();
		
	}
	
	/*void start() {
		boolean b1=false;
		boolean b2=fix(b1);
		System.out.println(b1+" "+b2);
	}
	
	boolean fix(boolean b1) {
		b1= true;
		return b1;
	}*/
	
	/*Object methodA() {
		Object obj1= new Object();
		Object [] obj2= new Object[1];
		obj2[0]=obj1;
		obj1=null;
		return obj2[0];
	}
*/
}
