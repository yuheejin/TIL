package Education.Java.days05;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// [문제1] 한 라인에 10개씩 출력
		// ASCII 256가지
		// 0~31 제어문자 : 화살표, 백스페이스
		// 제어문자이기 때문에 print해도 출력되는 것이 없음

		// ASCII 10 개행 '\n' LineFeed (LF) 새줄이동
		// ASCII 13 개행 '\r' CarrageReturn (CR)

		/*
		 * // 한줄에 10개씩 출력하기 for (int i = 0; i < 256; i++) { System.out.printf("[%c]",i,
		 * (char)i); if ( i%10 == 9 ) System.out.println(); } //for
		 */

		/*
		 * // 10줄 출력하고 멈추고, 라인번호 매기기 int lineNum = 1; System.out.printf("%02d line : ",
		 * lineNum);
		 * 
		 * for (int i = 0; i < 256; i++) { // System.out.printf("%d - %c\n",i, (char)i);
		 * System.out.printf("[%c]",i, (char)i);
		 * 
		 * if ( i%10 == 9 ) { if(lineNum == 10) break;
		 * System.out.printf("\n%02d line : ", ++lineNum); } //if
		 * 
		 * } //for
		 */

		/*
		 * // 10줄 출력하고 멈추고, 라인번호 매기기 for (int i = 0, lineNum = 1; i < 256; i++) { if (i
		 * % 10 == 0) System.out.printf("%02d : ", lineNum++);
		 * 
		 * System.out.printf("[%c]", i, (char) i);
		 * 
		 * if (i % 10 == 9) { if (lineNum == 11) break; System.out.println(); } // if }
		 * // for
		 */

		// 10줄 출력 후 엔터 입력되면 다시 10줄 출력
		try (Scanner scanner = new Scanner(System.in)) {
			
			for (int i = 0, lineNum = 1; i < 256; i++) {
				if (i % 10 == 0)  System.out.printf("%02d : ", lineNum++);

				System.out.printf("[%c]", i, (char) i);

				if (i % 10 == 9) {
					if (lineNum % 10 == 1) {
						System.out.println("\n> 추가 확인 Ent 입력");
						String input = scanner.nextLine();
						if (input.isEmpty())  continue;
					} // if
					System.out.println();
				} // if
			} // for
			
			System.out.println("\nend ------------");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	} // main
} // class
