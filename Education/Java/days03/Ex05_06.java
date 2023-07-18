package Education.Java.days03;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 2:26:31
 * @subject 단항연산자 ++  --
 * 						ㄴ  증감연산자
 * @content 
 */
public class Ex05_06 {

	public static void main(String[] args) {

		// 어떤 기억 공간의 값을 1증가 시키는 코딩
		// 어떤 기억 공간의 값을 1감소 시키는 코딩
		int n = 10;
		System.out.println(n);  // 10

		// n = 11;
		
		// 1) n = n + 1 ;
		// 2) n += 1;	// 복합대입연산자 +=
		// 3) n++; 후위형 증감연산자  Ex05_07
		
		
		// 4) ++n;
		
		// n = n + 3 ;
		n += 3;
		
		// 1) n = n - 1 ;
		// 2) n -= 1;	// 복합대입연산자 -=
		// 3) n--; 
		// 4) --n;
		
		System.out.println(n);	// 11
		
		
		
	}//main

}//class
