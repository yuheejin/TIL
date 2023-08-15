package Education.Java.days19;

import java.io.FileReader;

public class Ex09_03 {
	public static void main(String[] args) {
		// days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자를 구분하고 a~z,A~Z, 0~9 개수를
		// 배열에 저장 후 ### 막대그래프를 작성
		
		String path = ".\\src\\days19\\Ex01.java";
		// 0행: 대문자, 1행: 소문자
		int[][] counts = new int [3][];
		counts[0] = new int [26];
		counts[1] = new int [26];
		counts[2] = new int [10];
		try (FileReader fr = new FileReader(path)) {
			int code;
			char one;
			while ( (code = fr.read()) != -1 ) {
				one = (char)code;
				
				if( Character.isUpperCase(one) ) 
					counts[0][one - 'A']++;
				else if( Character.isLowerCase(one) ) 
					counts[1][one - 'a']++;
				else if( Character.isDigit(one) )
					counts[2][one-'0']++;
				
			} //while
			
			// 막대그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf( "[%s]문자 \n", i==0? "대" : i==1? "소" : "숫자" );
				
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf( "%c(%d) : %s\n", j+( i==0? 'A' : i==1? 'a' : '0' ), counts[i][j], "#".repeat(counts[i][j]) );
				} // for
			} // for
			
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch
		
	} //main
} //class