package Education.Java.days10;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex08 {
	public static void main(String[] args) {

		int[] score = new int[20];
		// 0~100 임의의 수
		Random rnd = new Random();
		for (int i = 0; i < score.length; i++) {
			score[i] = rnd.nextInt(101);
		} //for
		System.out.println( Arrays.toString(score) );
		
		// [1]
		int max, min;
		max=min=score[0];
		for (int i = 0; i < score.length; i++) {
			if(max < score[i]) max=score[i];
			else if(min > score[i]) min=score[i];
		} //for

//		// [2]
//		int max = IntStream.of(score).max().getAsInt();
//		int min = IntStream.of(score).min().getAsInt();
//		int sum = IntStream.of(score).sum();
//		double avg = IntStream.of(score).average().getAsDouble();
		
		// 출력
		System.out.printf("max : %d\tmin : %d\n", max,min);
	} //main
} //class