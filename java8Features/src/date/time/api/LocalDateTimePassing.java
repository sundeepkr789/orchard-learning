package date.time.api;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimePassing {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1997, Month.AUGUST, 19, 9, 21, 21);
		System.out.println(dt);
		System.out.println("After six months" + dt.plusMonths(6));
		System.out.println("Before six months" + dt.minusMonths(6));
	}

}
