<<<<<<< HEAD
package days03;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오후 3:44:26
 * @subject (시험) 두 문자열 비교.
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// The value of the local variable name1 is not used
		String name1 = "홍길동", name2;		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("> 비교할 이름을 입력 ? ");		
		// String name2;
		name2 = scanner.next();
		
		// 디버깅  4:02 수업시작~ 
		System.out.printf("[%s]\n", name2);
		
		// System.out.println(  name1 == name2  );
		
		// (암기) 두 문자열을 비교할 때는 equals() 사용한다.
		System.out.println(  name1.equals( name2 )  );
		// 대소문자 구분하지 않고 문자열 비교
		System.out.println(  "keNik".equalsIgnoreCase( "KENIK" )  );


	} // main

} // class








=======
package Education.Java.days03;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 3:26:46
 * @subject (시험) 두 문자열 비교
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		//The value of the local variable name2 is not used
		// 선언했는데 왜 사용 안하니?
		String name1 = "홍길동", name2;
		Scanner scanner = new Scanner(System.in);
		System.out.print(">  비교할 이름을 입력? ");
		
		name2 = scanner.next();
		
		// 디버깅
		System.out.printf("[%s]\n", name2);
		
		// == 연산자는 주소를 비교하기 때문에 false를 반환
		// System.out.println( name1 == name2 );
				
		// 따라서 object 클래스에 있는 equals()을 오버라이딩하여 사용해야함
		// (암기) 두 문자열을 비교할 때는 equals() 사용한다.
		System.out.println( name1.equals(name2) );
		// 대소문자를 구분하지 않고 문자열 비교하는 함수 equalsIgnoreCase()
		System.out.println( name1.equalsIgnoreCase(name2) );
		System.out.println( "Heejin".equalsIgnoreCase("heejiN") );
		
	}//main
}//class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
