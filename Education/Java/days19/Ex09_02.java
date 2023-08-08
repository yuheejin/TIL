package Education.Java.days19;

import java.io.FileReader;

public class Ex09_02 {
	public static void main(String[] args) {
		// days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자를 구분하고 a~z,A~Z 개수를
		// 배열에 저장 후 ### 막대그래프를 작성
		//     A (20) : #########################
		//     B (13) : #############
		
		// 상대경로 : .   (현재 디렉토리) = ~~\javaPro
		//				.. (상위 디렉토리)
		String path = ".\\src\\days19\\Ex01.java";
		// 0행: 대문자, 1행: 소문자
		int[][] counts = new int [2][26];
		try (FileReader fr = new FileReader(path)) {
			int code;
			char one;
			while ( (code = fr.read()) != -1 ) {
				one = (char)code;
				
				if( Character.isUpperCase(one) ) 
					counts[0][one - 'A']++;
				else if( Character.isLowerCase(one) ) 
					counts[1][one - 'a']++;
				
			} //while
			
			// 막대그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf( "[%c]문자 \n", i==0? '대' : '소' );
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf( "%c(%d) : %s\n", j+( i==0? 'A' : 'a' ), counts[i][j], "#".repeat(counts[i][j]) );
				} // for
			} // for
			
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch
		
		
		
		
	} //main
} //class