package localtimedemo;

import java.time.LocalTime;

public class LocalTimeOperationsDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.parse("12:30").plusMinutes(10);
		System.out.println("12:30 plus 10 minutes: " + time);
		int hour = time.getHour();
		System.out.println(time + " hour: " + hour);
		long second = LocalTime.parse("00:30").toSecondOfDay();
		System.out.println("00:30 in seconds: " + second);
		LocalTime time1 = LocalTime.of(10, 30);
		LocalTime time2 = LocalTime.of(11, 45);
		boolean isBefore = time1.isBefore(time2);
		System.out.println("isBefore: " + isBefore);
	}

}
