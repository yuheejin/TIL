package Education.Java.days04;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 12:28:20
 * @subject switch 분기문
 * @content for 반복문
 */
public class Ex06_02 {

	public static void main(String[] args) {

		int sum = 0;

		//1+2+3+4+5+6+7+8+9+10=55
		for (int i = 1; i < 11; i++) {
			sum += i;

			System.out.printf( i==10 ? "%d=" : "%d+", i);

		} // for

		System.out.println(sum);

	} // main

} // class