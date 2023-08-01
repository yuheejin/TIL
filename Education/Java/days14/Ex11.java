package Education.Java.days14;

public class Ex11 {
	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();
	} //main
} //class


// 문서
class Document {
	String fileName;		// 문서명
	static int count=1;	// 문서번호

	{
		count++;
		System.out.println("인스턴스 초기화 블럭 실행... ");
	}

	public Document() {
		// Cannot refer to an instance field count while explicitly invoking a constructor
		// 생성자를 명시적으로 호출할때는 인스턴스 필드를 참조할 수 없다.
		// int count=1; -> static int count=1; 
		this(String.format("Noname%d.txt", count));
		// Constructor call must be the first statement in a constructor
		// 생성자 안에서 다시 생성자를 호출해야한다면 호출라인은 반드시 첫번째 라인에 있어야 한다.
		// this(fileName);
	}

	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n",this.fileName);
	}

} //class Document