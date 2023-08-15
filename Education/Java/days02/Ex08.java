<<<<<<< HEAD
package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 12:09:53
 * @subject ㄱ. 정수계열 - byte(1), short(2), [int(4)], long(8)
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 1비트: 0,1
		// 1바이트=8비트 :
		//      [0,1] 정수를 표현하는 가지수? 2가지(0,1)
		//  []       [][][][][][][] 1바이트  정수를 표현하는 가지수? 256가지 
		//  부호비트 128 가지       0
		
		// 정수유형 + 1바이트 크기 할당 : byte  값의 표현 범위 이해.
		//                               -128~127                                   
		// 정수유형 + 2바이트 크기 할당 : short
		//  [] 2^15                       -32768~32767 
		// 정수유형 + 4바이트 크기 할당 : int
		//  [] 2^31                          -21억~21억
		// 정수유형 + 8바이트 크기 할당 : long
		//  [] 2^63                          -900경~ 900경
		
		// 본인의 나이를 저장할 age 변수를 선언하고 
		// 본인 나이로 초기화
		// 출력 코딩.. 
		// 0~125
		byte age;  // [ 4바이트 ]  -21억~21억 정수 age
		age = 20;
		System.out.println(age);
		
		// 국어, 영어, 수학 점수를 저장할 변수 선언
		// 0<= 정수  <=100
		byte kor, eng, mat;
		//kor = 100;
		//eng = 100;
		//mat = 100;
		// + --------------> 
		// = <---------------
		mat = eng = kor = 100;
		
		// 0           [][][][] int
		// 0L , 0l     [][][][][][][][] long 
	} // main

} // class










=======
package Education.Java.days02;

//Alt + Shift + j
/**
 * @author heejin
 * @date 2023. 7. 14. - 오전 11:46:11
 * @subject ㄱ. 정수계열 - byte(1 byte), short(2 byte), [ int(4 byte) ], long(8 byte)
 * @content
 */
public class Ex08 {
	
	public static void main(String[] args) {
		// 1비트 : 0, 1
		// 1바이트 = 8비트 :
		//		[0,1] 정수를 표현하는 가지수? 2가지 (0,1)
		//	[       ] [][][][][][][] 1바이트 정수를 표현하는 가지수? 256가지
		//	부호비트  128가지		양수 128가지, 음수 128가지
		
		// 정수유형 + 1바이트 크기 할당 : byte	값의 표현 범위 이해.
		//										2^7 (-128 ~ 127)
		// 정수유형 + 2바이트 크기 할당 : short
		//										2^15 (-32,768~32,767)
		// 정수유형 + 4바이트 크기 할당 : int
		//										2^31 (-21억~21억)
		// 정수유형 + 8바이트 크기 할당 : long
		//										2^63 (-900경~900경)
		
		// 본인의 나이를 저장할 age 변수를 선언하고
		// 본인 나이로 초기화
		// 출력 코딩 ....
		
		// int age =27;  // [4바이트] -21억~21억 정수 age
		byte age = 27;
		System.out.println(age);
		
		// 국어, 영어, 수학 점수를 저장할 변수 선언
		// 0 <=  정수 <= 100
		byte kor, eng, mat;
		// kor = 100;
		// eng = 100;
		// mat = 100;
		// + 연산자 연산 방향 ---------->
		// = 연산자 연산 방향 <----------
		mat = eng = kor = 100;
		
		// 0				[][][][] int
		// 0l, 0L			[][][][][][][][] long
		
	} //main

} //class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
