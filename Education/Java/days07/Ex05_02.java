package Education.Java.days07;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 21. - 오전 11:45:30
 * @subject	
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) {
		// 국어점수(kor)을 입력받아서
		// 0<= <=100
		// 올바른 국어 점수, 잘못된 국어점수 출력...

		//String regex = "[0-9]{1,3}";		// 255 를 입력해도 true
		//String regex = "[0-9]{1,2}|100";	// 09 를 입력해도 true
		//String regex = "[0-9]|[1-9][0-9]|100";
		String regex = "[1-9]?[0-9]|100";	//	[1-9]? : 1~9가 와도 안와도 상관 없음
		
		String kor = null;
		boolean failFlag = false;
		int failCount=0;
		try (Scanner scanner=new Scanner(System.in)) {

			do {
				System.out.print("> 국어점수를 입력 ?  ");
				kor = scanner.next();
				failFlag = kor.matches(regex);

				if (!failFlag) {
					failCount++;
					System.out.printf("> [알림] %s : %d회 잘못 입력했습니다. (0~100)  \n\n", kor, failCount);
					if (failCount == 5) {
						System.out.println("> [프로그램 종료] 5회 이상 잘못 입력");
						return;
					} //if 5회이상 프로그램종료
				} //if 잘못 입력 알림
			} while ( !failFlag );

			System.out.printf("> %s 는 올바른 국어점수 입니다.\n" , kor);	
			System.out.println("> [프로그램 종료]");

		} catch (Exception e) {
			e.printStackTrace();
		}


	} //main
} //class
