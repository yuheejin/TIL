package Education.Java.days11;

/**
 * @author heejin
 * @date 2023. 7. 27. - 오후 3:33:30
 * @subject	다차원 배열은 배열의 배열이다.
 * @content
 */
public class Ex07_03 {
	public static void main(String[] args) {
//		int [][][] m = new int[2][3][4];
//		
//		// 1. 배열의 크기 : 배열명.length
//		System.out.println(m.length);		//면 크기
//		System.out.println(m[0].length);	//행 크기
//		System.out.println(m[0][0].length);	//열 크기

		// 2. 3차원 배열의 초기화
		int [][][]m = {		{
								{ 1,2,3,4 },
								{ 5,6,7,8 } 
							},
							{	
								{ 1,2,3,4 },
								{ 5,6,7,8 } 
							}
						};
		dispM(m);
	} //main

	public static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {						// 면갯수
			System.out.printf("[%d]면\n",i);
			for (int j = 0; j < m[i].length; j++) {				// 행갯수
				for (int k = 0; k < m[i][j].length; k++) {	// 열갯수
					System.out.printf("m[%d][%d][%d]=%d  ", i, j, k, m[i][j][k]);
				} //for
				System.out.println();
			} //for
			System.out.println();
		} //for
	} //dispM

} //class
