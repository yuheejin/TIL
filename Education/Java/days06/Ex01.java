package Education.Java.days06;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		
		// 문제 1
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print(">  a, b, c 세 정수 입력 ?   ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			int min = Math.min(a, b);
			min = Math.min(min, c);

			int max = Math.max(a, b);
			max = Math.max(max, c);
			
			
//			// 삼항연산자
//			int max = a>b ? (a>c ? a : c) : (b>c ? b : c) ;
			

			int mid = 0;
			if (min == a) {
				if (max == b)  mid = c;
				else mid = b;
			} else if (min == b) {
				if (max == a)  mid = c;
				else mid = c;				
			} else {
				if (max == a)  mid = b;
				else mid = a;		
			}
			System.out.printf("min : %d,   mid : %d,   max : %d \n", min, mid, max);


		} catch (Exception e) {
			e.printStackTrace();
		}


		/*
		// 문제 2
		int[] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*10+5);
			System.out.printf("m[%d] : %d\n", i, m[i]);
		} //for
		 */

		/*
		// 문제 3
		try {

			System.out.print("> 한 문자 입력 ?  ");
			char one = (char) System.in.read();
			System.out.printf("one = '%c'\n", one);

			System.in.skip(System.in.available());
			System.out.println("> 한 문자 입력 ?  ");
			one = (char) System.in.read();
			System.out.printf("one = '%c'\n", one);

		} catch (Exception e) {
			e.printStackTrace();
		}
		 */

		/*
		// 문제 4
//		int lineNum = 1;
//		
//		for (int i = 'A', len = 'Z'; i <= len; i++) {
//			System.out.printf("%c(0%02d)", i, i);
//			if (lineNum++ %10 == 0)  System.out.println();
//		} //for
//		
//		for (int i = 'a', len = 'z'; i <= len; i++) {
//			System.out.printf("%c(%02d)", i, i);
//			if (lineNum++ %10 == 0)  System.out.println();
//		} //for
		
		int lineNum = 1;
		for (int i = 'A', len = 'z'; i <= len; i++) {
			System.out.printf("%c(%03d)", i, i);
			if (lineNum++ %10 == 0)  System.out.println();
			if (i == 'Z') i = 'a'-1;
		} //for
		*/
		

		/*
		// 문제 5
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("> 두 정수 x, y 입력 ?  ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			int max = Math.max(x, y);
			int min = Math.min(x, y);
			if (min%2!=0)  min++;

			int sum = 0;
			for (int i = min; i < max; i+=2) {
				sum += i;
				System.out.printf("%d+",i);
			} //for

			System.out.printf("\b=%d",sum);

		} catch (Exception e) {
			e.printStackTrace();
		}
		 */

		/*
		// 문제 6
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("> 영어 이름 입력 ?  ");
			String name = scanner.next();

			char [] nameArray = name.toCharArray();
			
			for (char i : nameArray) {
				System.out.println(i);
				
			} //for

		} catch (Exception e) {
			e.printStackTrace();
		}
		*/

	} //main	
} // class
