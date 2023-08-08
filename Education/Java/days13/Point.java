package Education.Java.days13;

public class Point {
	// 필드
	public int x=0;
	public int y=0;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메서드
	public void dispXY() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	} //dispXY
	
	// 메서드 추가
	// 리턴자료형이 Point 클래스의 참조타입
	public Point plusPoint(Point p) {
		// 새로운 좌표객체를 생성해서 반환
		Point p2 = new Point();
		p2.x = p.x+10;
		p2.y = p.y+20;
		
		return p2;
	} //plusPoint
	
	// 중복함수
	// 오버로딩(Overloading)
	public Point plusPoint() {
		// 새로운 좌표객체를 생성해서 반환
		Point p2 = new Point();
		p2.x = x+10;
		p2.y = y+20;
		
		return p2;
	} //plusPoint
	
	
} //class
