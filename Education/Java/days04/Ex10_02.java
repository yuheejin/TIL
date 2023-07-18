package Education.Java.days04;

import java.util.Iterator;

/**
 * @author heejin
 * @date 2023. 7. 18. - 오후 4:17:58
 * @subject  컴퓨터 - 사용자(user) 가위,바위,보 게임
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		// 0.0 <=  Math.random() <= 1.0
		// 0.0 <=  Math.random()*3 <= 3.0
		// (int)0.0 <=  (int)Math.random()*3 <= (int) 3.0
		// (int)0 <=  (int)Math.random()*3 <= (int) 3
		// (int)1 <=  (int)Math.random()*3+1 <= (int) 4
		// 리턴타입 : double
		// 임의의 수 발생시키는 클래스.메서드
		for (int i = 0; i < 10; i++) {
			int v = (int)(Math.random()*3)+1;
			if ( v<1 || v>4 )
				System.out.println(v);
		} //for

		System.out.println("end");
		
		
	} // main

} // class