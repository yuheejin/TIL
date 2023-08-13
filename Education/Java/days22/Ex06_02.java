package Education.Java.days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex06_02 {
	public static void main(String[] args) {
		// 2) ArrayList -> String [] 변환
		ArrayList list = new ArrayList();
		list.add("신종혁");
		list.add("고경림");
		list.add("이재영");
		
		// [1]
		/*
		String [] nameArr = new String[list.size()];
		Iterator ir = list.iterator();
		int index = 0;
		while (ir.hasNext()) {
			String name = (String) ir.next();
			nameArr[index++] = name;
		} //while
		System.out.println( list );
		*/
		
		// [2] list.toArray()은 Object[]을 반환한다.
		//		따라서 Object[] -> String[] 형변환 해주어야 한다.
		String [] nameArr = (String[]) list.toArray( new String[list.size()] );
		System.out.println( Arrays.toString( nameArr ) );
		
		
	} //main
} //class