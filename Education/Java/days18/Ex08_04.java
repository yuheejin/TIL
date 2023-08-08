package Education.Java.days18;

public class Ex08_04 {
	public static void main(String[] args) {
		// String s = "안녕하세요. 홍길동입니다. 홍길동이고, 홍길동입니다.";
		// "홍길동" -> "hong.gildong"
		// s = s.replaceFirst("홍길동", "hong.gildong");
		// s = s.replaceAll("홍길동", "hong.gildong");
		
		String s = "안녕하세요. 홍길동입니다. 홍길도이고, 홍길둥입니다. 홍길.입니다.";
		// s = s.replaceAll("홍길.", "hong.gildong");
		// 안녕하세요. hong.gildong입니다. hong.gildong이고, hong.gildong입니다. hong.gildong입니다.
		
		// s = s.replaceAll("홍길\\.", "hong.gildong");
		// 안녕하세요. 홍길동입니다. 홍길도이고, 홍길둥입니다. hong.gildong입니다.
		
		// s = s.replace('홍', '강');
		// 안녕하세요. 강길동입니다. 강길도이고, 강길둥입니다. 강길.입니다.
		
		CharSequence target = new StringBuffer("홍길동");
		s = s.replace(target, "XYZ");
		System.out.println( s );
		
	} //main
	
} //class