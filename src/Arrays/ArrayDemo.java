package Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,4,6,8};
		System.out.println(nums[1]);
		 try {
			 nums[5]=9;
		 }
		 catch(Exception AJ){
			 System.out.println();
		 }
		 finally{
			 System.out.println("");
		 }
        System.out.println("program is running after exemption");
	}

}
