package Education.Java.days07;

import util.Draw2D;
/**
 * @author heejin
 * @date 2023. 7. 21. - 오후 3:28:29
 * @subject	메서드(함수) 설명
 * @content	오버로딩 - 같은 이름의 메소드 선언 (메소드 중복 선언)
 * 					overloading
 */
public class Ex08_02 {
	public static void main(String[] args) {

		Draw2D.drawLine();
		System.out.println("부서명 : 사원명"); 
		Draw2D.drawLine(10);
		System.out.println("영업부 : 고경림");
		System.out.println("생산부 : 김성준");
		System.out.println("개발부 : 김성주");
		System.out.println("기획부 : 김호영"); 
		Draw2D.drawLine(15,'=');
		
	} //main
	
	
} //class
