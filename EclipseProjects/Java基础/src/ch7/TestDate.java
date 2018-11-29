package ch7;

import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		Calendar ca=Calendar.getInstance();
		System.out.println(ca.DAY_OF_MONTH);
		System.out.println(ca.DAY_OF_WEEK);
		System.out.println(ca.DAY_OF_YEAR);
	}

}
