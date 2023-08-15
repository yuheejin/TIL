package Education.Java.days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_03 {
	public static void main(String[] args) {
		String[] names = {"박민석", "유희진", "고경림", "임경재", "이지현" , "김정주", "김호영"};
		ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);			
		} // for
					
		// 팀에서 "김"씨 팀원만 삭제
		list.removeIf( n -> ((String)n).charAt(0)=='김' );
		System.out.println( list );
		
	} //main

} //class