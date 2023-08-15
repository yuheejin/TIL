<<<<<<< HEAD
package days02;

public class Ex15_02 {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		// int -> String
		// 10  -> "10" 형변환
		// [1] i + ""
		String si = i + "";
		
		// [2]
		si = String.valueOf(i);
		
		// [3]
		si = Integer.toString(i);
		 
		// "1010"
		System.out.println( Integer.toBinaryString(i) );
		System.out.println( Integer.toString(i, 2) );
		// "12"
		System.out.println( Integer.toOctalString(i) );
		System.out.println( Integer.toString(i, 8) );
		// "a"
		System.out.println( Integer.toHexString(i) );
		System.out.println( Integer.toString(i, 16) );
		
		 
		
		
	} // main

} // class
=======
package Education.Java.days02;

/**
 * @author heejin
 * @date 2023. 7. 14. - 오후 4:13:16
 * @subject 
 * @content
 */
public class Ex15_02 {

	public static void main(String[] args) {
		
		int i = 10;
		
		// int -> String
		// 10 -> "10"		형변환
		String si = i + "";
		
		// 방법2
		String st = String.valueOf(i);
		
		// 방법3
		String sr = Integer.toString(i); 
		
		// "1010" - 2진수
		System.out.println( Integer.toBinaryString(i) );
		System.out.println( Integer.toString(i, 2) );
		// "12" - 8진수
		System.out.println( Integer.toOctalString(i) );
		System.out.println( Integer.toString(i, 8) );
		// "a" - 16진수
		System.out.println( Integer.toHexString(i) );
		System.out.println( Integer.toString(i, 16) );
		
		
		
		
	} //main

} //class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
