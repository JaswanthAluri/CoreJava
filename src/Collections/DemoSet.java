package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		List<Integer> listobj= new ArrayList<>();
		listobj.add(20);
		listobj.add(30);
		listobj.add(50);
		listobj.add(10);
		listobj.add(5);
		System.out.println("List : "+listobj);
		
		Set objset=new HashSet();
		
		objset.add(30);
		objset.add(30); 
		objset.add(60);
		objset.add("10");
		objset.add(10);
		objset.add(20);
		System.out.println(objset);
		
         Set objset2=new TreeSet();
        
		objset2.add(30);
		objset2.add(60);
		objset2.add(30);
		objset2.add(10);
		objset2.add(20);
		  System.out.println(objset2);
		Iterator<Object> values=objset2.iterator();
		while(values.hasNext())
		System.out.println(values.next());
		
		
		
		Set objset1 =new HashSet(listobj);
		System.out.println(objset1);
	}

	

}
