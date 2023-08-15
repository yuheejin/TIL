package Education.Java.days06;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 20. - 오후 12:06:54
 * @subject 정규표현식
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) {
		
		int n;
		
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("> 정수(n) 입력?  ");
			String inputData = scanner.next();
			
			// 비밀번호  8~15자리
			//			  숫자, 알파벳 대문자, 알파벳 소문자, 특수문자는 반드시 1개이상 사용
			// 정규표현식 만들어보기
			// String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()_+])[0-9A-Za-z!@#$%^&*()_+]{8,15}$";
			/*
			(?=.*[0-9]): 숫자가 적어도 하나 이상 포함
			(?=.*[A-Z]): 대문자 알파벳이 적어도 하나 이상 포함
			(?=.*[a-z]): 소문자 알파벳이 적어도 하나 이상 포함
			(?=.*[!@#$%^&*()_+]): 특수문자가 적어도 하나 이상 포함
			(?=.{8,15}): 전체 비밀번호 길이가 8에서 15자리 사이
			.*: 모든 문자열을 허용합니다.
			*/

			// 정규표현식 ( regular expression )
			// 0~9 숫자로만 이루어진 문자열 체크하는 정규표현식
			// "[0-9]*" : 숫자를 여러먼
			// "[0-9]+" : 숫자를 한번 이상
			// "^[^0-9]+$" : 시작부터 끝까지 숫자를 한번 이상
			
			// "^\\d+$" 과 "^[^0-9]+$" 은 같은 의미임
			// String regex = "^[^0-9]+$";
			
			// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
			// 문자열이라 \를 그대로 인식 못함 \\ 이와같이 사용해야함
			String regex = "^\\d+$";
			boolean flag = inputData.matches(regex);
			
			
			if ( flag ) {
				n = Integer.parseInt(inputData);
				System.out.println(n);
			} else {
				System.out.println("입력 잘못!!!");
			} //if
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch
		
	} //main
} //class
