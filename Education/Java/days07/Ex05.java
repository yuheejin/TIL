package Education.Java.days07;

public class Ex05 {
	public static void main(String[] args) {
		
//		// [정규표현식]
//		// 1. 주민등록번호 000000-0000000
//		// 	   resident registration number
//		String rrn = "123456-1234567";
//
//		String regex = "[0-9]{6}-\\d{7}";
//		// 숫자 [0-9]  \d
//		// 반복횟수 ?(0,1) +(1,여러번) *(0, 여러번)
//		// 				{n} : n번 와야함
//		//				{n,m} : n~m번 와야함
//		//				{n,} : n번 이상 와야함
//
//		if (rrn.matches(regex)) {
//			System.out.println("올바른 주민등록번호 형식");
//		} else {
//			System.out.println("잘못된 주민등록번호 형식");
//		} //if
		
		// 2. 우편번호 (구)000-000	(신)00000
//		String zipCode = "123-456";
//		String zipCode2 = "12345";
//		String zipCode3 = "123456";
//		String zipCode4 = "123-a56";
//		String zipCode5 = "123-3456";
		
		String [] zipCodes = {"123-456", "12345", "123456", "123-a56", "123-3456"};
		
		String regex = "\\d{3}-\\d{3}|\\d{5}";		// 문자열을 그대로 사용하기 때문에, 논리 연산자사이에 공백을 주면 안됨
		boolean flag = false;
		for (int i = 0; i < zipCodes.length; i++) {
			flag = zipCodes[i].matches(regex);
			System.out.printf("%s - %s 우편번호\n", zipCodes[i], flag? "올바른" : "잘못된");
		} //for

		
	} //main
} //class
