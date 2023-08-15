package Education.Java.days05;

public class Ex05 {
	public static void main(String[] args) {

		// 조건문 : if
		// 분기문 : switch
		// 반복문 : for, for each( 확장 for문 )
		// 기타 : break, continue
		// 조건반복문 : while, do~while

		/* 컬랙션 collection 
		// [ 열거자 ] 반복해서 처리
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();

		}
		 */

		/* [ 반복자 ] 반복해서 처리
		while (it.hasNext()) {
			type type = (type) it.next();

		}
		 */

		/*
		while (condition) {
			// 조건식이 참이면 반복해서 {} 블럭 실행
			// 조건식이 참일 동안 반복해서 {} 블럭 실행
		} //while
		 */

		// for 반복문과 while 조건반복문의 차이점
		// for문 - 반복횟수가 정해져 있을때
		// while문 - 반복조건이 정해져 있을때

		// [문제] 1~10까지의 합 (while 문)
		/* [1]
		int i = 1, sum=0;
		while (i <= 10) {
			System.out.printf("%d+",i);
			// sum +=1++;
			sum +=1;
			i++;
		}
		System.out.printf("\b=%d\n", sum);
		 */

		/*
		// [2]
		int i = 0, sum=0;

		while (i < 10) {
			i++;
			System.out.printf("%d+",i);
			sum +=1;
		} //while

		System.out.printf("\b=%d\n", sum);
		 */

		
		// [3]
		int i = 0, sum=0;

		while (++i <= 10) {
			System.out.printf("%d+",i);
			sum +=1;
		} //while

		System.out.printf("\b=%d\n", sum);
		
		





	} // main
} // class