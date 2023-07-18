package Education.Java.days02;

/**
 * @author heejin
 * @date 2023. 7. 14. - 오후 2:37:40
 * @subject 문자형 - char(2 byte)
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		
		// [진법변환]
		// 16 진수 : 0 1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) e(14) f(15)  
		// 10 진수 : 0~9
		// 8 진수 : 0~7
		// 2 진수 : 0,1
		byte b = 10; 	// [00001010]
		int i = 10;  		// [00000000 00000000 00000000 00001010]
		
		char c = 'A';	// 2진수(0,1)   65 -> ASCII 7비트(128 문자 표현)
		// 자바 유니코드 2바이트 [00000000][01000001]
		// 확장 ASCII (8비트 256문자)
		// 인코딩 (encoding)  'A' -> 65 변환		~을 코드화한다.
		// 디코딩 (decoding)  65 -> 'A' 변환	
		
		// '\u0000'~'\uffff' 		여기서 는 유니코드를 의미한다.
		// 16진수 61 -> 10진수 ?
		char d = '\u0061';
		System.out.printf("d: %c\n", d); // 'a' - 97,   'A' - 65
		
		// 대문자 - 소문자 = 65-97 = -32
		
		
	} //main

} //class
