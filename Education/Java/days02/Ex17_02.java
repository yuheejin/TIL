package Education.Java.days02;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 14. - 오후 4:43:47
 * @subject 	br
 * @content 	Scanner 클래스
 */
public class Ex17_02 {

	public static void main(String[] args) throws IOException {

		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동님은 국어: 89  영어: 78  수학: 56  총점: 000  평균:00.00 이다.
		
		String name;

		byte kor, eng, mat;
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Resource leak: 'sc' is never closed
		// 객체를 모두 사용했으면 close 하라는 경고
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> 이름 국어 영어 수학을 차례로 입력하세요? ");
		name = sc.next();		// String
		kor = sc.nextByte();		// byte
		eng = sc.nextByte();	// byte
		mat = sc.nextByte();	// byte
				
		
		// 'kor + eng + mat' 의 값이 int인 이유 : 4bit씩 처리하는 cpu의 효율성 때문에
		short total = (short)(kor + eng + mat);
		
		double avg = total/3.0;
		//double avg = total/3D;  이와같이 사용하여도 double로 형변환 됨
		//double avg = (double)total/3;
		
		System.out.printf("%s님은 국어: %d  영어: %d  수학: %d  총점: %d  평균:%.2f 이다.", name, kor, eng, mat, total, avg);
		
		sc.close();
		
	} //main

} //class
