package Education.Java.days21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex14 {
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
		// size() : list의 용량이 아닌 저장된 요소의 개수를 반환함
		// System.out.println( team1.size() );  // 0
		
		String t1 = "이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 ";
		// replaceAll에서는 첫번째 인자로 regex를 받기 때문에 정규표현식을 적어야한다.
		t1 = t1.replaceAll("\\(팀장\\)", "");
		// t1 = t1.replace("(팀장)", "");
		
		String[] t1Arr = t1.split("\\s*,\\s*");
		for (int i = 0; i < t1Arr.length; i++) {
			team1.add(t1Arr[i]);
		} // for
		// System.out.println( team1 );
		
		
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
		
		
		// iterator() class5 모든 요소 출력
		Iterator ir = class5.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			//System.out.println( name );
		} //while
		
		// team1의 모든 요소가 class5에 있는가
		System.out.println( class5.containsAll(team1) );
		
		// 원본 그대로 유지 - 복제본		수정, 삭제, 추가
		ArrayList class5Clone = (ArrayList) class5.clone();	//clone()은 리턴이 Object이므로 다운캐스팅 필요
		// 2 + 3조원
		class5Clone.removeAll(team1);
		System.out.println( class5Clone );
		
		
		// class5 - 이름 오름차순으로 정렬
		// comparator : 정렬할때 기준이 되는 비교기
		class5Clone.sort( new Class5Comparator() );
		System.out.println( class5Clone );
	} //main
} //class


class Class5Comparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// o1 instansof String
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s1.compareTo(s2);
	}
	
} //class Class5Comparator