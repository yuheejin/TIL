package Education.Java.days19;

import java.util.Objects;
import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		// [ Arrays 클래스 ]
		// [ Objects 클래스 ]
		Ex08 obj = null;
		
		// if (obj == null) {XX...}
		// if ( Objects.isNull(obj) )
		// Objects.isNull(obj);  	obj 객체가 null일때, true를 반환하는 메서드 : isNull()
		
		// if (obj != null) {XX...}
		// if ( Objects.nonNull(obj) )
		// Objects.nonNull(obj);	obj 객체가 null이 아닐때, true를 반환하는 메서드 : nonNull()
		
		/*
		if (obj == null) {
			new ~~ Exception("예외 메시지");
		} //if
		
		this.name = name;
		*/
		// this.name = Objects.requireNonNull(name, "예외 메시지");
		
		
		// if ( a!=null && a.equals(b) ) { }
		// if (Objects.equals(a, b)) { }
		
		// java.util.Random 클래스
		Random rnd = new Random();
		// rnd.nextBoolean();		// true, false를 랜덤하게 반환함
		// rnd.nextInt(bound);		// 0<= 정수 <bound
		
		
	} //main
} //class