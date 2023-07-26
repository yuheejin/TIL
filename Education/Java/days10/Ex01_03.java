package Education.Java.days10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_03 {
	public static void main(String[] args) {
		
		int n = 125;  // 0x7D
		
		// 0123456789ABCDEF
		int share, reminder;
		
		String hex = "0123456789ABCDEF";
		StringBuilder sb = new StringBuilder();
		while(n!=0) {
			share = n/16;
			reminder = n%16;
			sb.append( hex.charAt(reminder) );
			n = share;
		} //while
		System.out.printf("0x%s\n",sb.reverse());
		
	} //main
} //class