package Education.Java.days11;

public class Ex01_03 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int max = m[0], maxCount =1;
		for (int i = 0; i < m.length; i++) {
			if(max == m[i]) maxCount++;
			else if(max < m[i]) {
				max = m[i];
				maxCount = 1;
			} //if
		} //for
		
		System.out.printf("> max : %d,  maxCount : %d\n", max, maxCount);
	} //main
} //class
