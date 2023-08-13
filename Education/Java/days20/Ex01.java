package Education.Java.days20;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Date;
import java.util.Scanner;

/* 1.  년도 year를 입력받아서 
    입력받은 년도의 1월~12월 까지의 마지막 날짜를 출력하는 코딩을 하세요. 
    ( 조건 : Date 클래스 사용 )
    ( 조건 : Scanner 클래스 사용 + try~with~resource문 사용)
    
    실행결과 예제)
    2005년 
    
	1월 : 31일
	2월 : 28일
	3월 : 31일
	4월 : 30일
	5월 : 31일
	6월 : 30일
	7월 : 31일
	8월 : 31일
	9월 : 30일
	10월 : 31일
	11월 : 30일
	12월 : 31일
*/


public class Ex01 {
	public static void main(String[] args) {
		int year=0;
		
		try ( Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 년도 입력?  ");
			String input = scanner.next();
			
			if(input.matches("\\d{0,4}")) year = Integer.parseInt(input);
			else throw new Exception("년도를 잘못 입력했습니다.");
			
			System.out.println(year+"년");
			for (int i = 1; i <= 12; i++) {
				System.out.printf( "%d월 : %d일\n", i, getLastOfDay(year, i) );
			} // for
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	} //main

	private static int getLastOfDay(int year, int month) {
		Date d = new Date(year-1900, month, 1);
		int day = d.getDate()-1;
		d.setDate(day);		
		return d.getDate();
	} //getLastOfDay
	
} //class