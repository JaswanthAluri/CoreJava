package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="balu";
		String n="ulab";
		System.out.println(anagrams(m,n));
		
	}
	static boolean anagrams(String a,String b)
	{
		if(a.length()!=b.length()) return false;
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		//System.out.println(new String(a1));
		return Arrays.equals(a1, b1);
		
	}
}
