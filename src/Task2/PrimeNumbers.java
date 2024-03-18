package Task2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a=Integer.parseInt(args[0]);

		primenumbersmethod(a);
}
	public static void primenumbersmethod(int a) {
	
	int b=0;
	if(a>1)
	{
		for(int i=1;i<=a;i++)
		{
			if(a%i ==0)
				b++;
		}
		if(b==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
	else
	{
		System.out.println("not a  prime number");
	}

	}

}