package Education.Java.days01;

// Tv의 접근지정자가 default일때 나타나는 에러
// 다른 패키지에서도 사용이 가능하게 하기 위해서는 Tv 클래스의 접근지정자를 public으로 해야함
// The type days13.Tv is not visible
// import days13.Tv;

public class Ex06_TvTest {
	public static void main(String[] args) {
		// public Tv 클래스를 패키지 외부에서 상속, 참조 확인
		// days13.Tv
		// days01.Ex06_TvTest 
		
		// Tv cannot be resolved to a type
		// Tv tv1 = new Tv();
		System.out.println( tv1.power );
		
	} //main
} //class
