package Education.Java.days12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex02_02 {
	public static void main(String[] args) {
		// days08.Ex09_03.java 로또 코딩 예제
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 로또 게임 횟수 입력?  ");
		int gameCount = scanner.nextInt(); 
		int [][] lottos =new int [gameCount][6];

		for (int i = 0; i < gameCount; i++) {
			fillLotto(lottos[i]);
			dispLotto(lottos[i],i);
		} //for
		
		scanner.close();
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

	public static void dispLotto(int[] lotto, int gameCount) {
		System.out.printf("[%d 게임]\t", gameCount+1);
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d] ",lotto[i]);
		} //for
		System.out.println();
	} //dispLotto

} //class