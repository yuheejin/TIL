package days03;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오후 3:26:24
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// Type mismatch: cannot convert from double to float
		// float pi = (float) 3.141592;
		float pi = 3.141592f;
		// 소수점 4번째 자리에서 반올림한 실수값을 얻어와서 
		// 소수점 4번째 자리에서 절삭한 실수값을 얻어와서 
		// 출력..             3.142
		// [2]
		System.out.println( pi * 1000 + 0.5 );            // 3141.592
		System.out.println( (int)(pi * 1000 + 0.5) );     // 3141
		System.out.println( (int)(pi * 1000 + 0.5)/1000f ); // 3.141
				
		
		// [1]
		// 변수에 저장해서 출력...
		// System.out.printf("%.3f\n", pi);
		
		// pi = Float.parseFloat( String.format("%.3f", pi) ); // "3.142"
		// System.out.println( pi );
		

	} // main

} // class






