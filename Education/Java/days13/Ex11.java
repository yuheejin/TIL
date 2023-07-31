package Education.Java.days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Ex11 {

	// 한 학생의 성적 관리 Student 클래스 선언
	// days10.Ex06_04
	// [ 한 반에 30명 학생의 성적 처리] -> 클래스 사용 수정
	public static void main(String[] args) throws IOException {
		// 입력받을 한 학생의 정보
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;

		// 배열을 사용해서 선언
		final int STUDENT_COUNT = 30;	// 총학생수 상수
		
		// 클래스 배열
		Student [] students = new Student[STUDENT_COUNT];

		Scanner scanner = new Scanner(System.in);
		int count = 0;	// 입력받은 학생수를 저장할 변수
		char con = 'y';
		int no=1;

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

			students[count] = new Student();
			students[count].no = no++;
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;
			count++;

			// 입력 계속? y
			System.out.print("> 입력 계속?  ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');


		// 모든 학생 정보 출력...
		for (int i = 0; i < count; i++) {
			students[i].printStudentInfo();
		} // for

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