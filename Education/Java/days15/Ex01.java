package Education.Java.days15;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {

		String n = "keNik";   
		String m= "kKnie";  
		System.out.println( n + "  /  " + m );

		// [1]
		char[] nArr = n.toUpperCase().toCharArray();
		char[] mArr = m.toUpperCase().toCharArray();
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		n = String.valueOf( nArr );
		m = String.valueOf( mArr );
		System.out.println( n.equals(m) );

		//		// [2]
		//		n = n.toUpperCase().chars().sorted()
		//				.collect(StringBuilder::new,
		//						StringBuilder::appendCodePoint,
		//						StringBuilder::append)
		//				.toString();
		//
		//		// [3]
		//		m = Stream.of(m.toUpperCase().split(""))
		//				.sorted()
		//				.collect(Collectors.joining());


		/*
		n = n.toUpperCase();
		m = m.toUpperCase();
		System.out.println( n + "  /  " + m );

		// 정렬 
		char [] nArr = n.toCharArray();
		Arrays.sort(nArr);
		System.out.println( Arrays.toString(nArr) );

		char [] mArr = m.toCharArray();
		Arrays.sort(mArr);
		System.out.println( Arrays.toString(mArr) );

		// char[] -> String n, m
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);
		System.out.println( n + "  /  " + m );

		System.out.println( n.equals(m) );
		 */

	} //main
} //class