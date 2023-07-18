package Education.Java.days02;

//Alt + Shift + j
/**
 * @author heejin
 * @date 2023. 7. 14. - 오전 10:21:26
 * @subject 지역변수 ( Local Variable ) ***
 * @content 
 */

public class Ex03 {
	
	public static void main(String[] args) {
		// String %s, int %d, double
		// 한 문자를 저장하는 자료형 : char %c
		// 자바에서 문자를 나타낼 때는 '한문자'
				
		// 코드영역 (블럭)
		// {  } 영역(범위) 나타내는 연산자
		{
			char grade = 'A'; // Local Variable (지역변수)			
		}
		// grade cannot be resolved to a variable
		// grade는 선언되지 않은 변수임
		// grade는 지역변수이므로 영역(블럭)을 벗어나면 메모리가 지워짐
		//System.out.printf("등급 : '%c'", grade);
		
		
	} //main

} //class
