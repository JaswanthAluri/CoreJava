package Task1;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		 oddorevenmethod(a);
	}
	public static void oddorevenmethod(int a);{
	if(a%2==0)
		System.out.println("Given number is even number");
		else
		System.out.println("Given number is odd number");

	}

}
