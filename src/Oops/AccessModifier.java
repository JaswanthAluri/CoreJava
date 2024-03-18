package Oops;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(add());

	}
static private int a=10;
 static int b=20;
static protected int c=30;
static public int d=40;
private static int  add(){
	return a+b+c+d;	
}
 static int sub() {
	 return a+b+c;
}
 protected static int mul() {
	 return a*b*c*d;
 }
 public static  int div() {
	 return (a+b)/(a-b);
 }
}
