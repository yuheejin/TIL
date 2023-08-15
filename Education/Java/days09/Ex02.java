package Education.Java.days09;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// 8일차 복습 - 6. 정수를 입력받아서 2진수로 출력하는 코딩을 하세요.
		
		//[3] 제어문 활용
		int n = 10;
		int share, reminder;
		int[] binarryArr = new int [32];
		int index = binarryArr.length-1;
		
		while (n!=0) {
			share = n/2;
			reminder = n%2;
			binarryArr[index--] = reminder;
			n = share;	
		}
		System.out.println(Arrays.toString(binarryArr).replace(", ", "") );

		/*
		// [2]
		int n =10;
		String b = Integer.toBinaryString(n);
		String s = String.format("%032d\n", Integer.parseInt(b));
		System.out.println(s);
		*/
		
		/*
		// [1]
		String s = "00000000000000000000000000000000";
		String b = Integer.toBinaryString(n);
		
		System.out.println( s.substring(b.length())+b );
		*/
		
	} //main
} //class