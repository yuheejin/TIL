package Education.Java.days04;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오전 10:48:15
 * @subject 제어문
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args)  {

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("> 정수 입력? ");
			int n = sc.nextInt();
			
			/*
			if (n%2 == 0) {
				System.out.printf("n= %d 짝수(even nuber)", n);
			} else {
				System.out.printf("n= %d 홀수(odd nuber)", n);
			} //if else
			*/
			
			String result = "짝수(even number)";
			if (n%2 != 0) {
				result = "홀수(odd nuber)";
			} //if
			
			System.out.printf("n= %d %s", n,result);
			
		} catch (Exception e) {
		} //catch
		
	} //main

} //class