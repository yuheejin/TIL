package Education.Java.days22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex13 {
	public static void main(String[] args) {
		// Comparable 인터페이스 : 기본 정렬 기준을 구현
		// Comparator 인터페이스 : 기본 정렬 기준을 구현외에 다른 기준으로 정렬하고자 할 때 사용
		
		// public final class String implements java.io.Serializable, Comparable<String>, CharSequence
		String [] names = {"이지현", "임경재", "김호용", "유희진"};
		System.out.println( Arrays.toString(names) );
		
		//Arrays.sort(names);
		//System.out.println( Arrays.toString(names) );
		
		// 내림차순으로 정렬
		// Arrays.sort(names, new StringDescendingComparator());
		// Collections.reverseOrder();
		// Comparator.reverseOrder();
		
		// 대소문자를 구분하지 않고 오름차순으로 정렬
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		System.out.println( Arrays.toString(names) );
		
		// compareTo() 재정의 함수
		
	} //main
} //class

class StringDescendingComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//return o1.compareTo(o2); // 오름차순
		return o2.compareTo(o1); // 내림차순
	}
	
}