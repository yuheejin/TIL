package Education.Java.days19;

import java.io.FileReader;

public class Ex09 {
	public static void main(String[] args) {
		// days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자를 구분하지 않고 a~z 개수를
		// 배열에 저장 후 ### 막대그래프를 작성
		//     A (20) : #########################
		//     B (13) : #############
		
		// 상대경로 : .   (현재 디렉토리) = ~~\javaPro
		//				.. (상위 디렉토리)
		String path = ".\\src\\days19\\Ex01.java";
		int[] counts = new int [26];
		// counts[0] 'A' 'a'
		try (FileReader fr = new FileReader(path)) {
			int code;
			char one;
			while ( (code = fr.read()) != -1 ) {
				// System.out.println( code );
				one = (char)code;
				one = Character.toUpperCase(one);
				
				// if( 'A' <= one && one <= 'Z') counts[one - 'A']++;
				if( Character.isUpperCase(one) ) counts[one - 'A']++;
				
			} //while
			
			// 막대그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf( "%c(%d) : %s\n", i+'A', counts[i], "#".repeat(counts[i]) );
			} // for
			
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch
		
		
		
		
	} //main
} //class