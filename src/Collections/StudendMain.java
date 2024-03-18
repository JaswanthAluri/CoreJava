package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudendMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> data=new ArrayList<>();
		Student studentobj=new Student();
		studentobj.setId(45);
		studentobj.setName("Jaswanth");
		studentobj.setMno(7288807486l);
		studentobj.setEmail("aluri@gmail.com");
		studentobj.setGender('m');
		data.add(studentobj);
		
		Student studentobj2=new Student();
		studentobj2.setId(48);
		studentobj2.setName("Balu");
		studentobj2.setMno(7288807486l);
		studentobj2.setEmail("aluri@gmail.com");
		studentobj2.setGender('m');
		data.add(studentobj2);
		System.out.println("enter student id");
		int a=45;
		for(Student l:data) {
			if(l.getId()==a) System.out.println(l);
		}
		Map<Integer,Student> s=new HashMap<>();
		for( Student l:data) {
			s.put(l.getId(), l);
		}
		System.out.println(s.get(45));
		
		 
		

	}

}
