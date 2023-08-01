package Education.Java.days14;

import days13.Point;

public class Ex02 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		
		// 객체명.메서드명
		// 객체명.필드명
		Point p2 =  p1.plusPoint(p1);
		p2.dispXY();
		
		p2 = p1.plusPoint();
		p2.dispXY();
	} //main
} //class