package Education.Java.days09;

public class Ex03_05 {
	public static void main(String[] args) {
		// [ 주민등록번호 ] ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
		// 1. 	생년월일
		// 2.	성별, 세기, 내국인/외국인
		// 3.	세는나이, 만나이
		// 4.	주민번호검증
		// ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
		// ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		//    = 11 - { (2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ+8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ) % 11 }
		String rrn = "(본인 주민등록번호 입력해보기)";
		boolean checkSum = checkRRN(rrn);

		if (checkSum)  System.out.println("올바른 주민등록번호");
		else  System.out.println("올바르지 않은 주민등록번호");
	} //main

	public static boolean checkRRN(String rrn) {
		int sum = 0;
		int term=0;

		for (int i = 0, j=2; i < rrn.length()-1; i++) {
			term = rrn.charAt(i) - '0';
			if(term == '-' - '0') continue;
			sum += j++ * term;
			if (j==10) j=2;
		} //for

		int check = (11-sum%11)%10;
		return (rrn.charAt(13) - '0')  == check;
	} //checkRRN

} //class
