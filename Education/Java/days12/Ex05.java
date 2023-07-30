package Education.Java.days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import Education.Java.days10.Ex06_04;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		// 3반 30명 학생 이름, 국어, 영어, 수학, 총점, 평균, 반등수, 전교등수 처리
		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 3;
		// 행=반	열=번호
		String [][] names = new String [CLASS_COUNT][STUDENT_COUNT];
		// 면=반	행=변호	열=국어, 영어, 수학, 총점, 반등수, 전교등수
		int [][][] infos = new int[CLASS_COUNT][STUDENT_COUNT][6];
		// 행=반	열=번호
		double [][] avgs = new double [CLASS_COUNT][STUDENT_COUNT];
		
		char con = 'y';
		// 입력받은 학생수 저장변수
		int [] counts = new int [CLASS_COUNT];
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		int ban;
		
		do {
			// 1. 반입력?
			System.out.print("> 반 입력?  ");
			ban = scanner.nextInt();
			// 2. 그 반의 학생 정보 입력?
			System.out.printf("> %d반의 [%d]번 학생의 이름, 국어, 영어, 수학 입력?  ", ban, counts[ban-1]+1);
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			wrank=rank=1;
			
			names[ ban-1 ][ counts[ban-1] ] = name;
			infos[ ban-1 ][ counts[ban-1] ][ 0 ] = kor;
			infos[ ban-1 ][ counts[ban-1] ][ 1 ] = eng;
			infos[ ban-1 ][ counts[ban-1] ][ 2 ] = mat;
			infos[ ban-1 ][ counts[ban-1] ][ 3 ] = tot;
			infos[ ban-1 ][ counts[ban-1] ][ 4 ] = rank;
			infos[ ban-1 ][ counts[ban-1] ][ 5 ] = wrank;
			avgs[ ban-1 ][ counts[ban-1] ] = wrank;
			
			counts[ban-1]++;
			
			System.out.print("> 입력 계속?  ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		// 반등수, 전교등수 처리
		procWRank(infos, counts);
		
		// 학생정보 출력
		printStudentInfo(names, infos, avgs, counts);
		
		scanner.close();
	} //main	
	
	public static void procWRank(int[][][] infos, int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				// infos[i][j][3]  총점
				infos[i][j][4] = 1; // 반등수
				infos[i][j][5] = 1; //전교등수

				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						if( infos[i][j][3] < infos[i2][j2][3] ) {
							infos[i][j][5]++;
							if( i == i2 ) { // 같은 반
								infos[i][j][4]++;
							} // if
						} // if
					} // for j2
				} // for i2

			} // for j
		} // for i
	} //procWRank

	public static void printStudentInfo(String[][] names, int[][][] infos, double[][] avgs, int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명]\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n", j+1, names[i][j], infos[i][j][0], infos[i][j][1], infos[i][j][2], infos[i][j][3], avgs[i][j],infos[i][j][4], infos[i][j][5]);
			} //for
			System.out.println();
		} //for
		 System.out.printf("> 총 학생수 : %d명\n", IntStream.of(counts).sum() );
	} //printStudentInfo
	
} //class