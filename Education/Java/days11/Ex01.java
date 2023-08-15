package Education.Java.days11;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int [] m = {3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		int [] index =new int [m.length];
		int count=0;
		
		int max = m[0];
		for (int i = 1; i < m.length; i++) {
			if(max < m[i]) max = m[i];
		} //for
		System.out.println("max = " + max);
		
		for (int i = 0; i < m.length; i++) {
			if(m[i] == max) index[count++] = i;
		} //for
		
		System.out.print("index = ");
		for (int i=0; i<count;  i++) {
			System.out.print( ( i==0 ? " " : ", ") + index[i] );
		} //for
	} //main
} //class
