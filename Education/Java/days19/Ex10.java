package Education.Java.days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
	public static void main(String[] args) {
		// 정규표현식 (Regular Expression) == 정규식
		// String		regex
		// - 문자열 속에 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해 사용됨
		// - 미리 정의된 기호
		// - 자바 정규표현식과 관련 클래스 2개 밖에 없다.
		//   String.matched(regex)
		//   1) Pattern 클래스
		//   2) Matcher 클래스
		
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                				, "combat", "count", "date", "disc", "fx"};
		
		// 1) data 배열에 들어있는 단어들 중에 c로 시작하는 단어를 모두 찾아서 출력
		//		ㄴ data[i].startsWith("c")
		//		ㄴ data[i].matches(regex)
		//		ㄴ Pattern 클래스, Matcher 클래스 사용

		// String regex = "c.*";
		// String regex = "c[a-zA-Z]*"; // c 시작 + 영문자 0이상
		// String regex = "c[a-z]";  // c+소문자 1개 == ( 2문자 )
		// String regex = "c\\w";  //    '\w'
		// String regex = "c[a-zA-Z0-9]";  //    '\w'

		// String regex = ".*";  //   . 모든 문자
		// String regex = "c.*t";

		// String regex = "c[0-9]";
		// String regex = "c\\d";

		// String regex = "c[^0-9]";    //   [^    부정]
		// String regex = "c\\D";

		// String regex = "(b|c).*";
		// String regex = "[bc].*";

		// String regex = "[bcd].{2}";
		// String regex = "[bcd].{2,3}";
		// String regex = "[bcd].+";    1개 이상
		// String regex = "[bcd].?";    1개 또는 0개

		// String regex = "[bcd].*";    0개 이상
		// String regex = "[b-d].*";

		// 알파벳 대,소문자 중에  bcd 문자는 제외 + 모든 0~여러개.
		String regex = "[a-zA-Z&&[^b-d]].*";
		//    \\s 공백        \\S !공백
		Pattern p = Pattern.compile(regex); //
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher( data[i]  );
			if( m.matches() ) {
				System.out.println( data[i] );
			}
		} // for

	} //main
} //class