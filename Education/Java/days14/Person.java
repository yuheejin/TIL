package Education.Java.days14;
// Ex04
public class Person {
	// 필드
	private String name;
	private int age;
	private boolean gender;
	
	public Person() {
	} //default constructor

	public Person(boolean b) {
		gender = b;
	} //constructor

	// getter, setter 선언
	// [단축키] Alt+Shift+s
	public String getName() {
		return name;
	} //getName

	public void setName(String name) {
		this.name = name;
	} //setName
	
	public void setAge(int n) {
		if ( 0<=n && n<=130) {
			age =n;
		} else {
			// 강제로 예외(오류)를 발생
			// [예외처리] throw문 - 강제로 예외 던지다
			throw new RuntimeException("Person.age 0~130 실행오류");
		}; //if
	} //setAge

	public int getAge() {
		return age;
	} //getAge

	// boolean형은 get이 아닌 is로 생성
	// gender 필드는 읽기 전용으로만 사용
	public boolean isGender() {
		return gender;
	} //isGender

//	public void setGender(boolean gender) {
//		this.gender = gender;
//	} //setGender

	// 
	
} //class