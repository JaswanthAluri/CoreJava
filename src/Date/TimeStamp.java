package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date ss=new Date();
		System.out.println(ss);
		//String s="1703574225";
		ss.setDate(1703574225);
		System.out.println(ss.getDate());
		method();
	}
	static void method() throws ParseException {
		SimpleDateFormat aj=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		String a="23/12/2023 01:04:23";
		String b="26/12/2023 01:04:23";
		Date s=aj.parse(a);
		Date r=aj.parse(b);
		
		
		System.out.println("Date in S : "+s);
		System.out.println("Date in R : "+r);
		
		if(s.after(r)) {
			System.out.println("After"+ r );
		}
		else {
			System.out.println("Before"+ s);
		}
		
	}

}
