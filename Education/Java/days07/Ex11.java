package Education.Java.days07;

/**
 * @author heejin
 * @date 2023. 7. 21. - 오후 4:14:34
 * @subject	
 * @content
 */
public class Ex11 {
	
	static int x,y;
	
	public static void main(String[] args) {
	
		x=10;
		y=20;
		
		System.out.printf("> x=%d, y=%d\n", x,y);
		
		swap();
		
		System.out.printf("> x=%d, y=%d\n", x,y);
		
	} //main

	public static void swap() {
		int temp = x;
		x=y;
		y=temp;
	}
	
} //class
