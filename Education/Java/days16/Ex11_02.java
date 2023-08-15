package Education.Java.days16;

public class Ex11_02 {
	public static void main(String[] args) {
		// 인터페이스 static메서드
		// Parseable.method1();
		
		String parsingFile = "hello.xml";
		String docType = "xml";
		
		// 자료형 : 인터페이스 Parseable (다형성)
		Parseable parser = ParserManager.getParse(docType);
		parser.parse(parsingFile);
		
		// 5년 지난 후에 출력(인쇄) 기능 추가
		parser.print();
		
		
	} //main
} //class

interface Parseable {
	// 구문 분석
	void parse( String fileName );

	// 5년후 추가되는  print()
	// default로 선언해야함. <- default로 선언하지 않으면 Parseable을 상속받은 class는 오버라이딩을 해야함 
	default void print() {
		System.out.println("각각 parser에서 각자의 인쇄기능 구현...");
	};
	
	// static 메서드
	static void method1() {
		System.out.println("기본 코딩...");
	}
} //interface Parseable


class XMLParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println("> XML 파일 구문 분석 코딩....");
	}
} //class XMLParser


class HTMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("> HTML 파일 구문 분석 코딩....");
	}
} //class HTMLParser


class ParserManager {
	//					리턴자료형 다형성
	public static Parseable getParse(String docType) {
		if ( docType.equals("xml") ) {
			return new XMLParser();
		} else if ( docType.equals("html") ) {
			return new HTMLParser();
		} else {
			return null;
		}	
	}
} //class ParserManager 