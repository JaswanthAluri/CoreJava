package Task2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter no:of rows");
		int n=Sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
