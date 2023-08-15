package Education.Java.days04;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오전 11:44:18
 * @subject
 * @content
 */
public class Ex04_02 {
	
	public static void main(String[] args) {
		
		// 국어 점수를 kor 변수에 입력받아서
		// 등급(grade)을 출력
		// 0~59 가 / 60~69 양 / 70~79 미 / 80~89 우 / 90~100 수
		// if 조건문	if~else 조건문
		
		try (Scanner sc = new Scanner(System.in)) {
		
			System.out.print("> 국어 점수 ?");
			int kor = sc.nextInt();
			
			
			// 중첩 if문
			// 앞에 나와있는 if문의 조건이 참일경우, 뒤에 있는 else if 문의 조건식은 확인하지 않고 넘어간다.
			if ( 0<=kor && kor<=100 ) {
				
				char grade = '수';
				
				// 수우미양가 등급
				if ( kor<=59 ) {
					grade = '가';	
				} else if(  kor<=69 ) {
					grade = '양';			
				} else if( kor<=79 ) {
					grade = '미';			
				} else if( kor<=89 ) {
					grade = '우';			
				} else {
					grade = '수';			
				} //if
				
				System.out.printf("grade = %d(%c)\n", kor, grade);
				
			} else {
				System.out.println("국어 점수 입력이 잘못되었습니다.");
			} //if
			
		} catch (Exception e) {
			// try 문에서 오류가 났을때, 에러 문구 출력함
			e.printStackTrace();
		} //try catch
		
	} //main

} //class