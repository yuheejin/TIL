package Education.Java.days15;

// [ 사원 클래스 ]
// 모든 사원들이 공통적으로 가져야할 멤버(필드, 메서드)를 구현한 클래스
public abstract class Employee {
	// 필드
	private String name;	// 사원명
	private String addr;		// 사원주소
	private String tel;		// 연락처
	private String hiredate;	// 입사일자

	// 생성자
	public Employee() {
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	// 메서드
	// 사원들의 정보를 출력하는 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n", this.name, this.addr, this.tel, this.hiredate);
	} //dispEmpInfo

	@Override
	public String toString() {
		return String.format("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s", this.name, this.addr, this.tel, this.hiredate);
	}


	/*
	// 물려받는 자식이 오버라이딩해서 써라
	// 기능은 없는데 함수룰 만들어 놓으면, 업캐스팅 할 경우 사용 가능
	// c언어에서의 virtual method와 같음
	public int getPay() {
		return 0;
	}
	 */
	
	// This method requires a body instead of a semicolon
	// body {} 몸체가 구현이 안된 불완전한 메서드
	// 추상 메서드
	// abstract 키워드 붙인다.
	// The abstract method getPay in type Employee can only be defined by an abstract class
	// abstract 메서드가 1개라도 있다면 불완전한 클래스이고, 객체를 생성할 수 없다.
	// 이를 추상클래스 abstract class라고 한다.
	public abstract int getPay();

} //class