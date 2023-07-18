package Education.Java.days04;

import java.util.Iterator;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 2:28:14
 * @subject 
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {

		/*
		 int sum = 0;
		 
		
		//for (int i = 1; i < 11; i++) {  // 조건식이 없기 때문에 무한루프를 돈다.
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d+",i);
			// The local variable sum may not have been initialized
			// 초기화 안했다는 경고문
			sum += i;
		} //for
		
		// Unreachable code
		// for문에 조건식이 없을 경우 나타나는 에러
		// for문을 빠져나갈수 없다.
		System.out.printf("\b=%d\n",sum);
		
		*/
		
		/*
		int sum = 0;
		// 초기식과 증감식은 여러개 사용 가능
		// 조건식은 참과 거짓 중 하나로만 나오면, 아무리 길어도 상관없음
		for (int i = 0, j=1, k=10;  i <= 10;  i++, j--, k+=2) {
			System.out.printf("%d+",i);
			sum += i;
		} //for
		
		System.out.printf("\b=%d\n",sum);
		*/
		
		// [문제] 1~10 합을 출력하세요.
		int sum = 0;
		for (int i = 0, j=1, k=10;  i <= 10;  i++, j--, k+=2) {
			System.out.printf("%d+",i);
			sum += i;
		} //for
		
		System.out.printf("\b=%d\n",sum);
		
	} // main

} // class