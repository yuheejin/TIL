package Education.Java.days04;

import java.util.Iterator;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 12:28:20
 * @subject 	switch 분기문
 * @content	for 반복문
 */
public class Ex05 {
	
	public static void main(String[] args) {
		
		/*
		for (int i = 0; i < args.length; i++) {
			System.out.println("홍길동");
		} //for
		*/
		
		/*
		 for(초기화; 조건식; 증감식) {
		 	조건이 참일 경우 실행하고자 하는 코드
		 }
		 */
		
		// 1~10 까지의 합 출력
		// 1+2+3+ ... +10 = 55
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			
			sum += i;
			
			if(i==10) {
				System.out.printf("%d=",i);
				break;
			} //if
			
			System.out.printf("%d+",i);
						
		} //for
		
		System.out.print(sum);
		
	} //main

} //class