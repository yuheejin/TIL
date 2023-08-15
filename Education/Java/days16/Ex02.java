package Education.Java.days16;

// Ctrl + Shift + O 를 하면 자동으로 import문 생성
import Education.Java.days15.Employee;
import Education.Java.days15.Regular;
import Education.Java.days15.SalesMan;
import Education.Java.days15.Temp;

public class Ex02 {
	public static void main(String[] args) {
		Regular e1 = new Regular();
		dispGetPay(e1);
		SalesMan e2 = new SalesMan();
		dispGetPay(e2);
		Temp e3 = new Temp();
		dispGetPay(e3);
	} //main

	// 인스턴스 메서드 -> 클래스 메서드 : static
	//										매개변수 다형성
	public static void dispGetPay(Employee emp) {
		// emp가 Regular, SalesMan, Temp 인지 확인할 수 있는 연산자 : instanceof
		// 상속관계가 있는 클래스들은 자식먼저 물어봐야 함
		// SalesMan은 Regular를 상속받았으므로, Regular도 맞기 때문이다.
		if ( emp instanceof SalesMan ) {
			System.out.println("> emp 객체는 SalesMan 타입이다.");
			SalesMan s1 = (SalesMan)emp;
		} else if ( emp instanceof Regular ) {
			System.out.println("> emp 객체는 Regular 타입이다.");
			Regular r1 = (Regular)emp;
		} else if (emp instanceof Temp) {
			System.out.println("> emp 객체는 Temp 타입이다.");
			Temp t1 = (Temp)emp;
		}//if
	} //dispGetPay
	
} //class