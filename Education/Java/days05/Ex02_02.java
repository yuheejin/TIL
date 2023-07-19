package Education.Java.days05;

public class Ex02_02 {

	public static void main(String[] args) {
		
		// char -> String
		// 1) 'a' + ""
		// 2) String.valueOf('a');
		// 3) Character.toString('a');
		
		// String -> char 
		String name = "heejin";
		// 원하는 위치의 한 문자를 얻어오고 싶다.
		// 문자열.charAt(index)     <- 리턴값 char
		/*
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		} //for
		*/
		
		for (int i = 0, len = name.length(); i < len; i++) {
			System.out.println(name.charAt(i));
		} //for
		
		// 문자열 다루는 메서드(함수)
		// 1. split()
		// 2. length()
		// 3. chatAt()
		// 4. valueOf()
		// 5. toString()
		// 6. toCharArray()   문자열 String을 char 배열로 반환하는 메서드

	} // main
} // class