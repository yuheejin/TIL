package Education.Java.days21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) throws IOException {
		// 한 반에 30명 학생 		이름, 국어, 영어, 수학, 총점, 평균, 등수
		// 1차원 배열 처리
		// 2차원 배열 처리
		// 3차원 배열 처리
		// Student 클래스 배열 처리
		// [ Student 클래스 + ArrayList 처리 ]

		// 입력받을 한 학생의 정보
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank, wrank;

		final int STUDENT_COUNT = 30;

		ArrayList list = new ArrayList();

		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		int no=1;

		do {
			System.out.print("> 이름, 국어, 영어, 수학 입력 ?  ");
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank=1;
			wrank=1;

			Student s = new Student(no++, name, kor, eng, mat, tot, avg, rank, wrank);
			list.add(s);

			System.out.print("> 입력 계속?  ");

			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');

		// [문제]
		// 1. 등수처리
		Iterator ir =  list.iterator();
		Iterator ir2;
		Student s1, s2;
		int s1Tot;
		while (ir.hasNext()) {
			s1 = (Student) ir.next();
			s1.setRank(1);
			ir2 = list.iterator();
			while (ir2.hasNext()) {
				s2 = (Student) ir2.next();
				
				if ( s1.getTot() < s2.getTot()) {
					s1.setRank(s1.getRank()+1);
				} //if
				
			} //while
		} //while
		
		
		// 2. 성적순으로 오름차순 정렬
		
		
		
		// 모든 학생 정보 출력...
		System.out.println( "> 입력받은 학생수 : " + list.size() );
		//Iterator ir =  list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println( s );
		} //while

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

} //class