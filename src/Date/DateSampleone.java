package Date;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class DateSampleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		String s="dd/MM/YYYY HH:mm:ss";
		SimpleDateFormat ds=new SimpleDateFormat(s);
		System.out.println(ds.format(d));
		 LocalTime myObj = LocalTime.now();
		    System.out.println(myObj);

	}

}
