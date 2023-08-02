package Education.Java.days15;

import static java.lang.Math.random;

public class Ex06 {
	public static void main(String[] args) {
		/*
		 * 1. 패키지(package)
		 * 		1) 서로 관련있는 클래스들, 인터페이스들의 묶음
		 * 		2) 클래스를 효율적으로 관리할 수 있다.
		 * 			예) java.io 패키지 - 서로 관련된 클래스
		 * 						input/output 입출력
		 * 		3) 클래스의 이름이 충돌하는 것을 막아준다.
		 * 			다른 개발자가 구현한 클래스 라이브러리의 클래스와 이름이 충돌되는 것을 피할 수 있다.
		 * 		4) 자신만이 사용할 패키지 체계가 있어야 한다.
		 * 			예) 도메인명 : naver.com  sist.org
		 * 		5) 클래스 -> 물리적으로 ???.class (클래스 파일)
		 * 			패키지 -> 물리적으로 디렉토리 생성
		 * 			예) java.lang.System 클래스
		 * 				java 폴더
		 * 					ㄴ lang 폴더
		 * 						 	ㄴ System.class 파일
		 * 		6) 선언형식
		 * 			소스파일의 첫 번째 라인(문장) 단 한번 선언
		 * 			package 패키지명.패키지명;
		 * 		7) 패키지명은 소문자로 작명
		 * 
		 * 2. import문 
		 * 		1) 소스파일에서
		 * 			다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 된다.
		 * 		2) 패키지이름 + 클래스이름 = 클래스의 풀네임
		 * 			java.io.클래스명
		 * 		3) 풀네임
		 * 			java.lang.System.out.println();
		 * 		4) import 문을 사용해서 미리 풀네임을 명시
		 * 			import java.lang.System;
		 * 			System.out.println();
		 * 		5) import 문이 없다면 아래 단축키로 자동 생성
		 * 			Ctrl + Shift + O
		 * 			<주의사항> 해당 클래스를 갖는 패키지가 여러개일 경우, 어떤 패키지를 사용할 것인지 선택해야함
		 * 		6) * 을 사용해서 모든 클래스를 import 할 수 있다.
		 * 			import java.io.*;
		 *			BufferedReader br;
		 * 			InputStreamReader is;
		 * 		7) static import 문
		 * 			import static java.lang.Math.random;
		 * 			위와 같이 선언할 경우, 아래와 같이 Math를 제외하고 사용 가능함
		 * 			// System.out.println( Math.random() );
		 * 			System.out.println( random() );
		 */
		
		// static random(), PI
		// System.out.println( Math.random() );
		// System.out.println( Math.PI );
		
	} //main
} //class