package Education.Java.days18;

public class Ex08 {
	public static void main(String[] args) {
		// [ 문자열 다루는 클래스 ]
		// String : 변경 불가능한 클래스
		// StringBuffer
		// StringBuilder
		// StringTokenizer
		
		
		// 한번 만들어진 String 인스턴스의 값은 변경이 불가능 하다.
		String name = "홍길동";		// new String("홍길동");
		System.out.println(name.hashCode());
		// "홍길동" 뒤에 "님"이 추가된 것이 아니라,
		// "홍길동님"이라는 인스턴스가 새로 만들어진 뒤 name이라는 객체의 주소를 변경한 것이다.
		name += "님";
		name += "안녕!!";
		System.out.println(name.hashCode());
		
		// 1. 
		System.out.println(name.length()); //9
		
		// 2.
		for (int i = 0; i < name.length(); i++) {
			System.out.printf( "name[%d]='%c'\n", i, name.charAt(i) );
		} // for
		
		// 3. 
		String rrn = "890223-170001";
		System.out.println( rrn.substring(rrn.length()-1) );	// "1"
		// beginIndex <=  < endIndex
		System.out.println( rrn.substring(0,2) );	//"89"
		
		// 4. 정규표현식 일치여부 확인 
		String regex = "\\d{6}-\\d{7}";
		rrn.matches(regex);
		
		// 5. concat()
		String a = "ㅁㅁㅁ" + "ㅠㅠㅠ" + "xxx";
		String b = "ㅁㅁㅁ".concat("ㅠㅠㅠ").concat("xxx");
		
		// 6. 
		// Stream rrn.chars();
		
		// 7.
		// 0을 return하면 동일한 문자열이다.
		System.out.println( "heejin".compareTo("heejin") );		//0
		// 대소문자 비교하지 않고 확인
		System.out.println( "heejin".compareToIgnoreCase("heejin") );		//0
		
		
		// 8. equals() -> true, false 리턴
		System.out.println( "heejin".equals("hEejin") );
		System.out.println( "heejin".equalsIgnoreCase("hEejin") );
		
		// 9. contains() -> 매개변수로 준 문자열이 포함되어 있는지 확인 true, false
		System.out.println( "안녕하세요. 홀길동입니다.".contains("김길동") );
		
		// 10. 
		String url = "http://www.naver.com/test.jsp";
		String suffix = ".jsp";		// 접미사
		String prefix = "http://";		// 접두사
		System.out.println( url.endsWith(suffix) );	//true
		System.out.println( url.startsWith(prefix) );	//true
		
		// 11.  
		
		
		
	} //main
	
} //class