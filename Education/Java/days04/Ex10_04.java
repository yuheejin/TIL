package Education.Java.days04;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 4:17:58
 * @subject 컴퓨터 - 사용자(user) 가위,바위,보 게임
 * @content
 */
public class Ex10_04 {

	public static void main(String[] args) {

		int com, user;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");

			user = scanner.nextInt();
			com = (int) (Math.random() * 3) + 1;

			String[] rsp = {null, "가위", "바위", "보"};
			
			/*
			String[] rsp = new String[3];
			 
			rsp[0] = "";
			rsp[1] = "가위";
			rsp[2] = "바위";
			// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			// 배열의 범위를 벗어남. 배일의 크기를 늘려주어야 한다.
			rsp[3] = "보";
			*/
			
			//System.out.printf(">  컴퓨터: %s   user: %s\n", rsp[com-1], rsp[user-1]);
			System.out.printf(">  컴퓨터: %s   user: %s\n", rsp[com], rsp[user]);

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

			// scanner.close() 자동
		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	} // main

} // class