package Education.Java.days08;

/**
 * @author heejin
 * @date 2023. 7. 24. - 오전 11:15:40
 * @subject	지역변수 개념
 * @content
 * 					함수 호출 + 매개변수 가지고 
 * 					1) Call By Name			drawLine();
 * 					2) Call By Value			drawLine(10,"*");
 * 					3) Call By Reference		
 * 					4) Call By Point			<- C언어
 */
public class Ex04_02 {

	public static void main(String[] args) {

		// 배열 초기화
		int[] m= {10,20};

		System.out.printf("> x=%d, y=%d\n", m[0],m[1]);

		// Call By Value
		// Call By Reference .main 함수의 x,y 참조
		// 매개변수를 참조타입을 사용하겠다. - 배열, 클래스, 인터페이스
		swap(m);	// 배열의 시작 주소를 매개변수로 넘겨줌
						// 10과 20은 m에 저장된 것이 아니라 Heap영역에 저장되어있다. m은 이 Heap의 주소를 참조하고 있을 뿐이다.
						// swap m에 main m이 가지고 있는 Heap의 주소를 넘겨준 것이므로 같은 값이 출력된다. 

		System.out.printf("> x=%d, y=%d\n", m[0],m[1]);	//x=10, y=20

	} //main

	public static void swap(int [] m) {
		int temp = m[0];
		m[0]=m[1];
		m[1]=temp;
	} //swap
	
} //class