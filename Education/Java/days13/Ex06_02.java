package Education.Java.days13;

/**
 * @author heejin
 * @date 2023. 7. 31. - 오후 2:08:55
 * @subject	
 * @content	Point 클래스 선언
 * 						필드 x, y ...
 * 						메서드 좌표출력메서드 ...
 */
public class Ex06_02 {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x=10;	p1.y=20;
		
		
		Point p2 = new Point();
		p2.x=11;	p2.y=21;
		
		Point p3 = new Point();
		p3.x=12;	p3.y=22;
		
		Point p4 = new Point();
		p4.x=13;	p4.y=23;
		
		Point p5 = new Point();
		p5.x=14;	p5.y=24;
		
		p1.dispXY();
		p2.dispXY();
		p3.dispXY();
		p4.dispXY();
		p5.dispXY();
		
	} //main
	
} //class
