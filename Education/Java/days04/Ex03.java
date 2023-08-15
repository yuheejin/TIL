package Education.Java.days04;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오전 10:48:15
 * @subject 제어문
 * @content
 */
public class Ex03 {

	public static void main(String[] args)  {
		
		// 제어문
		// 1. 정의 : 프로그램의 실행 순서를 제어하는 문
		//				(건너띄기, 반복 처리 등등)
		// 2. 종류
		//		1) 조건문		if, ifelse, ifelseif... else
		//		2) 분기문		switch
		//		3) 반복문		for, foreach
		//		4) 조건반복문	do~while, while
		//		5) 기타		break, continue
		
		// condition(조건식) : 참/거짓 판가름할 수 있는 식
		// boolean
		/*  if문 형식
		if (condition) {
			// 조건식이 참일 때만 { } 실행
		} //if
		*/
		
		
		// 정수를 입력받아서 n 변수에 저장하고 출력
		// 입력받은 값이 짝수이면 짝수라고 출력
		// sc.close();를 하지 않아도 자동으로 사용하던 리소스를 반환한다.
		// try catch문
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("> 정수 입력? ");
			
			// int가 아닌 값이 들어올수도 있으니
			// 입력값에 대한 유효성 검사가 필요함 *** 코드 추가해보기
			int n = sc.nextInt();
			
			
			if (n%2 == 0) {
				System.out.printf("n= %d 짝수(even nuber)", n);
			} //if
			
			if (n%2 != 0) {
				System.out.printf("n= %d 홀수(odd nuber)", n);
			} //if
						
		} catch (Exception e) {
		} //catch
		
	} //main

} //class
