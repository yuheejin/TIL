package Education.Java.days01;

import days13.Time;

public class Ex07_TimTest {
	public static void main(String[] args) {
		// days13.Time + days01.Ex07_TimeTest
		//	패키지 외부,		내부X
		Time t = new Time();
		t.hour = 1;		// public 패키지 내부, 외부 어디서든 접근 가능
		// t.second 	// protected 패키지 내부 또는 상속관계일때 접근 가능, 여기서는 사용 불가능
		// t.minut;		// dafault
		// t.milisecond	// private
		
		
	} //main
	
} //class
