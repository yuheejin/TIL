package Education.Java.days09;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int [] m = new int [3];
		String [] menus = {"추가", "수정", "삭제", "검색", "조회", "종료"};
		int selectedNumber;

		while (true) {
			dispMenus( menus );
			selectedNumber = selectMenus( scanner );
			processMenus( selectedNumber );
		} //while
	} //main

	public static void processMenus(int selectedNumber) {
		switch (selectedNumber) {
		case 1:
			System.out.println("배열에 요소 추가");
			break;
		case 2:
			System.out.println("배열에 요소 수정");
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:
			exit();
			break;
		} //switch

	}

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
			System.out.printf("%d. %s\n", i+1, menus[i]);
		} //for
	} //dispMenus

} //class