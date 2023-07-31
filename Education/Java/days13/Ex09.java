package Education.Java.days13;

/**
 * @author heejin
 * @date 2023. 7. 31. - 오후 2:46:53
 * @subject	클래스의 복사(copy)와 복제(clone)
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		// 클래스 복사 (copy)
		
		// 클래스 복제 (clone)
		//			ㄴ 얉은 복제
		//			ㄴ 깊은 복제
		
		Point p = new Point();
		// 객체명.필드명
		p.x = 100;
		p.y = 200;
		
		// 클래스 복사 (동일한 인스턴스 참조)
		Point pcopy = p;
		pcopy.x = 1;
		System.out.println(p.x);
		
		// 클래스 복제
		Point pclone = new Point();
		pclone.x = p.x;
		pclone.y = p.y;
		
	} //main

} //class