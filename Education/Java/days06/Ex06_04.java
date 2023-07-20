package Education.Java.days06;


public class Ex06_04 {
	public static void main(String[] args) {
		
		for (int k = 1; k < 4; k++) {

			for (int dan = 3*k-1; (dan < 3*k+2) && (dan<10); dan++) {
				System.out.printf(" [%d]단\t\t",dan);
			} //for

			System.out.println();
			for (int i = 1; i < 10; i++) {
				
				for (int dan = 3*k-1; (dan < 3*k+2) && (dan<10); dan++) {
					System.out.printf("%d*%d=%d\t", dan, i, dan*i);
				} //for
				System.out.println();
				
			} //for

			System.out.println();	
		} //for
		
		/*
		for (int k = 1; k < 4; k++) {

			for (int dan = 3*k-1; dan < 3*k+2; dan++) {
				if (dan == 10) continue;
				System.out.printf(" [%d]단\t\t",dan);
			} //for

			System.out.println();
			for (int i = 1; i < 10; i++) {
				
				for (int dan = 3*k-1; dan < 3*k+2; dan++) {
					if (dan == 10) continue;
					System.out.printf("%d*%d=%d\t", dan, i, dan*i);
				} //for
				System.out.println();
				
			} //for

			System.out.println();	
		} //for
		*/
		

		/*
		// 2~4단 / 5~7단 / 8~9단
		for (int k = 1; k < 3; k++) {

			for (int i = 4*k-2; i < 4*k+2; i++) {
				System.out.printf(" [%d]단\t\t",i);
			} //for

			System.out.println();
			for (int i = 1; i < 10; i++) {

				for (int dan = 4*k-2; dan < 4*k+2; dan++) {
					System.out.printf("%d*%d=%d\t", dan, i, dan*i);

				} //for

				System.out.println();

			} //for

			System.out.println();	
		} //for
		 */

		/*
		// 2~5단 / 6~9단
		for (int i = 2; i < 6; i++) {
			System.out.printf(" [%d]단\t\t",i);
		} //for

		System.out.println();
		for (int i = 1; i < 10; i++) {

				for (int dan = 2; dan < 6; dan++) {
					System.out.printf("%d*%d=%d\t", dan, i, dan*i);

				} //for

			System.out.println();

		} //for


		System.out.println();



		for (int i = 6; i < 10; i++) {
			System.out.printf(" [%d]단\t\t",i);
		} //for

		System.out.println();
		for (int i = 1; i < 10; i++) {

				for (int dan = 6; dan < 10; dan++) {
					System.out.printf("%d*%d=%d\t", dan, i, dan*i);

				} //for

			System.out.println();

		} //for

		 */

	} // main
} // class