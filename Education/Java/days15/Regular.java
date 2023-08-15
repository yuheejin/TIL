package Education.Java.days15;

// [정규직] 사원클래스
public class Regular extends Employee {
	// [ Object ] 멤버들도 상속
	// [ Employee ]
	// 필드 - name, addr, tel, hiredate
	// 생성자 X
	// 메서드 - dispEmpInfo(), @toString(), 
	private int basePay;		// 기본급

	// 생성자
	public Regular() {
		super();	// 생략하면 컴파일러가 자동으로 생성 후 컴파일 한다.
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		/*
		// [1]
		// The field Employee.name is not visible
		// 접근지정자 private로 선언되었기 때문에 보이지 않음
		// this.name = name;
		this.setName(name);
		this.setAddr(addr);
		this.setTel(tel);
		this.setHiredate(hiredata);
		*/
		
		//[2]
		super(name, addr, tel, hiredate);	// 부모 상속된 필드 초기화
		
		this.basePay = basePay;
		System.out.println("> Regular 5 생성자 호출됨.");
	}

	
	// getter, setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	
	// 메서드
	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo();	// super의 용도 1) 부모의 멤버들을 가리킬 때 사용
		System.out.printf( ", 기본급:%d", this.basePay );
		*/
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d\n", this.getName(), this.getAddr(), this.getTel(), this.getHiredate(), this.basePay);
	}

	@Override
	public String toString() {
		return super.toString() + String.format( ", 기본급:%d", this.basePay );
	}
	
	@Override
	public int getPay() {
		return this.basePay;
	}
	
	
} //class