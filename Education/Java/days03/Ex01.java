package days03;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오전 7:16:08
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) { 
		// 11:03 수업시작~
		String name = "홍길동";
		System.out.printf("%s\n", name); // Ctrl + Alt + ↓
		System.out.printf("[%s]\n", name);
		System.out.printf("[%10s]\n", name);
		System.out.printf("[%-10s]\n", name); 
		
		// byte, short, int, long %d, %o, %x
		int n = 50;
		System.out.printf("%d\n", n);  // 50
		System.out.printf("%#o\n", n);  // 062     flag
		System.out.printf("%#x\n", n);  // 0x32
		
		double pi = 3.141592;
		System.out.printf("%f\n", pi);
		System.out.printf("%.3f\n", pi); // 자동 반올림 처리.
		System.out.printf("[%10.3f]\n", pi); // 자동 반올림 처리.
		
		int no = 1;  // 0001
		System.out.printf("%d\n", no);
		System.out.printf("%4d\n", no);
		System.out.printf("%04d\n", no); // *** (기억)
		
		System.out.printf("%d(%c)\n", 65, 65);
		// java.util.MissingFormatArgumentException: Format specifier '%c'
		System.out.printf("%1$d(%1$c)\n", 65);
		
		//System.out.printf("홍길동");
		

	} // main

} // class
