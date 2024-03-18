package Collections;

import java.util.LinkedList;
import java.util.List;

public class ListLinkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arr=new LinkedList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println(arr);
		arr.remove(1);
		arr.set(1,69);
		arr.subList(1,3);
		System.out.println(arr);


	}

}
