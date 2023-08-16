package days24;

class Ex14 {
	public static void main(String[] args) {
		// [ 열거형(enums) ]
		// 1. jdk 1.5 추가된 자료형
		// 2. 서로 관련된 상수를 편리하게 사용하기 위한 것
		//		예) 팀 프로젝트
		//			남자/여자 체크해서 코딩
		//			A팀원 1/0 체크해서 코딩
		//			B팀원 true/false 체크해서 코딩
		//			C팀원 'm'/'f' 체크해서 코딩
		//		표준화 X -> 유지, 보수 X
		// 3. 열거형 선언 형식
		//		enum 열거형이름 { 상수명, 상수명, ... };
		// 4. 열거형 -> 컴파일될 때, 클래스로 컴파일 됨
		//		열거형의 부모클래스는 java.lang.Enum 클래스이다.
		// 5. 열거형을 사용하는 방법 : 열거형이름.상수명
		// 6. Enum 클래스
		//		1) name() : 열거형 상수 "이름"을 문자열로 반환
		//		2) ordinal() : 열거형 상수가 정의된 "순서"를 반환
		//		3) valueOf() : name과 일치하는 "열거형 상수"를 반환 
		//		4) getDeclaringClass() : 열거형의 "class 객체" 반환
		
		Card[] cards = Card.values();
		for (Card card : cards) {
			System.out.printf( "%s\t%d\n", card.name(), card.ordinal() );
		}
		
		switch ( Card.valueOf("HEART") ) {
		case CLOVER:
			break;
		case HEART:
			System.out.println( "하트~~" );
			break;
		case DIAMOND:
			break;
		case SPADE:
			break;
		} //switch
		
	} //main
	
	class InnerA{}
	interface InnerIA{}
	enum InnerCard{}
	
}//class

class A{}
interface IA{}
// enum Card{}