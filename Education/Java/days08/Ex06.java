package Education.Java.days08;

/**
 * @author heejin
 * @date 2023. 7. 24. - 오후 12:16:24
 * @subject	재귀함수( recursive function )
 * @content	순환, 되풀이되는, 재귀하는
 * 					함수 안에서 자기 자신을 다시 호출하는 함수를 "재귀[호출]함수"
 * 					트리구조 - 검색 할때, 사용됨
 * 					그 외의 경우는 성능이 매우 떨어지므로 가급적 사용하지 말것
 */
public class Ex06 {
	public static void main(String[] args) {
		
		disp();	// 함수 호출
		
	} //main

	// 재귀 함수
	private static void disp() {
		System.out.println("> disp() 호출됨... ");
		
		disp();
	}

} //class