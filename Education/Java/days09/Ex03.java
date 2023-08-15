package Education.Java.days09;

public class Ex03 {
	public static void main(String[] args) {
		// [ 주민등록번호 ] ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
		// 		주민등록번호(住民登錄番號, 영어: Resident Registration Number, RRN)
		// 1. 	생년월일
		// 2.	성별, 세기, 내국인/외국인
		// 3.	세는나이, 만나이   Ex03_02
		// 4.	주민번호검증  		Ex03_03
		String rrn = "890123-1700001";

		String birthday = getBirth(rrn);

		System.out.println(birthday);
	} //main

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
		String bitrhday = String.format("%s.%s.%s", year, month, day);
		System.out.println(bitrhday);

		return null;
	} //getBirth
} //class
