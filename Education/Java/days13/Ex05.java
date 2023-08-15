package Education.Java.days13;

public class Ex05 {
	public static void main(String[] args) {
		// 배열로 선언
		// Tv tv1 = new Tv();
		// Tv tv2 = new Tv();
		// Tv tv3 = new Tv();

		// [클래스 배열]
		// 배열 선언 형식
		// 자료형 [] 배열명 = new 자료형 [배열크기];
		//		Tv[] tvArr = new Tv[3];
		//		// tvArr      ->     [null][null][null]
		//		// 스택					힙
		//		// 배열					객체    객체    객체
		//		
		//		// java.lang.NullPointerException
		//		tvArr[0].powerOnOff();
		//		System.out.println( "Tv : " + (tvArr[0].power? "ON" : "OFF") );
		//		tvArr[0].channelUp();
		//		System.out.println("현재 채널 : " + tvArr[0].channel);
		//		tvArr[0].powerOnOff();
		//		System.out.println( "Tv : " + (tvArr[0].power? "ON" : "OFF") );
		//		System.out.println("  end  ");

		Tv[] tvArr = new Tv[3];
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
		} // for

		tvArr[0].powerOnOff();
		System.out.println( "Tv : " + (tvArr[0].power? "ON" : "OFF") );
		tvArr[0].channelUp();
		System.out.println("현재 채널 : " + tvArr[0].channel);
		tvArr[0].powerOnOff();
		System.out.println( "Tv : " + (tvArr[0].power? "ON" : "OFF") );
		System.out.println("  end  ");

	} //main

} //class
