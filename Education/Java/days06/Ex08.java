package Education.Java.days06;

public class Ex08 {
	public static void main(String[] args) {
		/*
		// i=1	j=1,2,3,4 + 개행  
		// i=2	j=1,2,3,4 + 개행  
		// i=3	j=1,2,3,4 + 개행  
		// i=4	j=1,2,3,4 + 개행  

		for (int i = 1; i <= 4; i++) {			// 행 갯수
			for (int j = 1; j <= 4; j++) {		// 열(별) 갯수
				System.out.print("*");
			} //for
			System.out.println();
		} //for
		 */

//				// [1]
//				for (int i = 1; i <= 4; i++) {
//					for (int j = 1; j <= i; j++) {
//						System.out.print("*");
//					} //for
//					System.out.println();
//				} //for

//				// [2]
//				for (int i = 1; i <= 4; i++) {
//					for (int j = 1; j <= 5-i; j++) {
//						System.out.print("*");
//					} //for
//					System.out.println();
//				} //for

//				// [3]
//				for (int i = 1; i <= 4; i++) {
//					for (int j = 1; j <= 4; j++) {
//						if(i>=5-j)  System.out.print("*");
//						else 	System.out.print("_");
//					} //for
//					System.out.println();
//				} //for

//						// [4]
//						for (int i = 1; i <= 4; i++) {
//							for (int j = 1; j <= 4; j++) {
//								if(i<=j)  System.out.print("*");
//								else 	System.out.print("_");
//							} //for
//							System.out.println();
//						} //for


//				// [5]
//				for (int i = 1; i <= 3; i++) {
//					for (int j = 1; j <= 5; j++) {
//						if(i<=4-j && i<=9-j)  System.out.print("*");
//						else 	System.out.print("_");
//					} //for
//					System.out.println();
//				} //for


//		// [6]
//		int size = 3;
//		for (int i = 1; i <= size; i++) {
//			System.out.println("_".repeat(size - i) + "*".repeat(2 * i - 1));
//		}
//
//		for (int i = size - 1; i >= 1; i--) {
//			System.out.println("_".repeat(size - i) + "*".repeat(2 * i - 1));
//		}
		/*
		// 윗부분 마름모 출력
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 아랫부분 마름모 출력
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

//				// [7]
//				for (int i = 1; i <= 5; i++) {
//					for (int j = 1; j <= 5; j++) {
//						if(i==j)  System.out.print("*");
//						else 	System.out.print("_");
//					} //for
//					System.out.println();
//				} //for

//				// [8]
//				for (int i = 5; i >= 1; i--) {
//					for (int j = 1; j <= 5; j++) {
//						if(i==j)  System.out.print("*");
//						else 	System.out.print("_");
//					} //for
//					System.out.println();
//				} //for


//				// [9]
//				for (int i = 1; i <= 5; i++) {
//					for (int j = 1; j <= 5; j++) {
//						if(i==j || i==6-j)  System.out.print("*");
//						else 	System.out.print("_");
//					} //for
//					System.out.println();
//				} //for

				// [10]
				for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= 5; j++) {
						if((i<=j && i<=6-j) || (i>=j && i>=6-j))  System.out.print("*");
						else 	System.out.print("_");
					} //for
					System.out.println();
				} //for



	} // main
} // class