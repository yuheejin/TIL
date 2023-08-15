package Education.Java.days06;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex01_03 {
	public static void main(String[] args) {

		// 10개 정수 배열 -> 가장 큰값 (람다식과 스트림)
		// 5<=  <16 의 랜덤한 수를 10개의 인덱스를 가진 배열 선언
		int [] m = new Random().ints(5, 16).limit(10).toArray();
		// 배열 m 을 문자열로 출력
		System.out.println(Arrays.toString(m));
		
		// 5<=  <16 의 랜덤한 수를 10개의 인덱스를 가진 배열에서 max 값을 int로 get 가져옴
		int max = new Random().ints(5, 16).limit(10).max().getAsInt();
		System.out.println(max);
		
		
		// -----------------------
		int a=5, b=7, c=1;
		
		// 1. jdk 1.5 제네릭
		// 2. jdk 1.8 람다식과 스트림
		System.out.println( IntStream.of(a,b,c).max() );  		// OptionalInt[7]
		
		/* [1]
		int max = IntStream.of(a,b,c).max().getAsInt();
		System.out.println(max);
		*/
		
		// [2] System.out::println <- 메서드 참조
		IntStream.of(a,b,c).max().ifPresent(System.out::println);
				
	} //main	
} // class
