package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr= new ArrayList();
		arr.add(1);
		arr.add("ja");
		arr.add(1,77);
		String[] a= {"Pavan","jaswanth","Akki"};
		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i)+a[i]);
		}
		
		List arr1=new ArrayList();
		arr1.add(15);
//		System.out.println(arr1);
//		
		List<ListDemo2> alist=new ArrayList<>();
		
//		ListDemo2 listDemo2 =new ListDemo2();
//		
//		listDemo2.setC(20);
//		listDemo2.setD(49);
//		
//		alist.add(listDemo2);
//		System.out.println(alist);
		
		List<Float> arr2= new ArrayList<Float>();
		arr2.add((float) 8.11);
		arr2.add((float) 6.33);
//		System.out.println(arr2);
		
		List<Double> arr3=new ArrayList<Double>();
		arr3.add(123.654789);
		arr3.add(6547.63214987);
		arr3.add(147.36987);
		for(Object n:arr3) {
//			System.out.println(n);
		}
//		System.out.println(arr3);
		
		List<Integer> arr4=new ArrayList();
		arr4.add(10);
		arr4.add(20);
		arr4.add(40);
		arr4.add(60);
		
		List arrnew=new ArrayList();
		arrnew.add(arr2);
		arrnew.add(arr3);
		arrnew.add(arr4);
//		arrnew.add(listDemo2);
		arrnew.add(arr1);
		arrnew.add(alist);
		for(int i=0;i<arrnew.size();i++) {
			for(int j=0;j<((List<Object>)arrnew.get(i)).size();j++) {
				System.out.println(((List<Object>)arrnew.get(i)).get(j));
			}
		}
//		System.out.println(arrnew);
		
	}

}
