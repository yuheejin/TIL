package Education.Java.days11;

public class Ex01_04 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		int [] mc = getArrayMaxAndCount(m);
		
		System.out.printf("> max : %d,  maxCount : %d\n", mc[0], mc[1]);
	} //main

	public static int[] getArrayMaxAndCount(int[] m) {
		int max = m[0], maxCount =1;
		for (int i = 0; i < m.length; i++) {
			if(max == m[i]) maxCount++;
			else if(max < m[i]) {
				max = m[i];
				maxCount = 1;
			} //if
		} //for
		
		// return new int[] {max, maxCount};
		int [] mc = new int[2];
		mc[0]=max;
		mc[1]=maxCount;
		return mc;
	} //getArrayMaxAndCount
} //class
