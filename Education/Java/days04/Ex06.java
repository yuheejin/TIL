package Education.Java.days04;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 12:28:20
 * @subject switch 분기문
 * @content for 반복문
 */
public class Ex06 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum += i;

			if (i == 10) {
				System.out.printf("%d=", i);
				break;
			} // if

			System.out.printf("%d+", i);

		} // for

		System.out.println(sum);

	} // main

} // class