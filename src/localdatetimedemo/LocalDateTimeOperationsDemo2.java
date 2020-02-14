package localdatetimedemo;

import java.time.LocalDateTime;

public class LocalDateTimeOperationsDemo2 {

	public static void main(String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.of(2012, 7, 15, 0, 0);
		LocalDateTime dateTime2 = dateTime1.plusMonths(3);
		System.out.println("DateTime " + dateTime1 + " plus 3 months: " + dateTime2);
	}

}
