package Education.Java.days18;

import java.util.Arrays;

public class Ex08_03 {
	public static void main(String[] args) {
		
		String s = "안녕하세요. 입니다. 입니다. 입니다.";
		String name = "홍길동";
		
		/*
		// 첫번째 "입니다."을 찾아서 앞에 "홍길동" 붙여보자
		// "안녕하세요. 홍길동입니다. 입니다. 입니다."
		
		// indexOf() -> 찾고자하는 값이 없을때는 -1 반환
		// int index = s.indexOf('입');
		int index = s.indexOf("입니다.");
		s = s.substring(0, index) + name + s.substring(index);
		System.out.println( s );
		*/
		
		/*
		// 마지막 "입니다" 찾아서 그 앞에 "홍길동" 붙이자.
		int index = s.lastIndexOf("입니다.");
		s = s.substring(0, index) + name + s.substring(index);
		System.out.println( s );
		*/
		
//		int fromIndex = 0;
//		int index = -1;
//		while ( (index = s.indexOf("입니다.", fromIndex)) != -1) {
//			System.out.println( index );
//			fromIndex = index  + "입니다.".length();
//		} //while
//		
//		s = s.substring(0, index) + name + s.substring(index);
//		System.out.println( s );
		
		
		String [] nameArr = "홍길동,김길동,이길동,박길동".split(",", 2);
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println( nameArr[i] );
		} // for
		
		
		
	} //main
	
	
} //class