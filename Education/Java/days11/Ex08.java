package Education.Java.days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		// 입력받을 한 학생의 정보
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;

		final int STUDENT_COUNT = 30;	// 총학생수 상수

		String[] names = new String [STUDENT_COUNT];
		// 열 : kor, eng, mat, tot, rank
		int[][] infos = new int [STUDENT_COUNT][5];
		double[] avgs = new double [STUDENT_COUNT];

		Scanner scanner = new Scanner(System.in);
		int count = 0;	// 입력받은 학생수를 저장할 변수
		char con = 'y';

		do {
			System.out.print("> 이름, 국어, 영어, 수학 입력 ?  ");
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank=1;

			names[count] = name;
			infos[count][0] = kor;
			infos[count][1] = eng; 
			infos[count][2] = mat;
			infos[count][3] = tot;
			infos[count][4] = rank;
			avgs[count] = avg;
			count++;

			// 입력 계속? y
			System.out.print("> 입력 계속?  ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');

		// 2번학생의 국어점수를 100점으로 수정.
		infos[1][0] = 100;

		// 등수처리
		procRank(infos, count);

		// 모든 학생 정보 출력...
		printStudentInfo(names, infos, avgs, count);

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

	public static void procRank(int[][] infos, int count) {
		for (int i = 0; i < count; i++) {
			infos[i][4]=1;
			for (int j = 0; j < count; j++) {
				if(infos[i][3] < infos[j][3]) infos[i][4]++;
			} //for
		} //for
	} //procRank

	public static void printStudentInfo(String[] names, int[][] infos, double[] avgs, int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d등\n", i+1, names[i], infos[i][0], infos[i][1], infos[i][2], infos[i][3], avgs[i], infos[i][4]);
		} //for
	} //printStudentInfo
} //class