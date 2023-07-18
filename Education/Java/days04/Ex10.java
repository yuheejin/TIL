package Education.Java.days04;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 4:17:58
 * @subject  컴퓨터 - 사용자(user) 가위,바위,보 게임
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)
		// 컴퓨터는 1~3 임의의 수를 발생
		// 사용자는 1~3 정수를 Scanner 입력
		int com, user;	// com: 컴퓨터	user: 입력값
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print(">  user 가위(1), 바위(2), 보(3) 선택 ? ");
			// 입력 값에 대한 유효성 검사
			user = scanner.nextInt();
			com = (int)(Math.random()*3)+1;
			
			String[] rsp = {"가위l", "바위", "보"};
			
			// System.out.printf(">  컴퓨터: %d   user: %d\n", com, user);
			System.out.printf(">  컴퓨터: %s   user: %s\n", rsp[com-1], rsp[user-1]);
			
			/*						user - com
			 *  com/user	가위(1)		바위(2)		보(3)
			 *  가위(1)			0				1				2
			 *  바위(2)			-1				0				1
			 *  보(3)				-2				-1				0
			 *  
			 */
			
			switch (user-com) {
			case 1: case -2:
				System.out.println("사용자 승리");
				break;

			case -1: case 2:
				System.out.println("사용자 승리");
				break;

			default:
				System.out.println("무승부");
				break;
			} //switch
			
			
			// scanner.close() 자동
		} catch (Exception e) {
			
		} //try catch
		
		
		
	} // main

} // class