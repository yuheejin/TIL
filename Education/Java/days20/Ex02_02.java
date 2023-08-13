package Education.Java.days20;

import java.util.Date;

public class Ex02_02 {
	public static void main(String[] args) {		
		Date d = new Date(2023-1900, 8-1, 9);
		Date today = new Date();
		
		/*
		// [1]
		int index = d.toLocaleString().lastIndexOf(".");
		System.out.println( index );
		
		String s1 = d.toLocaleString().substring(0, index);
		String s2 = today.toLocaleString().substring(0, index);
		
		System.out.println(s1.equals(s2);
		*/
		
		/*
		// [2]
		today.setHours(0);
		today.setMinutes(0);
		today.setSeconds(0);
		
		System.out.println( d.toLocaleString().equals( today.toLocaleString() ) );
		
		System.out.println( d.equals(today));
		System.out.println( d.after(today));
		System.out.println( d.before(today));
		*/
		
		// [3]
		today.setHours(0);
		today.setMinutes(0);
		today.setSeconds(0);
		long tgt = today.getTime();
		System.out.println( tgt );
		System.out.println( tgt/1000 );
		System.out.println( tgt/1000*1000 );
		
		today = new Date(tgt/1000*1000);
		System.out.println( d.equals(today) );
		
	} //main
} //class