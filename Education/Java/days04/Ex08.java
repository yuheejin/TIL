package Education.Java.days04;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 3:12:09
 * @subject switch 분기문
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {

		// if 조건문
		// for 반복문
		// switch 분기문

		// key : 변수, 수식 (정수, 문자열, 문자) 가능
		// value : 리터럴O, 변수X
//		switch (key) {
//		case value:
//			
//			break;
//
//		[default:
//			break;]
//		} // switch

		// 정수를 입력받아서 짝수, 홀수 출력 - if / ifelse 문
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("> 정수 입력? ");
			int n = sc.nextInt();
			
			String result = null;
			switch ( n%2 ) {
			case 0:
				result = "짝수";
				break;
			case 1:
				result = "홀수";
				break;
			} //switch
			
			// The local variable result may not have been initialized
			// result 변수를 초기화 하지 않음
			System.out.println(result);

		} catch (Exception e) {
		} // catch

		System.out.println("end");

	} // main

} // class