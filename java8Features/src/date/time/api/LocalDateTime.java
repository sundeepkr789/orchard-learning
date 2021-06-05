package date.time.api;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

	
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		//date priting
		System.out.println(dd + "...." + mm + "..." + yyyy);
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		System.out.println();
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//time printing
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int ns=time.getNano();
		System.out.printf("%d:%d:%d:%d",h,m,s,ns);
	}

	
}
