package Education.Java.days05;

import java.io.IOException;

/**
 * @author heejin
 * @date 2023. 7. 19. - 오후 4:34:41
 * @subject while문과 do while문의 차이점
 * @content
 */
public class Ex07_02 {
	public static void main(String[] args) throws IOException {

		int i = 10;
		while (i < 2) {
			
		} //while
		
		
		// 최소한 한번은 실행 시키고 싶을때 사용
		do {
			System.out.println("B");
		} while (i < 2);
		
	} // main
} // class