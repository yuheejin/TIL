package Education.Java.days06;


public class Ex03 {
	public static void main(String[] args) {

		//		알파벳(대,소문자) 코드 및 문자를 출력하는  코딩을 하세요.
		//		   ( 조건 : 한 라인에 10개씩 출력 )
		//		   
		//		   [실행결과]
		//			 A(065)B(066)C(067)D(068)E(069)F(070)G(071)H(072)I(073)J(074)
		//			 K(075)L(076)M(077)N(078)O(079)P(080)Q(081)R(082)S(083)T(084)
		//			 U(085)V(086)W(087)X(088)Y(089)Z(090)a(097)b(098)c(099)d(100)
		//			 e(101)f(102)g(103)h(104)i(105)j(106)k(107)l(108)m(109)n(110)
		//			 o(111)p(112)q(113)r(114)s(115)t(116)u(117)v(118)w(119)x(120)
		//			 y(121)z(122) 

		// 대문자 출력
		// 'a'를 만나면 개행을하고 10개씩 출력
		for (int i = 'A', count = 1,  lineNum = 1; i <= 'z'; i++) {

			if (i>'Z' && i <'a') continue;

			if (count%10 == 1) System.out.printf("%d : ", lineNum++);

			/*
			if (i == 'a') {
				System.out.printf("\n%d : ", lineNum++);
				count = 1;
			} //if
			 */

			System.out.printf("%1$c(%1$03d)", i);
			if (count++ %10 == 0) System.out.println();
			
			if (i == 'Z') {
				System.out.println();
				count = 1;
			} //if

		} //for

		/*
		int lineNum = 1;

		for (int i = 'A'; i <= 'z'; i++) {

			System.out.printf("%1$c(%1$03d)", i);

			if (lineNum++ %10 == 0)  System.out.println();

			if (i == 'Z') i = 'a'-1;

		} //for
		 */

	} //main
} //class
