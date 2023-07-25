package Education.Java.days09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03_02 {
	public static void main(String[] args) {
		String rrn = "991023-1700001";
		int age = 0;
		// 주민등록번호 -> 나이
		// 세는나이  countingAge
		age = getCountingAge(rrn);
		System.out.println("> 세는나이 : " + age);

		// 만  나이  AmericanAge
		age = getAmericanAge(rrn);
		System.out.println("> 만 나이 : " + age);

		// 				2019.12.31		2020.1.1	2020.12.31		2021.1.1
		// 세는나이 : 	1살					2살				2살					3살
		// 만  나이 : 	0살					0살				1살					1살

	} //main


	public static int getAmericanAge(String rrn) {
		// 생일이 오늘날짜 지남 여부 체크
		// 생일이 지나지 않았다면 -1
		// 만나이 = 올해년도 - 생일년도 - 1(O, X)
		// 		   = 세는나이 -1          생일(-1)?
		int birthMMdd = Integer.parseInt( getBirth(rrn).substring(4).replace(".", "") );
		
//		//[1] Calendar 클래스 사용 월/일
//		Calendar c = Calendar.getInstance();
//		// 년도 = c.get(Calendar.YEAR)
//		int thisMonth = c.get(Calendar.MONTH);	// 7
//		int thisDay = c.get(Calendar.DATE);			// 25
//		int thisMMdd = thisMonth*100+thisDay;		// 725
		
//		//[2] Date 클래스 사용 월/일
//		Date d = new Date();
//		// 년도 d.getYear() + 1900
//		// d.getMonth() <-- 1월(0)  12월(11)
//		// d.getMonth() + 1
//		int thisMonth = d.getMonth() + 1;	// 7
//		int thisDay = d.getDate();			// 25
//		int thisMMdd = thisMonth*100+thisDay;		// 725
		
		
		//[3] SimpleDataFormat
		Date d = new Date();
		String pattern = "MMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		int thisMMdd = Integer.parseInt(sdf.format(d));
		
		//[4] LocalDate 클래스 사용
		// 2023.1.23 <-- 1999.1.23
		// 2023.7.25
		// 날짜와 날짜를 비교
		// https://hajoung56.tistory.com/67 참고

		boolean flag = (thisMMdd - birthMMdd >= 0);
		return getCountingAge(rrn)-1 + (flag? 0 : -1);
	} //getAmericanAge


	public static int getCountingAge(String rrn) {
		// 올해 2023년도
		//		// [1]
		//		Calendar c = Calendar.getInstance();
		//		int thisYear =  c.get(Calendar.YEAR);
		
		//[2]
		Date d = new Date();
		int thisYear = d.getYear() + 1900; // getYear()에 취소선이 있는 이유는 곧 없어질 함수이기 때문임

		// 생일 1999년
		int bithYear = Integer.parseInt(getBirth(rrn).substring(0, 4));

		// 세는나이 = 올해년도 - 생일년도 +1
		return thisYear - bithYear + 1;
	} //getCountingAge


	// gender
	public static int getGender(String rrn) {
		//return Integer.parseInt(rrn.substring(7,8));
		return rrn.charAt(7) - '0';
	} //getGender


	// yyyy-MM-dd
	// month를 mm으로 표기 하면 시분초의 mm과 혼동이 있어서 MM으로 표기함
	public static String getBirth(String rrn) {
		int year = Integer.parseInt(rrn.substring(0,2));
		int month = Integer.parseInt(rrn.substring(2,4));
		int day = Integer.parseInt(rrn.substring(4,6));

		int gender = getGender(rrn);
		int centry = 1800;
		switch (gender) {
		case 1: case 2: case 5: case 6:
			centry = 1900;
			break;
		case 3: case 4: case 7: case 8:
			centry = 2000;
			break;
		case 9: case 0:
			centry = 1800;
			break;
		} //switch

		year = centry + year;

		return String.format("%s.%s.%s", year, month, day);
	} //getBirth
} //class