<<<<<<< HEAD
package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 4:43:37
 * @subject
 * @content
 */
public class Ex17 {

	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동님은 국:89 영:78 수:56 총점:000 평균:00.00 이다.
		// (5:25 풀이)
		String name;
		byte kor, eng, mat;
		short total;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("1. 이름 입력 ? ");
		name = br.readLine();
		
		System.out.print("2. 국어 입력 ? ");
		kor = Byte.parseByte( br.readLine() );
		
		System.out.print("3. 영어 입력 ? ");
		eng = Byte.parseByte( br.readLine() );
		
		System.out.print("4. 수학 입력 ? ");
		mat = Byte.parseByte( br.readLine() );
		
		// Type mismatch: cannot convert from int to short
		total = (short) (kor + eng + mat);
		avg = (double)total/3;
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
				,name, kor, eng,mat, total, avg );
		
		

	} // main

} // class


=======
package Education.Java.days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author heejin
 * @date 2023. 7. 14. - 오후 4:43:47
 * @subject
 * @content
 */
public class Ex17 {

	public static void main(String[] args) throws IOException {

		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동님은 국어: 89  영어: 78  수학: 56  총점: 000  평균:00.00 이다.
		
		String name;

		byte kor, eng, mat;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름을 입력하세요? ");
		name = br.readLine();		

		System.out.print("> 국어 점수를 입력하세요? ");
		kor = Byte.parseByte(br.readLine());

		System.out.print("> 영어 점수를 입력하세요? ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("> 수학 점수를 입력하세요? ");
		mat = Byte.parseByte(br.readLine());
		
		// 'kor + eng + mat' 의 값이 int인 이유 : 4bit씩 처리하는 cpu의 효율성 때문에
		short total = (short)(kor + eng + mat);
		
		double avg = total/3.0;
		//double avg = total/3D;  이와같이 사용하여도 double로 형변환 됨
		//double avg = (double)total/3;
		
		System.out.printf("%s님은 국어: %d  영어: %d  수학: %d  총점: %d  평균:%.2f 이다.", name, kor, eng, mat, total, avg);
		
		
		
	} //main

} //class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
