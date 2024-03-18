package Task2;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=Integer.parseInt(args[0]);
		Fibonacimethod(a1) ;
	}
	public  static void Fibonacimethod(int a1) {
	int a=0,b=1,result,i;
	System.out.print(a);
	System.out.print(" ");
	System.out.print(b);
	
	for(i=2;i<=a1;i++) {
	result=a+b;
	a=b;
	b=result;
	System.out.print(" ");
	System.out.print(result);
      a=b;
      b=result;
	}
	
	
	}
	

}
