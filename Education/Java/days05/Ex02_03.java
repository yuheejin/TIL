package Education.Java.days05;

public class Ex02_03 {

	public static void main(String[] args) {
		
		/*
		// 1. 직접 배열 선언 후 for문 사용해서 처리
		String name = "heejin";
		
		// String -> char[] 변환 -> char 배열[0]
		char [] nameArray = new char[name.length()];
		
		for (int i = 0; i < nameArray.length; i++) {
			nameArray[i] = name.charAt(i);
		} //for
		*/
		
		// 2. 메서드 toCharArray 사용
		String name = "heejin";
		char [] nameArray = name.toCharArray();
		
		
		

	} // main
} // class