package localdatedemo;

import java.time.LocalDate;

public class LocalDateArithmeticDemo {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2019-07-15");
		LocalDate date2 = date1.plusDays(5);
		System.out.println(date1 + " + 5 days: " + date2);
		date2 = date1.plusWeeks(2);
		System.out.println(date1 + " + 2 weeks: " + date2);
		date2 = date1.minusMonths(6);
		System.out.println(date1 + " - 6 months: " + date2);
		date2 = date1.minusYears(4);
		System.out.println(date1 + " - 4 years: " + date2);
		date2 = date1.withMonth(2);
		System.out.println(date1 + " with month 2: " + date2);
		date2 = date1.withDayOfMonth(24);
		System.out.println(date1 + " with day of month 24: " + date2);
		date2 = date1.withYear(2014);
		System.out.println(date1 + " with year 2014: " + date2);
		date2 = date1.withDayOfYear(42);
		System.out.println(date1 + " with day of year 42: " + date2);
	}

}
