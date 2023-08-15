package Education.Java.days10;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		//		System.out.printf("%d\t%d\n", (int)'가', (int)'힣');  /44032	55203

		Random rnd = new Random();
		char one = (char)(rnd.nextInt('힣'-'가'+1) + '가');
		System.out.println( one );
	} //main
} //class