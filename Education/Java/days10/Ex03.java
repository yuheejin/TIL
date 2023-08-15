package Education.Java.days10;

import java.io.IOException;

/**
 * @author heejin
 * @date 2023. 7. 26. - 오전 11:16:42
 * @subject	배열 단점 -> 컬렉션 클래스
 * @content	1) 배열의 크기가 자동으로 증가하지 못한다.
 */

import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {
	// 전역변수
	static int index = 0;		
	static Scanner scanner = new Scanner(System.in);
	static char con = 'y';

	public static void main(String[] args) throws IOException {

		int [] m = new int [3];

		String [] menus = {"추가", "수정", "삭제", "검색", "조회", "종료"};
		int selectedNumber;

		while (true) {
			dispMenus( menus );
			selectedNumber = selectMenus( scanner );
			processMenus( selectedNumber, m );
		} //while
	} //main

	public static void processMenus(int selectedNumber, int[] m) throws IOException {
		switch (selectedNumber) {
		case 1:	//main.m 배열에 값을 입력받아서 요소 추가
			add(m);
			break;
		case 2:
			System.out.println("배열에 요소 수정");
			break;
		case 5:	//모든 요소 조회
			list(m);
			break;
		case 6:
			exit();
			break;
		} //switch

		일시정지();

	} //processMenus

	public static void 일시정지() {
		System.out.print("> 아무키나 누르면 계속합니다.\n");

		// 예외처리 방법 2가지 : try~catch, throws
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
	} //일시정지


	public static void list(int[] m) {
		System.out.println("[5. 조회]");

		if (index == 0) { 
			System.out.println("추가된 요소가 없습니다.");
			return;
		} //if

		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d]=%d  ",i,m[i]);
		} //for

		System.out.println();
	} //list


	// m 배열에 요소를 추가하는 함수(메서드)
	public static void add(int[] m) throws IOException {
		System.out.println("[1. 추가]");
		do {
			if(index == m.length) {
				int[] temp = new int [ m.length+3 ];
				for(int i=0; i < m.length; i++)  temp[i] = m[i];
				m = temp;		
			} //if
			
			System.out.print("> 정수입력?  ");
			m[index++] = scanner.nextInt();

			System.out.print("\t> 요소추가 계속 할거니?  ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while( Character.toUpperCase(con) == 'Y');

		System.out.println();

	} //add

	public static void exit() {
		System.out.println("\n\n 프로그램 종료합니다.");
		System.exit(-1);
	} //exit

	public static int selectMenus(Scanner scanner) {
		System.out.print("> 메뉴 선택하세요?  ");
		return scanner.nextInt();
	} //selectMenus

	public static void dispMenus(String[] menus) {
		System.out.println("[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s    ", i+1, menus[i]);
		} //for
		System.out.println();
	} //dispMenus

} //class