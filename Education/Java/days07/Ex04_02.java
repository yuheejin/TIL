package Education.Java.days07;

import java.util.Scanner;


public class Ex04_02 {
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
				System.out.printf("> [알림 %d] 1~3 사이의 값을 입력하세요.\n", falseCount);
				if (falseCount >= 5) {
					System.out.println("> 5번 이상 잘못 입력했습니다.");
					// break; //do~while을 빠져나감
					// return;	//프로그램 종료
					// System.exit(int status);	// int status는 프로세스가 종료하면서 넘겨주는 값임
					System.exit(-1);
				} //if
			}
			
			System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
			userInput = scanner.next(); 
			
			flag = true;
		} while (!userInput.matches(regex));
		
		if(falseCount<5) user = Integer.parseInt(userInput);
		System.out.println("end");
		
		// 스캐너 종료
		scanner.close();
		
		
	} //main
} //class
