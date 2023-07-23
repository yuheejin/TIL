package Education.Java.days07;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 21. - 오전 9:46:37
 * @subject	
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {

		int com, user;

		try (Scanner scanner = new Scanner(System.in)) {

			boolean flag = false;
			String regex = "[1-3]";		// 1~3 값인가
			int failCount = 0;	// 입력 실패 횟수
			do {
				do {
					System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
					String userInput = scanner.next(); 

					// 입력값 유효성 확인
					if( userInput.matches(regex) ) user = Integer.parseInt(userInput);
					else { 
						failCount++;
						System.out.printf("< [알림] %d회 입력이 잘못되었습니다.",failCount);
						if (failCount==5) {
							System.out.println("프로그램 종료 : 5회 이상 잘못 입력");
							
						} //if
					}
				} while (flag);
				

				// 컴퓨터 값 : 1~3 랜덤 
				com = (int) (Math.random() * 3) + 1;

				// 컴퓨터와 user의 값 출력
				String[] rsp = {null, "가위", "바위", "보"};
				System.out.printf(">  컴퓨터: %s   user: %s\n", rsp[com], rsp[user]);

				// 게임 결과 출력
				switch (user - com) {
				case 1:
				case -2:
					System.out.println("사용자 승리");
					break;
				case 2:
				case -1:
					System.out.println("컴퓨터 승리");
					break;
				default:
					System.out.println("무승부");
					break;
				} // switch

				// y, Y 입력시 게임 재실행
				System.out.print("> 다시 게임을 실행하겠습니까?  ");
				char reInput = scanner.next().charAt(0);

				if ( Character.toUpperCase(reInput) == 'Y' ) flag = true;
				else {
					System.out.println("> end");
					flag = false;
				}

			} while (flag);

		} catch (Exception e) {
			e.printStackTrace();
		} // catch


		/*
		int com, user;

		try (Scanner scanner = new Scanner(System.in)) {

			boolean flag = false;
			// String regex = "[1-3]";		// 1~3 값인가
			String regex = "^[1-3]$";		// 처음부터 끝까지 1~3값인가
			do {
				System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");

				String userInput = scanner.next(); 

				// 입력값 유효성 확인
				if( userInput.matches(regex) ) user = Integer.parseInt(userInput);
				else { 
					System.out.println("< 입력이 잘못되었습니다.");
					flag = true;
					continue;
				}

				// 컴퓨터 값 : 1~3 랜덤 
				com = (int) (Math.random() * 3) + 1;

				// 컴퓨터와 user의 값 출력
				String[] rsp = {null, "가위", "바위", "보"};
				System.out.printf(">  컴퓨터: %s   user: %s\n", rsp[com], rsp[user]);

				// 게임 결과 출력
				switch (user - com) {
				case 1:
				case -2:
					System.out.println("사용자 승리");
					break;
				case 2:
				case -1:
					System.out.println("컴퓨터 승리");
					break;
				default:
					System.out.println("무승부");
					break;
				} // switch

				// y, Y 입력시 게임 재실행
				System.out.print("> 다시 게임을 실행하겠습니까?  ");
				char reInput = scanner.next().charAt(0);

				if ( Character.toUpperCase(reInput) == 'Y' ) flag = true;
				else {
					System.out.println("> end");
					flag = false;
				}

			} while (flag);

		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		 */


	} //main
} //class
