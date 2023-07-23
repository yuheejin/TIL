package Education.Java.days07;

/**
 * @author heejin
 * @date 2023. 7. 21. - 오후 4:14:34
 * @subject	
 * @content
 */
public class Ex10 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 두 정수의 합을 구해서 반환하는 
		// 1. sum() 함수 선언
		// 2. sum() 함수 호출
		int result = sum(a,b);
//		int d = 40;
//		int result = sum(a,b,c,d);
		
		
		System.out.printf("%d+%d=%d\n", a, b, result);
		
	} //main
	
	public static int sum(int a, int b) {
		return a+b;		// return 수식;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;		// return 수식;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;		// return 수식;
	}
	
} //class
