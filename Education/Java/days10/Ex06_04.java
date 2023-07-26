package Education.Java.days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Ex06_04 {
	public static void main(String[] args) throws IOException {
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

		do {
			System.out.print("> 이름, 국어, 영어, 수학 입력 ?  ");
			//			name = scanner.nextLine();
			//			kor = scanner.nextInt();
			//			eng = scanner.nextInt();
			//			mat = scanner.nextInt();
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank=1;

			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank;
			count++;

			// 입력 계속? y
			System.out.print("> 입력 계속?  ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');
		
		// 2번학생의 국어점수를 100점으로 수정
		kors[1] =100;
		
		// 1번학생의 성적정보를 삭제

		// 등수처리
		procRank(tots,ranks, count);

		// 모든 학생 정보 출력...
		printStudentInfo(names, kors, engs, mats, tots, avgs, ranks, count);

		scanner.close();
	} //main

	public static String getName() {
		Random rnd = new Random();
		char[] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1) + '가');
		} //for

		// char[] -> String
		String name = String.valueOf(nameArr);
		return name;
	} //getName

	public static int getScore() {
		return (int)(Math.random()*101);
	} //getScore

	public static void procRank(int[] tots, int[] ranks, int count) {
		for (int i = 0; i < count; i++) {
			ranks[i]=1;
			for (int j = 0; j < count; j++) {
				if(tots[i] < tots[j]) ranks[i]++;
			} //for
		} //for
	} //procRank

	public static void printStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int[] ranks, int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d등\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		} //for
	} //printStudentInfo
} //class