package Education.Java.days06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("> 영어 이름 입력 ?  ");
			// 이름 사이에 공백을 주면 앞에 있는 문자열만 입력됨
			// String name = scanner.next();
			// 라인 자체를 문자열로 저장함
			String name = scanner.nextLine();

			// [1] String -> char [] 변환
			char [] nameArray = name.toCharArray();
			
			// [2] char [] -> String  변환
			name = String.valueOf(nameArray);
			
			System.out.println( Arrays.toString(nameArray));
			
			for (char i : nameArray) System.out.println(i);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} //main
} //class