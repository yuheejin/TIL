package Education.Java.days14;

public class Ex09 {
	
	// static main() 메서드
	// static은 객체를 생성하지 않아도 Method 영역에 올라가 실행됨
	// main은 프로그램에 올라가자마자 바로 실행할 수 있게하기 위해서 static이 붙음
	public static void main(String[] args) {

		//		Ex09 obj = new Ex09();
		//		obj.sum(1, 2);

		// 클래스명.static메서드명();
		Ex09.sum(1, 2);

		// 같은 클래스 안이기 때문에 클래스명을 안 적어도 됨
		sum(1, 2);

	} //main

	public static int sum (int a, int b) {
		return a+b;
	} //sum

} //class