package days23;

import java.util.TreeSet;

/**
 * @author kenik
 * @date 2023. 8. 14. - 오후 2:22:04
 * @subject
 * @content
 */
public class Ex05_02 {
	
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("abc");		ts.add("alien");		ts.add("bat");
		ts.add("car");		ts.add("Car");		ts.add("disc");
		ts.add("dance");		ts.add("dzzz");		ts.add("dzzzz");
		ts.add("elephant");		ts.add("elevator");		ts.add("fan");
		ts.add("flower");	
		
		System.out.println( ts ); // 오름차순 정렬
		
		// 범위 검색
		// [abc, alien, bat, car]
		System.out.println( ts.subSet("a", "d"));		
		//[car, dance, disc] 
		System.out.println( ts.subSet("c", "dzzz"));
	} // main

}
