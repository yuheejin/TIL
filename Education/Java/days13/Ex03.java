package Education.Java.days13;

public class Ex03 {
	public static void main(String[] args) {
		// 1. Tv 클래스 선언 - Tv.java
		// 2. Rv 객체 생성
		Tv tv1 = null;
		tv1 = new Tv();	
		
		// tv1	 →	[color] [power] [channel] [메서드 주소][메서드 주소][...]
		//												메서드는 해당 클래스의 객체가 한번 생성되면 코드메모리에 올라감
		//												올라간 메서드의 주소를 참조함
		
		// 클래스 사용할때 NullPointerException 에러 제일 많이 발생
		// java.lang.NullPointerException
		
		//			멤버를 가리킬때
		// 겍체명.필드명
		// 객체명.메서드명()
		tv1.powerOnOff();
		System.out.println( "Tv : " + (tv1.power? "ON" : "OFF") );
		tv1.channelUp();
		System.out.println("현재 채널 : " + tv1.channel);
		tv1.powerOnOff();
		System.out.println( "Tv : " + (tv1.power? "ON" : "OFF") );
		System.out.println("  end  ");
		
	} //main

} //class