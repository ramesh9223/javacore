package cg.hsbc.collection;

class NT extends Thread{
	Thread t;
	String name;
	NT(String tname){
		name= tname;
		t= new Thread(this,name);
		t.start();
	}
	
	public void run() {
		
	}
}

public class MT {

	public static void main(String[] args) {
		NT o1=new NT("one");
		NT o2=new NT("two");
		
		try {
			o1.wait();
			System.out.println(o1.t.isAlive());
		}
		catch(Exception e) {
			System.out.println("MTI");
		}

	}

}
