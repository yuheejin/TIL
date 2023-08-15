package Education.Java.days08;

public class Ex11_02 {
	public static void main(String[] args) {
		int money = 125760;
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원 1백원, 5십원, 1십원, 5원, 1원
		// 5만원 : 2개
		// 1만원 : 2개
		// 5천원 : 1개
		// 1천원 : 0개
		// 5백원 : 1개
		// 1백원 : 2개
		// 5십원 : 1개
		// 1십원 : 1개
		//   5원 : 0개
		//   1원 : 0개

		int[] wons = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] wonsCount = new int[wons.length];

		for (int i = 0; i < wons.length; i++) {
			wonsCount[i] = money/wons[i];
			money = money%wons[i];
			System.out.printf("%d원 : %d개\n", wons[i], wonsCount[i]);
		} //for

	} //main

} //class