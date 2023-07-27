package Education.Java.days11;

/**
 * @author heejin
 * @date 2023. 7. 27. - 오후 3:11:20
 * @subject	다차원배열
 * @content	1차원배열, 2차원배열, 3차원배열 ...
 * 					[ 다차원배열은 배열의 배열이다. ]
 */
public class Ex06 {
	public static void main(String[] args) {
		// 1) 3학년  10반  30명
		// 국어점수 저장
		// 3*10*300 => 900
		// 3차원 배열 (면/행/열)
		int [][][] kors = new int [3][10][30];
		// 2학년 4반 15번 학생의 국어점수 입력 : 90
		kors[1][3][14] = 90;
		
		// 2학년 6반의 국어 평균?
		int sum=0;
		for (int i = 0; i < kors[1][5].length; i++) {
			sum += kors[1][5][i];
		} //for
		double avg = (double)sum / kors[1][5].length;
	} //main
} //class