package Education.Java.days06;

public class Ex07 {
	public static void main(String[] args) {
		// [이름 붙은 반복문]
		// 이름이 붙은 반복문을 break 혹은 continue 함
		// 개행여부는 상관 없음
		//out : for (int i = 2; i < 10; i++) {
		out : 
			for (int i = 2; i < 10; i++) {
			in : for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%02d\t", i, j, i*j);
				if (j == 5) {
					//break out;
					continue out;
				} //if
			} //for
			System.out.println();
		} //for
	} // main
} // class








