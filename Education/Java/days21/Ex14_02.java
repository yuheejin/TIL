package Education.Java.days21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex14_02 {
	public static void main(String[] args) {
		/*
		1조
		이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 
		2조
		박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영
		3조
		박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민
		*/
		
		ArrayList team1 = new ArrayList();
		
		String t1 = "이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 ";
		t1 = t1.replaceAll("\\(팀장\\)", "");
		String[] t1Arr = t1.split("\\s*,\\s*");
		for (int i = 0; i < t1Arr.length; i++) {
			team1.add(t1Arr[i]);
		} // for
				
		ArrayList team2 = new ArrayList();
		team2.add("박민석");
		team2.add("유희진");
		team2.add("고경림");

		ArrayList team3 = new ArrayList();
		team3.add("박정호");
		team3.add("이상문");
		team3.add("이주영");
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		System.out.println( class5 );
				
		ArrayList<String> class5Clone = (ArrayList) class5.clone();
		
		
		// class5 - 이름 오름차순으로 정렬
		// comparator : 정렬할때 기준이 되는 비교기
		/*
		//						무명(익명)클래스
		class5Clone.sort( new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		} );
		System.out.println( class5Clone );
		*/
		
		class5Clone.sort( (o1,o2) -> o1.compareTo(o2) );
		System.out.println( class5Clone );
				
		
	} //main
} //class
