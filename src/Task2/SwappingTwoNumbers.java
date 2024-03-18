package Task2;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		swappingtwonumbersmethod(a,b);
}
	public static void swappingtwonumbersmethod(int a,int b) {;
	System.out.println("before swaping");
	System.out.println("value of a is "+a);
	System.out.println("value of b is "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swaping");
	System.out.println("value of a is"+a);
	System.out.println("value of b is "+b);

}

}
