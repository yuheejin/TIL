package Education.Java.days11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// days08.Ex09_03.java 로또 코딩 예제
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 로또 게임 횟수 입력?  ");
		int gameCount = scanner.nextInt(); 
		int [][] lottos =new int [gameCount][6];

		for (int i = 0; i < gameCount; i++) {
			fillLotto(lottos, i);
			dispLotto(lottos, i);
		} //for
		
		scanner.close();
	} //main

	// 중복되지 않는 로또번호로 배열을 채우도록 코딩
	private static void fillLotto(int[][] lottos, int gameCount) {
		int len = lottos[gameCount].length;
		int randData = 0;
		int index = 0;

		while ( index < len ) {			
			randData = (int)(Math.random()*45) +1;
			// isDuplicateLotto() 중복이 되면 true, 중복안되면 false
			if ( !isDuplicateLotto(lottos, gameCount, randData, index) )
				lottos[gameCount][index++] = randData;
		} //while
	} //fillLotto

	public static boolean isDuplicateLotto(int[][] lottos, int gameCount, int randData, int index) {
		for (int i = 0; i < index; i++) {
			if (lottos[gameCount][i] == randData)  return true;
		} //for
		return false;
	}

	public static void dispLotto(int[][] lottos, int gameCount) {
		int len = lottos[gameCount].length;
		System.out.printf("[%d 게임]\t", gameCount+1);
		for (int i = 0; i < len; i++) {
			System.out.printf("[%d] ",lottos[gameCount][i]);
		} //for
		System.out.println();
	} //dispLotto

} //class