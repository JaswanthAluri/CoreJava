package Task1;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		leapyearmethod(a);
	}	
	public static void leapyearmethod(int a){
	
	if ((a%4==0 & a%100!=0) || (a%400==0))
	System.out.println("Given year is leap year");
	else
	System.out.println("Given year  is not a leap year");

}}

