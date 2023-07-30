package Education.Java.days12;

public class Ex01 {
	public static void main(String[] args) {
		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		int [][] n = new int[6][2];
		
//		// [1] 이중for문
//		int mIndex=0;
//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				n[i][j] = m[mIndex++];
//			} //for
//		} //for
		
		// [2] 규칙찾기
		for (int i = 0; i < n.length; i++) {
			n[i/2][i%2] = m[i];
		} //for
		
	} //main	
	
} //class