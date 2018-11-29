package Test;

import java.util.Calendar;
import java.util.Date;

public class TestSwitch {
		public static void main(String[] args){
			//判断今天星期几
			Calendar can=Calendar.getInstance();
			//new Data()
			can.setTime(new Date());
			int day=can.get(Calendar.DAY_OF_WEEK);
			switch(day-1){
			//1->Sunday
			//2->Monday
			//0->11
			//
			case 1:
				System.out.println("Monday!");
				break;
			case 2:
				System.out.println("Tuesday!");
				break;
			case 3:
				System.out.println("Wednesday!");
				break;
			case 4:
				System.out.println("Thursday!");
				break;
			case 5:
				System.out.println("Friday!");
				break;
			case 6:
				System.out.println("Saturday!");
				break;
			case 7:
				System.out.println("Sunday!");
				break;
			}
		}
}
