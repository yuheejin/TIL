package Education.Java.days20;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Date;
import java.util.Scanner;

/*2. java.util.Date 클래스를 사용하여 달력 그리기.
    
   [출력결과]
   
              2023.08
   ┌─┬─┬─┬─┬─┬─┬─┐ 
   │일│월│화│수│목│금│토│
   ├─┼─┼─┼─┼─┼─┼─┤
   │  │  │ 1│ 2│ 3│ 4│ 5│  
   ├─┼─┼─┼─┼─┼─┼─┤
   │ 6│ 7│ 8│*9│10│11│12│  
   ├─┼─┼─┼─┼─┼─┼─┤
   │13│14│15│16│17│18│19│  
   ├─┼─┼─┼─┼─┼─┼─┤
   │20│21│22│23│24│25│26│  
   ├─┼─┼─┼─┼─┼─┼─┤
   │27│28│29│30│31│  │  │
   └─┴─┴─┴─┴─┴─┴─┘  
   */

public class Ex02 {
	public static void main(String[] args) {
		int year=2023, month=8;
		int lastDay = getLastOfDay(year, month);
		int startWeek = getWeek(year, month);
		System.out.printf("\t\t\t%d.%02d\n", year, month);
		System.out.print("┌──┬──┬──┬──┬──┬──┬──┐\n"
								+ " |일\t│월\t│화\t│수\t│목\t│금\t│토\t│\n"
								+ " ├─────┼──────┼──────┼──────┼──────┼──────┼──────┤\n");
		Date today = new Date();
		int d = today.getDate();
		for (int i = 1; i <= lastDay+startWeek+1; i++) {
			System.out.printf( " |%s\t",((i-startWeek)<1 || (i-startWeek)>(lastDay))? "  " : (i-startWeek)==d? "*"+Integer.toString(i-startWeek): Integer.toString(i-startWeek));
			if (i%7==0) System.out.print("|\n ├─────┼──────┼──────┼──────┼──────┼──────┼──────┤\n");
		} // for

		System.out.print("| \n└──┴──┴──┴──┴──┴──┴──┘");
	} //main

	private static int getWeek(int year, int month) {
		Date d = new Date(year-1900, month-1, 1);
		return d.getDay();
	}

	private static int getLastOfDay(int year, int month) {
		Date d = new Date(year-1900, month, 1);
		int day = d.getDate()-1;
		d.setDate(day);		
		return d.getDate();
	}
	
	public static boolean isEqualsDate(Date d1, Date d2) {
		int index = 10;   // d1.toLocaleString().lastIndexOf(".");
		
		String s1 = d1.toLocaleString().substring(0, index);
		String s2 = d2.toLocaleString().substring(0, index);
		
		return s1.equals(s2);
	}
} //class