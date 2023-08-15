package Education.Java.days07;

import java.util.Scanner;


public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String userInput=null;				// 입력받은 값
		String regex = "[1-3]";		// 정규표현식
		boolean flag=false;			// 정규표현식 확인 결과
		int falseCount = 0;			// 잘못 입력한 횟수
		int user;
		
		do {
			if (flag) {
				falseCount++;
				if (falseCount >= 5) {
					System.out.println("> 5번 이상 잘못 입력했습니다.");
					break;
				} //if
				System.out.println("> 1~3 사이의 값을 입력하세요.");
			}
			
			System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
			userInput = scanner.next(); 
			
			flag = true;
		} while (!userInput.matches(regex));
		
		if(falseCount<5) user = Integer.parseInt(userInput);
		System.out.println("end");
		
		// 스캐너 종료
		scanner.close();
		
//		
//		Scanner scanner = new Scanner(System.in);
//				
//		String userInput;				// 입력받은 값
//		String regex = "[1-3]";		// 정규표현식
//		boolean flag;					// 정규표현식 확인 결과
//		do {
//			System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
//			userInput = scanner.next(); 
//			
//			flag = userInput.matches(regex);
//			if (!flag)  System.out.println("> 1~3 사이의 값을 입력하세요.");
//		} while (!flag);
//		
//		int user = Integer.parseInt(userInput);
//		System.out.println("end");
//		
//		// 스캐너 종료
//		scanner.close();
		
		/*
		// 대문자로 변경하는 메소드
		System.out.println(Character.toUpperCase('y'));
		// 소문자로 변경하는 메소드
		System.out.println(Character.toLowerCase('Y'));
		
		System.out.println("aBc".toUpperCase());
		System.out.println("aBc".toLowerCase());
		 */
	} //main
} //class
