package Task2;

import java.util.Scanner;

import Task1.Leapyear;
import Task1.OddorEven;

public class All {

	public static void main(String[] args) {
	for(;;)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("1 is fibonaci series::::");
		System.out.println("2 is swaping two numbers::::::");
		System.out.println("3 is check if Given number is prime or not::::::");
		System.out.println("4 is to check the entered year is leap year or not:::::");
		System.out.println("5 is to check if given number is odd or even");
        System.out.println("Give input");
        int a=scanner.nextInt();
        if (a==1) {
        	System.out.println("Enter The Number");
        	int b=scanner.nextInt();
        	Fibonaci.Fibonacimethod(b);
        }
        else if (a==3) {
        	System.out.println("Enter the number");
        	int b=scanner.nextInt();
        	PrimeNumbers.primenumbersmethod(a);
        }
        else   if (a==2) {
        	System.out.println("Enter two numbers");
        	int b=scanner.nextInt();
        	int c=scanner.nextInt();

        	 SwappingTwoNumbers.swappingtwonumbersmethod(c,b);
        }
        else if (a==4) {
        	System.out.println("Enter the year");
        	int b=scanner.nextInt();
        	 Leapyear.leapyearmethod(a);
        }
        else if (a==5) {
        	System.out.println("Enter the number to check its odd or even");
        	int b=scanner.nextInt();
        	 OddorEven.oddorevenmethod(a);
        	
        }
        else {
        	System.out.println("Enter valid input");
        }
        
        System.out.println("Enter 0 to break");
   	 int n=scanner.nextInt();
   	 if(n==1)
   		 continue;
   	 else
   		 break;
        }
        
	}

		// TODO Auto-generated method stub
		
	}


