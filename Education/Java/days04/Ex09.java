package Education.Java.days04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		// Ex04_02
		// 국어점수를 입력받아서
		// 수우미양가 등급 출력
		// if문 => switch문 변경

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("> 국어 점수 ?");
			int kor = sc.nextInt();

			char grade = '가';

			switch (0 <= kor && kor <= 100 ? 1 : 0) {
			case 1:
				// 수우미양가 등급
				switch (kor / 10) {
				// Multi-constant case labels supported from Java 14 onwards only
				// 아래 문법은 JDK14부터 사용 가능함
				// case 10,9:
				case 10:
				case 9:
					grade = '수';
					break;
				case 8:
					grade = '우';
					break;
				case 7:
					grade = '미';
					break;
				case 6:
					grade = '양';
					break;
				} // switch

				System.out.printf("grade = %d(%c)\n", kor, grade);
				break;

			default:
				System.out.println("국어 점수 입력이 잘못되었습니다.");
				break;
			} // switch

		} catch (Exception e) {
			// try 문에서 오류가 났을때, 에러 문구 출력함
			e.printStackTrace();
		} // try catch

	} // main

} // class