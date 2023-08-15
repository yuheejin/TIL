package Education.Java.days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		int a=0, b=0;
		
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		
		// 1 a 입력시 예외발생
		// JVM의 예외처리기에 의해서
		// InputMismatchException 예외 객체 생성 -> 개발자 파악 처리
		// 예외 발생시, 예외 발생한 라인 아래부분은 실행하지 않고, catch문으로 넘어감
		try {
			System.out.print("> a, b 두 정수 입력?  ");
			a = scanner.nextInt();
			b = scanner.nextInt();

			double c = (double)a/b;

			System.out.printf("%d / %d = %.2f\n", a, b, c);
			System.out.println("정상 종료~");
			
			// 다중 catch문
			// (주의사항) 부모에 해당되는 예외 객체를 맨 마지막에 써야함
			// JDK 1.7 ~멀티 catch문
		} catch (InputMismatchException e) {
			System.out.println("> [알림] 정수만 입력 하세요...");
			// System.exit(-1); 		// 프로그램 종료
		} catch (ArithmeticException e) {
			System.out.println("> [알림] 0으로 나눌 수 없습니다.");
			// System.exit(-1);		// 프로그램 종료
		} catch (Exception e) {
			// 모든 예외의 최상위 예외는 Exception이다.
			e.printStackTrace();
			// System.exit(-1);		// 프로그램 종료
		} finally {
			// 예외 발생 유무에 상관없이 처리할 구문
			System.exit(-1);		// 프로그램 종료
		}
		
		
		
		/*
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
		*/
	} //main
} //class
