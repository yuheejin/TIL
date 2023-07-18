package Education.Java.days04;


/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 2:28:14
 * @subject 
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		// if {명령라인 1줄}    {} 생략 가능
		// if (condition) 	System.out.println("1줄");
		
		// if (condition) System.out.println("1줄");			
		// else System.out.println("1줄");
		
		// for 문도 동일하게  {} 생략 가능
		for (int i = 0; i < args.length; i++) System.out.println("1줄");
		
		// for 뒤에 바로 세미콜론을 찍는 경우, 뒤에 {}는 별도의 블럭으로 인식한다.
		for (int i = 0; i < args.length; i++);  {}
		
		if (condition)
			System.out.println("1줄");
		System.out.println("2줄");
		
	} // main

} // class