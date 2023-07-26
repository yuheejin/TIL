package Education.Java.days10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex02 {
	public static void main(String[] args) {
		getTotalDays(2023,7,1);
	} //main

	private static int getDayOfWeek(int year, int month, int day) {
		// 날짜, 시간, 기능(일, 함수, 메서드) 구현된 클래스
		// jdk1 		java.util.Date
		// jdk1.1 	Calendar
		// jdk1.8		LocalData, LocalTime, LocalDateTime
		LocalDate d = LocalDate.of(year, month, day);
		DayOfWeek w = d.getDayOfWeek();
		// 1(월) 2(화) 3(수) ....6(토) 7(일)
		return w.getValue()%7;
	} //getDayOfWeek

	private static int getTotalDays(int year, int month, int day) {
		LocalDate startDate = LocalDate.of(1, 1, 1);
		LocalDate endDate = LocalDate.of(year, month, day);

		int totalDays = (int) startDate.until(endDate,ChronoUnit.DAYS) + 1;	//일수
		//		startDate.until(endDate,ChronoUnit.MONTHS);	//개월수
		//		startDate.until(endDate,ChronoUnit.YEARS);	//년수

		return totalDays;
	} //getTotalDays
	
	private static int getLastDay(int year, int month) {
		LocalDate d = LocalDate.of(year, month, 1);
		LocalDate lastDate = d.withDayOfMonth(d.lengthOfMonth());
		
		return lastDate.getDayOfMonth(); // 마지막 날짜 객체로부터 일만 얻어오겠다.
	} //getLastDay


} //class