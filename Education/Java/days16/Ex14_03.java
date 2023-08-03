package Education.Java.days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 8. 3. - 오후 4:29:07
 * @subject	[ 중첩 try~catch문 설명 ]
 * @content
 */
public class Ex14_03 {
	public static void main(String[] args) {
		int a=0, b=0;
		
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		
		try {
			System.out.print("> a, b 두 정수 입력?  ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			try {
				double c = a/b;

				System.out.printf("%d / %d = %.2f\n", a, b, c);
				System.out.println("정상 종료~");
			} catch (ArithmeticException e) {
				System.out.println( e );
			} //try-catch

			System.out.println("종료~");
			
		} catch (InputMismatchException e) {
			System.out.println( "[1]\n" + e.toString() );
			System.out.println( "[2]\n" + e.getMessage() );
		} catch (Exception e) {		// 매개변수 다형성
			e.printStackTrace();
		} finally {
			try {} catch (Exception e2) {} // 어디든 올 수 있다.
			System.exit(-1);		// 프로그램 종료
		}
		
		
	} //main
} //class
