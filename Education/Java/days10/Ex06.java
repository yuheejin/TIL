package Education.Java.days10;

import java.util.Scanner;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Ex06 {
	public static void main(String[] args) {
		// [시험1]
		// 한 반에 STUDENT_COUNT명의 학생
		// 성적처리 (이름, 국어, 영어, 수학, 총점, 평균, 등수)
		// 1. 학생정보 입력
		// 2. 총점, 평균 
		// 3. 등수
		// 4. 학생정보 출력
		// 5. 파일 저장 또는 DB 저장
		
		// 입력받을 한 학생의 정보
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;
		
		// 배열을 사용해서 선언
		final int STUDENT_COUNT = 30;	// 총학생수 상수
		
		String[] names = new String [STUDENT_COUNT];
		int[] kors = new int [STUDENT_COUNT];
		int[] engs = new int [STUDENT_COUNT];
		int[] mats = new int [STUDENT_COUNT];
		int[] tots = new int [STUDENT_COUNT];
		double[] avgs = new double [STUDENT_COUNT];
		int[] ranks = new int [STUDENT_COUNT];
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;	// 입력받은 학생수를 저장할 변수
		char con = 'y';
		
		System.out.print("> 이름, 국어, 영어, 수학 입력 ?  ");
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		
		tot = kor + eng + mat;
		avg = (double) tot / 3;
		rank=1;
		
		count++;
		
		names[0] = name;
		kors[0] = kor;
		engs[0] = eng;
		mats[0] = mat;
		tots[0] = tot;
		avgs[0] = avg;
		ranks[0] = rank;

		// 입력 계속? y
		
		scanner.close();
		
	} //main
} //class