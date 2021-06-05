package date.time.api;

import java.time.LocalDateTime;

public class LocalDateTime1 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();
		System.out.printf("Date:%d,%d,%d", dd, mm, yy);

		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int ns = dt.getNano();
		System.out.printf("\nTime:%d,%d,%d,%d", h, m, s, ns);
	}

}
