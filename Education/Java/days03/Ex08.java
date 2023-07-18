package Education.Java.days03;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 3:26:46
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// Type mismatch: cannot convert from double to float
		// float pi = 3.141592;
		float pi = 3.141592f;  // 혹은 float pi = 3.141592F; 혹은 float pi = (float)3.141592;
		
		// 소수점 4번째 자리에서 반올림한 실수값을 얻어와서 출력...    3.142
		System.out.printf("%.3f\n", pi);
				
		// [방법 1] 소수점 4번째 자리에서 반올림한 실수값을 pi에 저장
		 String.format("%.3f\n", pi);	// "3.142"
		 pi = Float.parseFloat(String.format("%.3f", pi));
		 System.out.println(pi);
		

		// [방법 2] 소수점 4번째 자리에서 절삭한 실수값을 얻어와서 출력...  
		System.out.println( pi * 1000 + 0.5 );   // 3142.092041015625
		System.out.println( (int)(pi * 1000 + 0.5) );   // 3142
		System.out.println( (int)(pi * 1000 + 0.5) / 1000f );   // 3.142
		
		
	}//main

}//class
