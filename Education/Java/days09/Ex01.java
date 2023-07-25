package Education.Java.days09;

public class Ex01 {
	public static void main(String[] args) {

		int money = 15420;
		int unit = 50000;			// 5, 2, 5, 2, ...
		boolean sw = false;		// 스위치 변수
		int count = 0;		// 화폐 갯수

		while (unit >= 1) {
			count = money/unit;
			System.out.printf("%d원 : %d\n", unit, count);
			money %= unit;

			unit /= !sw? 5 : 2;
			sw = !sw;
		} //while
		
	} //main
} //class