package Education.Java.days14;
// Ex05
public class Point {

	// 필드
	private int x;
	private int y;

	// 디폴트 생성자
	public Point() {
		this(1);
		System.out.println("> Point 디폴트 생성자 호출됨... ");
	} //default constructor

	public Point(int x, int y) {
		System.out.println("> Point 2 생성자 호출됨... ");
		// The assignment to variable x has no effect
		// x에 값을 넣는데 아무런 효과가 없다는 에러
		// x=x; <- x가 필드 x인지 매개변수 x인지 알 수 없다.
		this.x=x;
		this.y=y;
	} //constructor

	public Point(int i) {
		this(i,i);		// Point(x,y)
		System.out.println("> Point 1 생성자 호출됨... ");
		//		this.x=i;
		//		this.y=i;
	} //constructor

	// 호출한 객체의 필드를 나타냄
	// p1.printPoint() -> p1.x  p1.y
	// p2.printPoint() -> p2.x  p2.y
	// 객체명.필드
	// 객체명.메서드
	public void printPoint() {
		System.out.printf("> x=%d, y=%d\n", this.x, this.y);
	} //printPoint

	public Point offsetPoint(int n) {
		this.x += n;
		this.y += n;
		return this;
	} //offsetPoint

} //class