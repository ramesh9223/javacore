package cg.hsbc.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap m= new HashMap();
		
		m.put("abc", 700);
		m.put("pqr", 800);
		m.put("xyz", 200);
		m.put("mno", 500);
		
		System.out.println(m);//{pqr=800, abc=700, xyz=200, mno=500}
		
		System.out.println(m.put("abc", 1000));//put() return previous value//700
		
		Set s= m.keySet();
		
		System.out.println(s);//[pqr, abc, xyz, mno]
		
		Collection c= m.values();
		
		Set s1=m.entrySet();
		
		System.out.println(s1);//[pqr=800, abc=1000, xyz=200, mno=500]
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m1= (Map.Entry)itr.next();
			
			System.out.println(m1.getKey()+"---->"+m1.getValue());
			
			if(m1.getKey().equals("mno")) {
				m1.setValue(50000);
			}
		}
		System.out.println(m);//{pqr=800, abc=1000, xyz=200, mno=50000}
	}

}
