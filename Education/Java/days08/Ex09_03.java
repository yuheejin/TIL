package Education.Java.days08;

import java.util.Random;

public class Ex09_03 {
	public static void main(String[] args) {
		int [] lotto =new int [6];
		fillLotto(lotto);
		dispLotto(lotto);

	} //main


	// 중복되지 않는 로또번호로 배열을 채우도록 코딩
	private static void fillLotto(int[] lotto) {
		int len = lotto.length;
		int randData = 0;
		int index = 0;

		while ( index < len ) {			
			randData = (int)(Math.random()*45) +1;

			// isDuplicateLotto() 중복이 되면 true, 중복안되면 false
			if ( !isDuplicateLotto(lotto, randData, index) )
				lotto[index++] = randData;
		} //while
	} //fillLotto


	public static boolean isDuplicateLotto(int[] lotto, int randData, int index) {
		for (int i = 0; i < index; i++) {
			if (lotto[i] == randData)  return true;
		} //for
		return false;
	} //isDuplicateLotto


	public static void dispLotto(int[] lotto) {
		int len = lotto.length;
		for (int i = 0; i < len; i++) {
			System.out.printf("lotto[%d] = [%d]\n",i+1, lotto[i]);
		} //for
	} //dispLotto

} //class