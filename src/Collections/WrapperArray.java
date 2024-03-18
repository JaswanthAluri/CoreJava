package Collections;

import java.util.ArrayList;

public class WrapperArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1= {20,22,30,4,5};
		Integer[] arr2= {3,8,9,6};
		ArrayList<Integer[]> combineArray= new ArrayList<>();
		combineArray.add(arr1);
		combineArray.add(arr2);
		System.out.println(combineArray);
		ArrayList<ArrayList<Integer[]>> obj=new ArrayList<ArrayList<Integer[]>>();
		obj.add(combineArray);
		ArrayList<ArrayList<ArrayList<Integer[]>>> obj1=new ArrayList<ArrayList<ArrayList<Integer[]>>>();
		obj1.add(obj);
		for(int l=0;l<obj1.size();l++) {
			for(int i=0;i<obj1.get(l).size();i++) {
				for(int j=0;j<obj1.get(l).get(i).size();j++) {
					for(int k=0;k<obj1.get(l).get(i).get(j).length;k++) {
						System.out.println(obj1.get(l).get(i).get(j)[k]+",");
					}
				}
				
			}
		}

	}

}
