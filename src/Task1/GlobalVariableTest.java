package Task1;

public class GlobalVariableTest {
	public static int a=20;
	static int b=40;
	static int c;
	static int d;
	public static void main(String[] args) {
		System.out.println("hello..");
		add();
		sub();
		mul();
	}
 static void add() {
	int c=a+b;
	System.out.println("ADD IS "+(a+b));
}
static void sub() {
	int d=c-a;
	System.out.println("SUB IS "+d);
}
static void mul() {
	int e=a*b;
	System.out.println("mul is "+e);
}
	}


