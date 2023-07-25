package Education.Java.days08;

/**
 * @author heejin
 * @date 2023. 7. 24. - 오전 11:15:40
 * @subject	지역변수 개념
 * @content
 * 					함수 호출 + 매개변수 가지고 
 * 					1) Call By Name			drawLine();
 * 					2) Call By Value			drawLine(10,"*");
 * 					3) Call By Reference		drawLine();
 * 					4) Call By Point			<- C언어
 */
public class Ex04 {

	public static void main(String[] args) {

		int x=10;
		int y=20;

		System.out.printf("> x=%d, y=%d\n", x,y);	//x=10, y=20

		swap(x,y);	//Call By Value

		System.out.printf("> x=%d, y=%d\n", x,y);	//x=10, y=20

	} //main

	// 아래 함수에서만 x와 y값이 바뀐것임.
	public static void swap(int x, int y) {
		int temp = x;
		x=y;
		y=temp;
	} //swap
	
} //class