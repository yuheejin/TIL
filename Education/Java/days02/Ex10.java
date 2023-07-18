package Education.Java.days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author heejin
 * @date 2023. 7. 14. - 오후 12:36:26
 * @subject 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {

		byte age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 나이를 입력하세요? ");
		
		// Type mismatch: cannot convert from String to byte
		 age = Byte.parseByte(br.readLine());
		
		System.out.printf("> 나이: %d\n", age);
		
	}

}
