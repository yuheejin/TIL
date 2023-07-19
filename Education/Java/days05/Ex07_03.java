package Education.Java.days05;

import java.io.IOException;

/**
 * @author heejin
 * @date 2023. 7. 19. - 오후 4:34:41
 * @subject while문과 do while문의 차이점
 * @content
 */
public class Ex07_03 {
	public static void main(String[] args) throws IOException {
		
		// 조건문 : if
		// 분기문 : switch
		// 반복문 : for,					 for each( 확장 for문 ) 배열, 컬렉션 반복처리
		// 기타 : break, continue
		// 조건반복문 : while, do~while
		
		// 1. 정수 10개 저장할 배열 m을 선언
		int [] m = new int[10];
		
		// 2. 임의의 정수 (1~100)를 각 배열의 요소에 저장
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*100+1);		//  0.0 <= Math.random() < 1.0
		} //for
		
		// 3. for문을 사용해서 각 배열의 요소를 출력
		/*
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\n", i, m[i]);
		} //for
		*/
		
		// for each 문 사용해서 출력
		// m[] 안에 있는 요소를 순서대로 i에 저장함
		for (int i : m) {
			System.out.println(i);
		}
		
		
		
	} // main
} // class