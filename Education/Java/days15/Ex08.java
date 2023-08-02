package Education.Java.days15;

public class Ex08 {
	public static void main(String[] args) {
		/*
		// [1]
		Employee emp1 = new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		emp1.dispEmpInfo();
		// Object.toString() -> Overriding
		//									Object 클래스를 상속 받았기 때문에 사용 가능
		System.out.println( emp1.toString() );
		System.out.println( emp1 );
		*/
		
		// is-a 관계 (상속)
		// 정규직사원은 사원이다. O
		
		/*
		// [2]
		Regular emp2 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		// 문제점 : 기본급 출력이 없다.
		emp2.dispEmpInfo();
		System.out.println( emp2 );	// @toString()
		*/

		/*
		// [3]
		// Employee = Regular  클래스들간의 자동형변환
		// [ 업캐스팅(upcasting) ]  상속관계에 있는 클래스간의 형변환
		// 부모클래스 emp2 = new 자식클래스
		Employee emp2 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		// Employee의 dispEmpInfo()가 아니라 Regular의 dispEmpInfo()가 출력되는 이유
		// 
		emp2.dispEmpInfo();
		// [업캐스팅 - 문제점]
		// The method getPay() is undefined for the type Employee
		// emp2.getPay();
		
		// [다운캐스팅]  반드시 캐스트 연산자 () 를 사용해서 형변환 해야한다.
		// (조건) 업캐스팅한 객체에 대해서만 다운캐스팅이 가능하다.
		Regular emp = (Regular) emp2;
		*/
		
		/*
		// 컴파일 오류
		// Type mismatch: cannot convert from Employee to Regular
		// 실행 오류
		// java.lang.ClassCastException
		Regular emp = (Regular) new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		emp.getPay();
		*/
		
		/*
		// [4] SalesMan, Regular, Employee
		Employee emp3 = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		emp3.dispEmpInfo();
		System.out.println( emp3.getPay() );
		*/
		
		
		// [5] 
		Employee emp4 = new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		emp4.dispEmpInfo();
		System.out.println( emp4.getPay() ); // 호출 안됨
		
		
		
	} //main
} //class