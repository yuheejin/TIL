package Education.Java.days14;

/**
 * @author heejin
 * @date 2023. 8. 1. - 오후 2:11:33
 * @subject	static 키워드
 * @content	필드 앞에
 * 					메서드 앞에
 * 					클래스 앞에
 */
public class Ex07 {
	public static void main(String[] args) {
		// [우리반] -> 기업은행 -> 보통예금
		// Save 클래스 선언 : 저축
		//		Save s1 = new Save("주강민", 1000, 0.04);
		//		Save s2 = new Save("정하영", 1500, 0.04);
		//		Save s3 = new Save("임경재", 34500, 0.04);
		//		Save s4 = new Save("이지현", 5000, 0.04);
		//		Save s5 = new Save("이준희", 21000, 0.04);
		//		
		//		s1.dispSave();
		//		s2.dispSave();
		//		s3.dispSave();
		//		s4.dispSave();
		//		s5.dispSave();

		//		// 클래스 배열 선언
		//		Save [] ss = {
		//				new Save("주강민", 1000, 0.04),
		//				new Save("정하영", 1500, 0.04),
		//				new Save("임경재", 34500, 0.04),
		//				new Save("이지현", 5000, 0.04),
		//				new Save("이준희", 21000, 0.04)		
		//		};
		//		
		//		for (int i = 0; i < ss.length; i++) {
		//			ss[i].dispSave();
		//		} // for

		// [파악] 모든 사람의 이자율(rate)는 동일할 것이다.
		// Save 객체가 생성될 때마다 rate(8byte) 필드 필요 없음
		// Save 클래스 당 1개만 rate 필드 생성해서 모든 인스턴스(객체)가 공유해서 사용할 필드를 선언

		// 인스턴스 변수 - 객체명.필드, 객체명.메서드
		// 클래스 변수 - 클래스명.필드. 클래스명,메서드
		// The field Save.rate is not visible
		// 메모리에 올라가 있지만 접근지정자로 인해 rate에 접근할 수 없음 
		//											private
		System.out.println( Save.getRate() );

		// [질문1] rate 이자율 왜 static 필드로 선언했나요?
		//				== static 필드는 언제 사용하나요?
		//	해당 클래스로 생성된 객체가 모두 공통된 값을 갖을 경우, static 변수로 선언해서 메모리의 낭비를 줄인다.

		// [질문2] static 메서드는 언제 사용하나요?
		// -> static으로 선언된 필드를 사용하기 위해서 

		Save.setRate(0.0);
		System.out.println( Save.getRate() );

		// 클래스명.필드, 클래스명.메서드 뿐만 아니라
		// 생성된 객체를 사용해서 static 변수를 변경할 수도 있다.
		// 	why? 같은 곳을 참조하고 있기 때문에
		Save s1 = new Save("주강민", 1000, 0.04);
		s1.setRate(0.5);
		System.out.println( Save.getRate() );

	} //main
} //class