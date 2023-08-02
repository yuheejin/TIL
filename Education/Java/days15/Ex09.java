package Education.Java.days15;

public class Ex09 {
	public static void main(String[] args) {

		// 1) 문제점
		// 		Employee e1 = new Regular();
		// 		Employee e1 = new SalesMan();
		// 		Employee e1 = new Temp();
		//		e1.getPay();
		//		Employee 안에 getPay()가 없었기 때문에 사용 못함
		//		왜?? Employee 클래스 안에 getPay() 메서드 선언 안했는가...
		//		=> Employee 클래스 안에 getPay() 메서드 선언

		// 학생 관리 : 초등, 중등, 고등, 대학생...
		// 추상 클래스 -> 학생 클래스 : 공통적으로 가지고 있어야할 멤버 선언

		// [ 다형성 ] "여러 가지 형태를 가질 수 있는 능력"
		// Employee e1 = new Regular();
		// Employee e2 = new SalesMan();
		// Employee e3 = new Temp();

		// Cannot instantiate the type Employee
		// Employee는 abstract class이기 때문에 인스턴스화 할 수 없다.
		// Employee emp1 = new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		/*
		Regular emp1 = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		SalesMan emp2 = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		Temp emp3 = new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);

		emp1.getPay();
		emp2.getPay();
		emp3.getPay();
		 */

		/*
		Employee [] emps = new Employee[3];
		emps[0] = new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		emps[1] = new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		emps[2] =new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		 */
		
		Employee [] emps = {
				new Regular("주강민", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000),
				new SalesMan("임경재", "경기도 성남시", "010-9837-2342", "2021.03.12", 500000, 20, 70000),
				new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000)
		};

		for (int i = 0; i < emps.length; i++) {
			emps[i].getPay();
		} // for

	} //main
	
	// 사원 급여 출력메서드 
	public static void dispGetPay(Employee emp) { // 매개변수 다형성
		System.out.println( emp.getPay() );
	}
	
	// 오버로딩(중복함수)
	/*
	public void dispGetPay(Regular emp) {
		System.out.println( emp.getPay() );
	}
	public void dispGetPay(SalesMan emp) {
		System.out.println( emp.getPay() );
	}
	public void dispGetPay(Temp emp) {
		System.out.println( emp.getPay() );
	}
	*/
	
} //class