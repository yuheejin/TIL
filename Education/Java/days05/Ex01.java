package Education.Java.days05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		// return 과 break
		// return : 함수 종료		break : 제어문 종료
		System.out.println("a");
		System.out.println("b");
		if (조건식) return;	// 조건식이 참이면 main 함수 종료
		System.out.println("c");
		*/
		
		
		/*
		// switch 문에서 case옆 value에 올수있는 것
		int a = 0;
		final int  B = 1;
		
		switch (key) {
		case a: <- 불가능
			break;
		case B: <- 상수이기 때문에 가능
			break;
		case "" : <- 문자열 가능
			break;
		default:
			break;
		} //switch
		*/
		
		
		/*  
		// 1+2+3+..+9+10=55 출력
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.printf("%d+",i);
		} //for
		
		System.out.printf("\b=%d\n",sum);
		
		
		// 10+9+8+...+2+1=55 출력
		int sum = 0;
		for (int i = 10; i > 0; i--) {
			sum += i;
			System.out.printf("%d+",i);
		} //for
		
		System.out.printf("\b=%d\n",sum);
		*/
		
		/*
		// "01 - 헬로우 월드"  형식으로 출력
		//								0			
		// %[argument_index$][flags][width][.precision]conversion
		for (int i = 1; i < 11; i++) {
			System.out.printf("%02d - 헬로우 월드\n",i);
		} //for
		*/
		
		
		/*
		// 한 문자를 입력받아서
   		// 숫자, 알파벳(대,소문자), 한글, 특수문자(#$!%@)
   		// 입니다라고 출력하세요.
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 한 문자를 입력?  ");
			String st = scanner.next();
			
			char[] stt = st.toCharArray();
			if ( 0 <= stt[0] && stt[0] <= 9 )
				System.out.println("숫자 입니다.");
			else if ('a' <= stt[0] && stt[0] <='z' || 'A' <= stt[0] && stt[0] <='Z')
				System.out.println("알파벳(대, 소문자) 입니다.");
			// 완성형 한글 한문자
			else if ('가' <= stt[0] && stt[0] <='힣')
				System.out.println("한글 입니다.");
			else if ('#' == stt[0] || '$' == stt[0]  || '!' == stt[0] || '%' == stt[0]  || '@' == stt[0] )
				System.out.println("특수문자(#$!%@) 입니다.");
						
			
		} catch (Exception e) {
		}
		*/
		
		/*
		// 컴퓨터와 사용자 가위바위보 게임 구현.
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 가위(1), 바위(2), 보(3) 중 하나를 정수로 입력?");
			int user = scanner.nextInt();
			int com = (int)(Math.random()*3+1);
			
			String [] rsp = {"가위", "바위", "보"};
			System.out.printf("com : %s,   user : %s\n", rsp[com-1], rsp[user-1]);
			
			switch (com-user) {
			case 1: case -2:
				System.out.println("컴퓨터 승리");
				break;
			case -1: case 2:
				System.out.println("사용자 승리");
				break;
			default:
				System.out.println("무승부");
				break;
			} //switch
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	} // main
} // class
