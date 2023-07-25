package Education.Java.days08;

import java.util.Random;

public class Ex09_02 {
	public static void main(String[] args) {
		// 로또 6/45
		// 1~45 정수를 6개 출력
		// Random rnd = new Random();
		// rnd.nextInt(45)+1
		
		// 배열 선언 및 생성
		// 배열을 초기화하지 않으면 int의 0으로 초기화 됨
		int [] lotto =new int [6];
		
		// lotto 배열에 값을 채우는 fillLotto() 함수 선언 + 호출
		fillLotto(lotto);
		
		// lotto 배열을 출력하는 dispLotto() 함수 선언 + 호출
		dispLotto(lotto);
		
		
	} //main
	

	// 중복되지 않는 로또번호로 배열을 채우도록 코딩
	// while 중복되지 않게 6개 배열을 다 채울때까지...
	private static void fillLotto(int[] lotto) {
		int len = lotto.length;
		int randData = 0;
		int index = 0;
		boolean flag;	// 로또번호가 중복이 되면 true 할당
		
		while ( index < len ) {
			flag = false;
			
			randData = (int)(Math.random()*45) +1;
			
			// 중복 확인
			for (int i = 0; i < index; i++) {
				if (lotto[i] == randData) {
					flag = true;
					break;
				}
			} //for
			
			if (!flag) lotto[index++] = randData;
			
		} //while
			
	} //fillLotto

	
	public static void dispLotto(int[] lotto) {

		int len = lotto.length;
		for (int i = 0; i < len; i++) {
			System.out.printf("lotto[%d] = [%d]\n",i+1, lotto[i]);
		} //for
	} //dispLotto
	
} //class