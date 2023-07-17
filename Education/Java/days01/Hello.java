package days01;

public class Hello {

	public static void main(String[] args) {
		System.out.println("이창익");
	} 

}

// 자바의 주석처리
/*
p132
package days01;
패키지 ?                       (문제5)
		1) 디렉토리(폴더)와 동일한 개념이다.
        2) 서로 연관된 클래스들의 효율적인 관리
        3) 패키지 선언 형식 ? 
            package 패키지경로;
        4) 반드시 클래스 파일의 첫 번째 줄에 선언
*/
/*
p 19  자바 프로그램의 기본 구조    (문제4)
    1) package 선언문 
    2) 자바는 객체지향적 프로그램언어이기 때문에 
       반드시 시작객체(개체)로 사용할 하나의 클래스가 선언이 
       되어져 있어야 한다.
       객체 == 개체 == Object == 클래스 == 물건    (동일한 의미)  
    3) 자바 클래스 선언 형식
       [] 대괄호가 있는 구문은 생략이 가능하다.           
           public                X
       [접근지정자] [기타제어자] class  클래스명{
                 
       } 
    4) 클래스명과 자바파일명은  반드시 동일해야 한다. 
    5) 클래스명의 첫 문자는 반드시 대문자로 시작해야 된다. 
    6) 시작개체에는 
       프로그램 시작/종료하는 기능을 하는 main함수(메서드)가 필요하다.
    7) 자바에서 함수(메서드)를 선언 형식
     [접근지정자] [기타제어자] 리턴자료형 함수명([매개변수...]){
          // 명령 코딩.
          [return 리턴값;]
     }
 * */

/*
   Hello.java  소스파일( source file )
   javac.exe     Hello.java                  Hello.class
   java.exe       Hello  실행할 때              Hello.main()

 * */







