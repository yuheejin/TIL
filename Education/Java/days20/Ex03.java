package Education.Java.days20;

import java.util.Date;

// 3.개강일(2023.7.13 9:00:00)로 부터 오늘까지 지난 일수 계산을 하세요.
public class Ex03 {
	public static void main(String[] args) {
		Date today = new Date();
		Date startDay = new Date(2023-1900,7-1,13,9,0,0);

		// System.out.println(startDay.getTime()); //1689206400000
		// System.out.println(today.getTime()); //1691546645023

		long diff = today.getTime() - startDay.getTime();
		System.out.println(diff+"\n");
		/*
		System.out.println( diff + "ms" );
		System.out.println( diff/1000 + "s" );
		System.out.println( diff/(1000*60) + "m" );
		System.out.println( diff/(1000*60*60) + "h" );
		System.out.println( diff/(1000*60*60*24) + "d" );
		*/
		String[] dd = {"ms", "s", "m", "h", "day"};
		int[] d = {1,1000,1000*60,1000*60*60,1000*60*60*24};
		long[] dCount = new long[d.length];

		for (int i = d.length-1; i >=0; i--) {
			dCount[i] = diff/d[i];
			diff = diff%d[i];
			System.out.printf("%d%s   ", dCount[i], dd[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} //for
		
		
	} //main

} //class