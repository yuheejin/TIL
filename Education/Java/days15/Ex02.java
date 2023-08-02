package Education.Java.days15;

/**
 * @author heejin
 * @date 2023. 8. 2. - 오전 11:14:57
 * @subject	클래스들 간의 관계
 * @content	1) has-a 관계
 * 					2) is-a 관계 (상속)
 */
public class Ex02 {
	public static void main(String[] args) {
		// [ 상속 ( inheritance / inherit ) ]
		// 1. 상속? 기존에 존재하는 클래스를 재사용하여 새로운 클래스로 작성하는 것
		// 2. 상속 장점
		//		- 코드 재사용  -> 생산성 향상, 유지보수 용이
		// 3. 상속 + 클래스 선언 형식
		//		접근지정자 기타제어자 class 새클래스명 extends 기존클래스 {
		//		}
		// 4. 기존클래스 == [부모클래스], 상위클래스, [Super클래스], 기초클래스
		//	   새클래스 == [자식클래스], 하위클래스, [Sub클래스], 파생클래스
		// 5. 예) Point : 좌표를 관리하는 기능이 구현된 클래스
		//			2차원		x, y 좌표
		//			3차원		x, y, z 좌표
		//
	} //main
	
class Point2D {
	int x;
	int y;
	Point2D() {}
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
} //class Point2D

class Point3D extends Point2D {
int z;
Point3D() {}
Point3D(int x, int y, int z) {
//	this.x = x;
//	this.y = y;
	super(x,y); // super : 부모의 주소값을 참조하는 키워드
					// Point2D(int x, int y) 부모의 생성자 호출
					// this()와 같이 항상 첫번째 줄에 와야함
	this.z = z;
}
} //class Point3D

//class Point3D {
//	int x;
//	int y;
//	int z;
//	Point3D() {}
//	Point3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//} //class Point3D

} //class