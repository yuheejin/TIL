package Education.Java.days13;

public class Ex06 {
	public static void main(String[] args) {
		// 좌표점 20개 쓰기 + 읽기
		// main.x, y 지역변수
		int x=10, y=20;
		int x1=11, y1=21;
		int x2=12, y2=22;
		int x3=13, y3=23;
		int x4=14, y4=24;
		int x5=15, y5=25;
		
		dispXY(x, y);	 // Call By Value
		
		
	} //main

	// dispXY.x=10, y=20 지역변수
	public static void dispXY(int x, int y) {
		System.out.printf("> x=%d, y=%d\n", x, y);
	} //dispXY

	// The variable argument type int of the method dispXY must be the last parameter
	// 가변인자는 하나만 쓸 수 있다.
	// public static void dispXY(int...x, int...y) {
	// 	System.out.printf("> x=%d, y=%d\n", x, y);
	// } //dispXY

	public static void dispXY(int [] x, int [] y) {
		System.out.printf("> x=%d, y=%d\n", x, y);
	} //dispXY
	
} //class
