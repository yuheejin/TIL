package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex01 {
	
	public static void main(String[] args) {
		// 로또 게임
		int n = 5; // 로또 게임 횟수
		
		/*
		LinkedHashSet lotto = new LinkedHashSet();
		// lotto.add(Object e)
		// Object -> 각 자료형으로 다운캐스팅 형변환
		String lotto.add("홍길동"); // String
		double lotto.add(3.14); // double
		boolean lotto.add(true); // boolean
		lotto.add('A');  // char
		lotto.add(100L); // long
		lotto.add(new Student()); // Student
	
		// lotto.get(0); X
		*/
		ArrayList<LinkedHashSet<Integer>> lottos =  new ArrayList<>();
		LinkedHashSet<Integer> lotto = null;
		int lottoNumber = -1;
		for (int i = 0; i < n; i++) { 
			lotto = new LinkedHashSet<>(6);
			while ( lotto.size() < 6 ) {
				lottoNumber = (int) (Math.random()*45) + 1; 
				lotto.add(lottoNumber);
			} // while			
			lottos.add(lotto);			
		} // for
		
		// 출력
		
		ArrayList<Integer> sList = null;
		
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();
		int no = 1;
		while (ir.hasNext()) {
			lotto = ir.next();
			sList = new ArrayList<Integer>(lotto);
			Collections.sort(sList);
			Iterator<Integer> ir2 = sList.iterator(); 
			System.out.printf("%d게임 : ", no++); 
			while (ir2.hasNext()) {
				// Integer -> int 오토 언박싱
				lottoNumber = ir2.next(); 
			    System.out.printf("[%02d]", lottoNumber);
			} // while
			System.out.println();
		} // while
		
		
	} // main

} // class