package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		String s="dd/MM/YYYY";
		SimpleDateFormat ds=new SimpleDateFormat(s);
		System.out.println(ds.format(d));

	}

}
