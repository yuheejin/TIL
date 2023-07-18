package Education.Java.days01;

public class Ex04_02 {

	// 본인의 이름을 name이라는 변수를 선언하고
	// 본인의 나이를 age라는 변수를 선언하고
	// 이름과 나이를 출력하는 코딩을 하세요.
	public static void main(String[] args) {
				
		String name = "heejin";
		// Type mismatch: cannot convert from int to String
		// 값은 int형인데, 변수의 자료형이 String이기 때문에 err가 생김
		// String age = 27;
		int age = 27;
		
		System.out.println("name: " + name + ", age: " + age);
		
	} //main
} //class
