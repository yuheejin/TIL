package Education.Java.days06;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 20. - 오후 12:06:54
 * @subject 제어문 활용
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		
		int n;
		
		try (Scanner scanner = new Scanner(System.in)) {
			// 문자X, 실수X, 정수 입력
			// 12a    3.14   1234
			System.out.print("> 정수(n) 입력?  ");
			String inputData = scanner.next();
			char [] idArray = inputData.toCharArray();
			
			boolean flag = false; 	// 숫자 X -> true
			
			for (int i = 0; i < idArray.length; i++) {
				if ( !('0' <= idArray[i] && idArray[i] <= '9') ) {
					flag = true;
					break;
				}
			} //for
		
			if ( !flag ) {		// flag == false
				n = Integer.parseInt(inputData);
				System.out.println(n);
			} else {
				System.out.println("입력 잘못!!!");
			} //if

			/*
			if ( flag ) {
				System.out.println("입력 잘못!!!");
			} else {
				n = Integer.parseInt(inputData);
				System.out.println(n);
			} //if
			*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch
		
	} //main
} //class