package Strings;

import java.util.Calendar;

public class Current_Date_time {
	    public static void main(String[] args) {
	        Calendar calendar = Calendar.getInstance();
	        int year = calendar.get(Calendar.YEAR);
	        int month = calendar.get(Calendar.MONTH) + 1; 
	        int day = calendar.get(Calendar.DAY_OF_MONTH);
	        int hour = calendar.get(Calendar.HOUR_OF_DAY); 
	        int minute = calendar.get(Calendar.MINUTE);
	        int second = calendar.get(Calendar.SECOND);
	        System.out.print(String.format("%02d", day) + "-");
	        System.out.print(String.format("%02d", month) + "-");
	        System.out.print(year + " ");
	        
	        System.out.print(String.format("%02d", hour) + ":");
	        System.out.print(String.format("%02d", minute) + ":");
	        System.out.println(String.format("%02d", second));
	    }
	}
