package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {10,65,32,54,5,2,3,1,10,1,2,3};
		List<Integer>  arr=new ArrayList<>(Arrays.asList(a));
		rem(arr);
	}
	static void rem(List<Integer> arr) {
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i)>arr.get(j)) {
					arr.set(i, arr.get(i)+arr.get(j));
					arr.set(j, arr.get(i)-arr.get(j));
					arr.set(i, arr.get(i)-arr.get(j));
					
				}
			}
			
		}
		System.out.println("Array  List Sort"+arr);
		List<Integer> arr1=new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			int n=0;
			arr1.add(arr.get(i));
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i)==arr.get(j)) {
					n++;
				}
			}
			i+=n;
		}
		System.out.println("Remove duplicates in Array"+arr1);
		System.out.println("Second largest in Array"+arr1.get(arr1.size()-2));
		
	}
	static void print(List<Integer> arr) {
		System.out.println("Remove []"+arr.get(0));
		for(int i=1;i<arr.size();i++) System.out.println(","+arr.get(i));
	}
	static void rotatelist(List<Integer>arr,);

}
