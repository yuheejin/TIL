package Education.Java.days08;

import java.util.Random;

/**
 * @author heejin
 * @date 2023. 7. 24. - 오후 2:13:41
 * @subject	재귀함수
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		// 로또 6/45
		// 1~45 정수를 6개 출력
		// Random rnd = new Random();
		// rnd.nextInt(45)+1
		
		int [] lottoNumber =new int [6];
		for (int i = 0; i < 6; i++) {
			lottoNumber[i] = (int)(Math.random()*45) +1;
			System.out.println(lottoNumber[i]);
		} //for
		
		
	} //main
	
} //class