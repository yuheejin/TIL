package Education.Java.days07;

/**
 * @author heejin
 * @date 2023. 7. 21. - 오후 4:14:34
 * @subject	
 * @content
 */
public class Ex10_02 {
	public static void main(String[] args) {
		int result = 0;
		
		result = sum(1,2);
		System.out.println(result);
		
		result = sum(1,2,3,4);
		System.out.println(result);
		
		
		int [] m = {100,200,300,400};
		result = sum(m);
		System.out.println(result);
		
	} //main
	
	//							  가변인자
	public static int sum( int... n ) {
		int result = 0;
		for (int i = 0; i < n.length; i++) {
			result += n[i];
		} //for
		return result;		// return 수식;
	}
	
} //class
