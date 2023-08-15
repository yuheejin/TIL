<<<<<<< HEAD
package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오후 5:18:56
 * @subject BufferedReader br을 사용해서 동시에 이,국,영,수 입력-> 총,평 처리.
 * @content 배열 사용
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		
		String name;
		int kor, eng, mat;
		int total;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 홍길동,90,78,99 엔터
		System.out.print("> 이름,국어,영어,수학 입력 ? ");
		String inputData = br.readLine();		
		//System.out.println( inputData ); 
		
		// "홍길동"  "90"  "78"   "99"  구분자 콤마(,) 잘라내기
		// 1)  기능 2) 매개변수 3) 리턴값(리턴자료형)
		String [] datas = inputData.split(",");
		
		name = datas[0]; // "홍길동"
		kor = Integer.parseInt(datas[1]); // "90"
		eng = Integer.parseInt(datas[2]); // "78"
		mat = Integer.parseInt(datas[3]); // "99" 
		 
		total =  kor + eng + mat ;
		avg = (double)total/3;
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
				,name, kor, eng,mat, total, avg );
		 


	} // main

} // class




=======
package Education.Java.days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 5:18:56
 * @subject 
 * @content
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동님은 국어: 89  영어: 78  수학: 56  총점: 000  평균:00.00 이다.
				
		String name;
		int kor, eng, mat;
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 홍길동,90,78,99 엔터
		System.out.print("> 이름,국어,영어,수학 입력? ");
		String inputData = br.readLine();
		// System.out.println(inputData);	// "홍길동,90,78,99"  
		// "홍길동" "90" "78" "99"   구분자 콤마(,) 잘라내기
		// 1) 기능  2) 매개변수  3) 리턴값(리턴자료형)
		String [] datas = inputData.split(",");
		
		name = datas[0];
		kor = Integer.parseInt(datas[1]);
		eng = Integer.parseInt(datas[2]);
		mat = Integer.parseInt(datas[3]);

		int total = kor + eng + mat;
		double avg = (double)total/3;
				
		System.out.printf("%s님은 국어: %d  영어: %d  수학: %d  총점: %d  평균:%.2f 이다.", name, kor, eng, mat, total, avg);
	}//main
}//class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
