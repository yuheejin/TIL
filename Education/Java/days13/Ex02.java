package Education.Java.days13;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 1. OOP = 객체 + 객체 + ...
		
		// 2. 클래스 = 객체를 만들기 위한 설계도
		// 3. 객체 = 클래스로 실제 존재하는 것. 사물(유형) 또는 개념(무형)의 객체 
		// 4. 인스턴스 (Instance) = 생성된 객체를 인스턴스라 한다.
		
		// 5. 인스턴스화 = 설계도(클래스) -> 객체를 생성하는 과정

		// 6. OOP의 특징 == 클래스의 특징
		// 		1) 캡슐화		2) 은닉화		3) 상속성		4) 다형성		5) 추상화
		//														4-1) 인터페이스
		
		// 7. 객체(물건, Object)의 구성요소
		// 					= 특징(속성)+기능(일)
		//		예) 망치 	= 손잡이+쇠+크기,재질 등등  
		//
		// 		1) 객체의구성요소를 "멤버"라고 부른다.
		//		2) 특징(속성) == property == 멤버변수 == 필드(field)
		//		3) 기능(일) == function == 멤버함수 == 메서드
		
		// 8. 클래스를 설계하는 과정
		//		1) 객체의 구성요소(기능, 속성) 파악 -> 목록작성(메서드, 필드)
		//		2) 클래스 선언
		//			[접근지정자] [기타제어자] class 클래스명 [extends Super클래스][implements 인터페이스...] { 
		//				필드 선언
		//				메서드 선언
		//			}
		//		3) 객체 생성 - 테스트
		//		4) 문제점 파악 - 유지, 보수
		//		5) 상용화 - 배포
		//		6) 버전관리 - 기능 추가, 수정
		
		// 9. 클래스
		// 		자바의 자료형
		//		1) 기본형(8가지)
		//		2) 참조형 - 배열, 클래스, 인턴페이스
		//					 new 연산자에 의해서 힙(heap, 동적) 영역에 실제 저장공간이 할당되고, 그 주소를 참조한다. 
		//		예) 배열
		//				int [] m;  // 변수, 참조변수, 배열명(스택영역에서 [주소참조])
		//				[4byte][4byte][4byte][4byte]			
		//				m = new int[5];   //시작주소값을 할당
		//		예)
		
		// [1] Scanner scanner;		// 변수, 참조변수, 객체
		// 클래스명   객체명
		// [2] Scanner scanner = null;		// 변수, 참조변수, 객체
		// new 객체생성 => new 연산자에 의해서 힙영역에 생성된 객체를 인스턴스라고 한다.
		
		// 인스턴스화 하는 작업(코딩) : new 객체생성
		// Scanner scanner = new 객체생성;		// 변수, 참조변수, 객체
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		
		System.out.print("> 이름 입력?  ");
		// [1] The local variable scanner may not have been initialized
		// 지역변수는 반드시 초기화해야 사용할 수 있다. 
		// [2] Null pointer access: The variable scanner can only be null at this location
		String name = scanner.next();
		System.out.println(name);
		
		// [객체 생성하는(인스턴스화) 코딩을 구체적으로 적으세요]
		//	new Random();
		// new Scanner(System.in);
		
		// 본인 이름 출력
		System.out.println("유희진");
		// The constructor(생성자) System() is not visible
		// System은 인스턴스화 할 수 없는 클래스이다.
		// System s = new System();
		
		// [클래스 선언] Tv
		
		// modifier(한정자, 수정자) = 접근지정자 + 기타제어자
		// Illegal modifier for parameter age; only final is permitted
		// 지역변수 앞에 접근지정자, 기타제어자 사용할 수 없다.
		// public int age;
		
		scanner.close();
		
	} //main

} //class
